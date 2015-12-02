import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Interface for drawing graphics

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/10/26

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
}
