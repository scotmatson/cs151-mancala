import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 // TODO: Add description

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/12/01

 */
public abstract class BoardDecorator implements Drawable
{
   protected Drawable decoratedDrawable;
   private Color color;

   public BoardDecorator(Drawable decoratedDrawable)
   {
      this.decoratedDrawable = decoratedDrawable;
   }

   /**
    Gets the board color
    @return a Color object
    */
   @Override
   public Color getColor()
   {
      return color;
   }

   /**
    Sets the board color
    @param c a Color object
    */
   @Override
   public void setColor(Color c)
   {
      color = c;
   }

   /**
    Draws a game board
    @param g a Graphics object
    */
   public void draw(Graphics g)
   {
      decoratedDrawable.draw(g);
   }
}