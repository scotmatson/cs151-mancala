import java.awt.*;
import java.util.ArrayList;

/**
 Created by scot on 11/14/15.
 */
public class Mancala extends GameBoardTile
{
   private int mancalaID;

   /**
    Constructor method for the Mancala class.
    */
   public Mancala(int x, int y, int w, int h, Color c, int pid)
   {
      super(x, y, w, h, c);
      mancalaID = pid;
   }

   //public void addPit(Stone newStone) { stoneContainer.add(newStone); }

   //public int size() { return stoneContainer.size(); }

   //public int getMancalaID() { return mancalaID; }


   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      // TODO: Add stones here
   }
}
