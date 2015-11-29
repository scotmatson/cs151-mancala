import java.util.ArrayList;

/**
 Created by scot on 11/14/15.
 */
public class Mancala extends GameObject
{
   private int mancalaID;
   private ArrayList<Pit> pitContainer;

   /**
    Constructor method for the Mancala class.
    */
   public Mancala()
   {
      mancalaID = super.getCount();
      pitContainer = new ArrayList<Pit>();

      /**
       A mancala is the name of the pits on the side of the game board (and oddly
       also the name of the game). So essentially
       a specialized type of pit. They have no stone limit and are used to determine
       the winner of the game.


       */
   }

   public void addPit(Pit newPit) { pitContainer.add(newPit); }

   public int size() { return pitContainer.size(); }

   public int getMancalaID() { return mancalaID; }
}
