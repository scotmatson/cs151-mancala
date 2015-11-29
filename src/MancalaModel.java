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
public class MancalaModel extends Observable
{
   /**

    TODO: turns, stones (live, captured, position), previous turn
    */

   private boolean playerOneTurn;
   private boolean playerTwoTurn;
   private ArrayList<Pit> pits;
   private ArrayList<Stone> stones;
   private Mancala mancala1;
   private Mancala mancala2;


   // THEME VARIABLES, PERHAPS MOVE INTO A LIST LATER
   // private Color backgroundColor
   private Color boardColor;
   private Color pitColor;
   private Color stoneColor;
   // private Color textColor

   public MancalaModel()
   {
      pits = new ArrayList<>();
      stones = new ArrayList<>();

      mancala1 = new Mancala();
      mancala2 = new Mancala();

      playerOneTurn = true;
      playerTwoTurn = false;

      for (int i = 0; i < 12; i++)
      {
         pits.add(new Pit());
         for (int j = 0; j < 4; j++)
         {
            Stone tempStone = new Stone();
            pits.get(i).incrementCup(tempStone);
            stones.add(tempStone);
         }
      }
      // TODO: Stores game logic.
   }

   /**
    Gets the color of the board
    @return a Color object
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

    @param i
    @return
    */
   public Stone getStones(int i)
   {
      return stones.get(i);
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

   /**

    @param i
    @return
    */
   public Pit getPit(int i)
   {
      return pits.get(i);
   }

   /**
    * This function is meant to perform the logic representing which pit a player
    * will select. If he selects the other player's pits or a mancala then error handeling
    * should be performed
    * @return integer representing the cup number selected;
     */
   public int selectPit() {
      int pitSelected = 0;

      if (playerOneTurn) {}
      else {}

      return pitSelected;
   }

   // TODO: remove method as it's only useful for testing game logic
   public void printCurrentState()
   {
      String actualGame = "    ";
      for (int i = 0; i < 6; i++)
      {
         actualGame += pits.get(i).getSize() + " ";
      }

      actualGame += "\n" + mancala1.size() + "                    " + mancala2.size() + "\n    ";
      for (int i = 0; i < 6; i++)
      {
         actualGame += pits.get(i + 6).getSize() + " ";
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
