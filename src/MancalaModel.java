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

    TODO: turns, pits (live, captured, position), previous turn
    */

   private boolean playerOneTurn;
   private boolean playerTwoTurn;
   private ArrayList<Cup> cups;

   public MancalaModel()
   {
      playerOneTurn = true;
      playerTwoTurn = false;
      for (int i = 0; i < 12; i++) {
         cups.add(new Cup());
         for (int j = 0; j < 4; j++) cups.get(i).incrementPit()
      }

      // TODO: Stores game logic.
   }
}
