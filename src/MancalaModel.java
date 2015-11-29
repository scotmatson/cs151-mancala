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
public class MancalaModel implements Observer
{
   /**
    Just a reminder:

    Model - The model represents data and the rules that govern access
    to and updates of this data. In enterprise software, a model often
    serves as a software approximation of a real-world process.

    TODO: turns, pits (live, captured, position), previous turn
    */

   private boolean playerOneTurn;
   private boolean playerTwoTurn;
   private ArrayList<Cup> cups;
   private ArrayList<Pit> pits;
   private Mancala mancala1; // Mancala for player one
   private Mancala mancala2; // Mancala for player two

   public MancalaModel()
   {
      cups = new ArrayList<Cup>();
      pits = new ArrayList<Pit>();

      mancala1 = new Mancala();
      mancala2 = new Mancala();

      playerOneTurn = true;
      playerTwoTurn = false;

      for (int i = 0; i < 12; i++) {
         cups.add(new Cup());
         for (int j = 0; j < 4; j++) {
            Pit tempPit = new Pit();
            cups.get(i).incrementCup(tempPit);
            pits.add(tempPit);
         }
      }
      // TODO: Stores game logic.
   }

   public Pit getPit(int i) { return pits.get(i); }
   public Cup getCup(int i) { return cups.get(i); }

   /**
    * This function is meant to perform the logic representing which cup a player
    * will select. If he selects the other player's cups or a mancala then error handeling
    * should be performed
    * @return integer representing the cup number selected;
     */
   public int selectCup() {
      int cupSelected = 0;

      if (playerOneTurn) {}
      else {}

      return cupSelected;
   }

   // TODO: remove method as it's only useful for testing game logic
   public void printCurrentState() {
      String actualGame = "    ";
      for (int i = 0; i < 6; i++) actualGame += cups.get(i).getSize() + " ";
      actualGame += "\n" + mancala1.size() + "                    " + mancala2.size() + "\n    ";
      for (int i = 0; i < 6; i++) actualGame += cups.get(i + 6).getSize() + " ";

      System.out.println(actualGame);
      System.out.println("It is player one's turn? " + playerOneTurn);
   }

   @Override
   public void update(Observable observable, Object o) {

   }
}
