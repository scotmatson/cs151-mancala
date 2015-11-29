import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 Created by scot on 11/14/15.
 */
public class Mancala extends Pit implements Observer
{
   private int mancalaID;
   private ArrayList<Stone> stoneContainer;

   /**
    Constructor method for the Mancala class.
    */
   public Mancala(int x, int y, int width, int height, Color c)
   {
      super(x, y, width, height, c);
      //mancalaID = super.getCount();
      //stoneContainer = new ArrayList<Stone>();

      /**
       A mancala is the name of the pits on the side of the game board (and oddly
       also the name of the game). So essentially
       a specialized type of pit. They have no stone limit and are used to determine
       the winner of the game.


       */
   }

   //public void addPit(Stone newStone) { stoneContainer.add(newStone); }

   //public int size() { return stoneContainer.size(); }

   //public int getMancalaID() { return mancalaID; }

   @Override
   public void update(Observable o, Object arg)
   {
      // Updates the number of stones in this mancala
   }
}
