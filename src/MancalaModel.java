import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;

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
    Just a reminder:

    Model - The model represents data and the rules that govern access
    to and updates of this data. In enterprise software, a model often
    serves as a software approximation of a real-world process.

    TODO: turns, stones (live, captured, position), previous turn
    */

   private boolean playerOneTurn;
   private boolean playerTwoTurn;
   private ArrayList<Pit> pits;
   private ArrayList<Stone> stones;
   private Mancala mancala1; // Mancala for player one
   private Mancala mancala2; // Mancala for player two


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

    @param i
    @return
    */
   public Stone getStones(int i)
   {
      return stones.get(i);
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
}
