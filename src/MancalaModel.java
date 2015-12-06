import java.awt.*;
import java.lang.System;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.
 * <p/>
 * Model class for Mancala game.
 * <p/>
 * Solves CS151 Project - Mancala Game
 *
 * @author Scot Matson
 * @version 1.01 2015/11/14
 */
public class MancalaModel extends Observable // Shouldn't this be an observer updating other observable objects?
{
    // Logic Variables
    private boolean playerOneTurn;
    private boolean playerTwoTurn;
    private int numberOfPits;
    private int numberOfStonesPerPit;
    /*
     * The first half of the pits array are for player one
     * The second half are for player two
     * pits(i + numberOfPits/2 is the pit parallel to player two)
     * pits(i - numberOfPits/2 is the pit parallel to player one)
     *
     * mancalas(0) is player one's mancala
     * mancalas(1) is player two's mancala
     */
    private ArrayList<Integer> pits;
    private ArrayList<Integer> mancalas;

    // THEME VARIABLES, PERHAPS MOVE INTO A LIST LATER
    // private Color backgroundColor
    private Color boardColor;
    private Color pitColor;
    private Color stoneColor;
    // private Color textColor
    private Color statusPaneColor;

    public MancalaModel(int numOfPits, int numOfStonePP, Color bColor,
                        Color pColor, Color sColor) {
        // Theme Variable Settings
        pitColor = pColor;
        boardColor = bColor;
        stoneColor = sColor;

        // Game Variables
        playerOneTurn = true;
        playerTwoTurn = false;

        numberOfPits = numOfPits;
        numberOfStonesPerPit = numOfStonePP;

        pits = new ArrayList<>();

        mancalas = new ArrayList<>();
        mancalas.add(0);
        mancalas.add(0);

        for (int i = 0; i < numberOfPits; i++) pits.add(numberOfStonesPerPit);
    }

    // Set to Defaults
    public MancalaModel() {
        // Theme Variable Settings
        pitColor = Color.white;
        boardColor = Color.orange;
        stoneColor = Color.black;

        // Game Variables
        playerOneTurn = true;
        playerTwoTurn = false;

        numberOfPits = 12;
        numberOfStonesPerPit = 4;

        pits = new ArrayList();

        mancalas = new ArrayList();
        mancalas.add(0);
        mancalas.add(0);

        for (int i = 0; i < numberOfPits; i++) pits.add(numberOfStonesPerPit);
        // TODO: Stores game logic.
    }


   /**
    Gets the color of the status pane
    @return the color of the status pane
    */
   public Color getStatusPaneColor()
   {
      return statusPaneColor;
   }

   /**
    Sets the color of the status pane
    @param statusPaneColor the color to set the status pane
    */
   public void setStatusPaneColor(Color statusPaneColor)
   {
      this.statusPaneColor = statusPaneColor;
      setChanged();
   }

   /**
     * This function is meant to perform the logic representing which pit a player
     * selects and distributes stones accordingly.
     *
     * @return boolean value returns when finished
     */
    private boolean distributeStones(int pitNumber) { // Should be private/ only pit selector should use it
        int currentPit = pitNumber;

        while (pits.get(pitNumber) > 0) {
            // More logic here
            switch (currentPit) {
                case 0:
                    currentPit = -1;
                    mancalas.set(0, mancalas.get(0) + 1);
                    pits.set(pitNumber, pits.get(pitNumber) - 1);
                    break;
                case 11:
                    currentPit = -2;
                    mancalas.set(1, mancalas.get(1) + 1);
                    pits.set(pitNumber, pits.get(pitNumber) - 1);
                    break;
                case -1:
                    currentPit = 6;
                    pits.set(pitNumber, pits.get(pitNumber) - 1);
                    pits.set(currentPit, pits.get(currentPit) + 1);
                    break;
                case -2:
                    currentPit = 5;
                    pits.set(pitNumber, pits.get(pitNumber) - 1);
                    pits.set(currentPit, pits.get(currentPit) + 1);
                    break;
                default:
                    if (currentPit <= 5) --currentPit;
                    else if (currentPit >= 6) ++currentPit;
                    pits.set(pitNumber, pits.get(pitNumber) - 1);
                    pits.set(currentPit, pits.get(currentPit) + 1);
                    break;
            }
        }

        if (currentPit == -1 && playerOneTurn == false) {
            playerOneTurn = true;

        } else if (currentPit == -2 && playerTwoTurn == false) {
            playerTwoTurn = true;

        } else if (currentPit > -1 && pits.get(currentPit) == 1) // Almost but not quite done
        {
            if (currentPit > 5 && playerTwoTurn == false) {
                int temp = mancalas.get(1);
                mancalas.set(1, temp + pits.get(currentPit - 6) + 1);
                pits.set(currentPit, 0);
                pits.set(currentPit - 6, 0);

            } else if (currentPit < 6 && playerOneTurn == false) {
                int temp = mancalas.get(0);
                mancalas.set(0, temp + pits.get(currentPit + 6) + 1);
                pits.set(currentPit, 0);
                pits.set(currentPit + 6, 0);
            }
        }
        setChanged();
        notifyObservers();
        return true; // returns a value that stating successful completion
    }

    /**
     * Returns 1 if player one is true else player 2s turn
     *
     //* @param player
     * @return
     */
    public int getCurrentPlayer() {
        if (playerOneTurn == true) {
            System.out.print("Dogs"); // TODO: Testing I guess? Why does this say dogs?
            return 1;
        } else {
            return 2;
        }
    }

    public boolean pitSelector(int pitSelected) {
        if (playerOneTurn && pitSelected >= 0 && pitSelected < 6) {
            playerOneTurn = false;
            playerTwoTurn = true;
            return distributeStones(pitSelected);
        } else if (playerTwoTurn && pitSelected > 5 && pitSelected < 12) {
            playerOneTurn = true;
            playerTwoTurn = false;
            return distributeStones(pitSelected);
        }

        return false; // Returns a negative value when the pit wanted cannot be selected
    }

   public int getNumberOfPits() { return numberOfPits; }

   /**
    * Meant to be an easy and straight forward way to reset the entire game.
    * @param numOfPits
    * @param numOfStones
    */
    public void resetGame (int numOfPits, int numOfStones)
    {
        numberOfPits = numOfPits;
        numberOfStonesPerPit = numOfStones;
        mancalas.set(0, 0);
        mancalas.set(1, 0);

        pits = new ArrayList<>();
        for (int i = 0; i < numOfPits; i++) pits.add(numOfStones);
    }

   /**
    * Same as above just with basic reset
    */
   public void resetGame()
   {
      mancalas.set(0, 0);
      mancalas.set(0, 0);
      for (int i = 0; i < pits.size(); i++) pits.add(numberOfStonesPerPit);
   }
    /**
     * Returns color of board
     *
     * @return Color
     */
    public Color getBoardColor() {
        return boardColor;
    }

    /**
     * Set the color of the board
     *
     * @param boardColor a Color object
     */
    public void setBoardColor(Color boardColor) {
        this.boardColor = boardColor;
        setChanged();
    }

    /**
     * Get the color of the stones
     *
     * @return a Color object
     */
    public Color getStoneColor() {
        return stoneColor;
    }

    /**
     * @param pitNumber
     * @return number of stones in the pit
     */
    public int getStonesInPit(int pitNumber) {
        return pits.get(pitNumber);
    }

    /**
     //* @param pitNumber
     * @return number of stones in mancala
     */
    public int getStonesInMancala(int mancalaNumber) {
        return mancalas.get(mancalaNumber);
    }

    /**
     * Set the color of the stones
     *
     * @param stoneColor a Color object
     */
    public void setStoneColor(Color stoneColor) {
        this.stoneColor = stoneColor;
        setChanged();
    }

    /**
     * Get the color of the pits
     *
     * @return a Color object
     */
    public Color getPitColor() {
        return pitColor;
    }

    /**
     * Set the color of the pits
     *
     * @param pitColor a Color object
     */
    public void setPitColor(Color pitColor) {
        this.pitColor = pitColor;
        setChanged();
    }


    // TODO: remove method as it's only useful for testing game logic
    public void printCurrentState() {
        String actualGame = "    ";
        for (int i = 0; i < 6; i++) {
            actualGame += pits.get(i) + " ";
        }

        actualGame += "\n" + mancalas.get(0) + "                    " + mancalas.get(1) + "\n    ";
        for (int i = 0; i < 6; i++) {
            actualGame += pits.get(i + 6) + " ";
        }

        System.out.println(actualGame);
        System.out.println("It is player one's turn? " + playerOneTurn);
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    /**
     * Notifies observers of changes to the model
     */
    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}
