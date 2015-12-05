import java.awt.*;
import java.util.ArrayList;


public class Pit extends GameBoardTile implements Drawable
{
   private int pitID;

   public Pit(int x, int y, int w, int h, Color c, int pitNumber)
   {
      super(x, y, w, h, c);
      pitID = pitNumber;
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      // TODO: Add stones here... maybe
   }
}