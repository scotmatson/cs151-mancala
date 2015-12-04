import java.awt.*;
import java.util.ArrayList;


public class Pit extends GameBoardTile implements Drawable
{
   private ArrayList<Stone> stoneContainer;

   public Pit(int x, int y, int w, int h, Color c)
   {
      super(x, y, w, h, c);
      stoneContainer = new ArrayList<>();
   }

   /**
    * @param newStone
    */
   public void populatePit(ArrayList<Stone> newStone)
   {
       for (int i = 0; i < newStone.size(); i++)
       {
           stoneContainer.add(newStone.get(i));
       }
   }

   /**
    * Returns the size of each pit
    * @return
    */
   public int pitCount()
   {
       return stoneContainer.size();
   }

   /**
    * @param addStone
    */
   public void incrementPit(Stone addStone)
   {
       stoneContainer.add(addStone);
   }

   /**
    * @return
    */
   public ArrayList<Stone> unpopulatePit()
   {
       return stoneContainer;
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      // TODO: Add stones here... maybe
   }
}