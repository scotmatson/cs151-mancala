import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Interface for drawing graphics

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/12/5

 */
public interface Drawable
{
   /**
    Method for drawing graphics.
    @param g a Graphics object
    */
   public void draw(Graphics g);

   /**
    Gets the color
    @return a Color object
    */
   public Color getColor();

   /**
    Sets the color
    @param c a Color object
    */
   public void setColor(Color c);

   /**
    Gets the x-coordinate
    @return the x-coordinate
    */
   public int getX();

   /**
    Sets the x-coordinate
    @param x the new x-coordinate
    */
   public void setX(int x);

   /**
    Gets the y-coordinate
    @return the y-coordinate
    */
   public int getY();

   /**
    Sets the y-coordinate
    @param y the new y-coordinate
    */
   public void setY(int y);

   /**
    Gets the width
    @return the width
    */
   public int getWidth();

   /**
    Sets the width
    @param w the new width
    */
   public void setWidth(int w);

   /**
    Gets the height
    @return the height
    */
   public int getHeight();

   /**
    Sets the height
    @param h the new height
    */
   public void setHeight(int h);
}
