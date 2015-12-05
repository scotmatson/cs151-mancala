import java.awt.*;
import java.util.ArrayList;

/**
 Created by scot on 11/14/15.
 */
public class Mancala extends GameBoardTile
{
   private int mancalaID;
   private ArrayList<Stone> stoneContainer;

   /**
    Constructor method for the Mancala class.
    */
   public Mancala(int x, int y, int w, int h, Color c)
   {
      super(x, y, w, h, c);
      //mancalaID = super.getCount();
      stoneContainer = new ArrayList<Stone>();
      System.out.println("Mancala Board Constructor");
   }

   //public void addPit(Stone newStone) { stoneContainer.add(newStone); }

   //public int size() { return stoneContainer.size(); }

   //public int getMancalaID() { return mancalaID; }


   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      System.out.println("M D");
   }

   @Override
   protected void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      System.out.println("M PC");
   }
}
