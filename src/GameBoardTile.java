import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 Created by scot on 12/3/15.
 */
public abstract class GameBoardTile implements Drawable
{
   Shape tile;
   private final int BORDER_RADIUS = 50;
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   private Color color;

   public GameBoardTile(int x, int y, int w, int h, Color c)
   {
      xPos = x;
      yPos = y;
      width = w;
      height = h;
      color = c;
      tile = new RoundRectangle2D.Double(x, y, width, height, BORDER_RADIUS, BORDER_RADIUS);
   }

   /**
    Gets the x-coordinate
    @return the x-coordinate
    */
   @Override
   public int getX()
   {
      return xPos;
   }

   /**
    Sets the x-coordinate
    @param x the new x-coordinate
    */
   @Override
   public void setX(int x)
   {
      xPos = x;
   }

   /**
    Gets the y-coordinate
    @return the y-coordinate
    */
   @Override
   public int getY()
   {
      return yPos;
   }

   /**
    Sets the y-coordinate
    @param y the new y-coordinate
    */
   @Override
   public void setY(int y)
   {
      yPos = y;
   }

   /**
    Get the width of the game tile
    @return the current width
    */
   public int getWidth()
   {
      return width;
   }

   /**
    Sets the width of the game tile
    @param width the width to set
    */
   public void setWidth(int width)
   {
      this.width = width;
   }

   /**
    Gets the height of the tile
    @return the current height
    */
   public int getHeight()
   {
      return height;
   }

   /**
    Sets the height of the tile
    @param height the height to set
    */
   public void setHeight(int height)
   {
      this.height = height;
   }

   /**
    Sets the color of the tile
    @param c the color to set
    */
   public void setColor(Color c)
   {
      this.color = c;
   }

   /**
    Gets the color of the tile
    @return the current color
    */
   public Color getColor()
   {
      return color;
   }

   public void draw(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(color);
      g2.fill(tile);
      g2.dispose();
   }
}
