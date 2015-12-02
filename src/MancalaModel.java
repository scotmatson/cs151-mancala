import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Model class for Mancala game.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/11/14

 */
public class MancalaModel extends Observable // Shouldn't this be an observer updating other observable objects?
{
   /**

    TODO: turns, stones (live, captured, position), previous turn
    */

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

   public MancalaModel(int numOfPits, int numOfStonePP, Color bColor,
                       Color pColor, Color sColor)
   {
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
   public MancalaModel()
   {
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
    * This function is meant to perform the logic representing which pit a player
    * selects. If he selects the other player's pits or a mancala then error handeling
    * should be performed
    * @return integer representing the cup number selected;
     */
   public boolean distributeStones(int pitNumber){
      int currentPit = pitNumber;
      int pastValue;
      boolean lastGemInMancala = false;

      while(pits.get(pitNumber) > 0){
         // More logic here
      }

      return true; // returns a value that stating successful completion
   }

   public boolean pitSelector(int pitSelected)
   {
      if (playerOneTurn && pitSelected >= 0 && pitSelected < 6) {
         playerOneTurn = false;
         playerTwoTurn = true;
         return distributeStones(pitSelected);
      }
      else if (playerTwoTurn && pitSelected > 5 && pitSelected < 12) {
         playerOneTurn = true;
         playerTwoTurn = false;
         return distributeStones(pitSelected);
      }

      return false; // Returns a negative value when the pit wanted cannot be selected
   }

   /**
    * Returns color of board
    * @return Color
    */
   public Color getBoardColor()
   {
      return boardColor;
   }

   /**
    Set the color of the board
    @param boardColor a Color object
    */
   public void setBoardColor(Color boardColor)
   {
      this.boardColor = boardColor;
      setChanged();
   }

   /**
    Get the color of the stones
    @return a Color object
    */
   public Color getStoneColor()
   {
      return stoneColor;
   }

   /**
    Set the color of the stones
    @param stoneColor a Color object
    */
   public void setStoneColor(Color stoneColor)
   {
      this.stoneColor = stoneColor;
      setChanged();
   }

   /**
    Get the color of the pits
    @return a Color object
    */
   public Color getPitColor()
   {
      return pitColor;
   }

   /**
    Set the color of the pits
    @param pitColor a Color object
    */
   public void setPitColor(Color pitColor)
   {
      this.pitColor = pitColor;
      setChanged();
   }


   // TODO: remove method as it's only useful for testing game logic
   public void printCurrentState()
   {
      String actualGame = "    ";
      for (int i = 0; i < 6; i++)
      {
         actualGame += pits.get(i) + " ";
      }

      actualGame += "\n" + mancalas.get(0) + "                    " + mancalas.get(1) + "\n    ";
      for (int i = 0; i < 6; i++)
      {
         actualGame += pits.get(i + 6) + " ";
      }

      System.out.println(actualGame);
      System.out.println("It is player one's turn? " + playerOneTurn);
   }

   @Override
   public synchronized void addObserver(Observer o)
   {
      super.addObserver(o);
   }

   /**
    Notifies observers of changes to the model
    */
   @Override
   public void notifyObservers()
   {
      super.notifyObservers();
   }
}
