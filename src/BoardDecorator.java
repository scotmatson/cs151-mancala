import javax.swing.*;
import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Abstract class for extending functionality of a GameBoard object

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/12/05

 */
public abstract class BoardDecorator extends JPanel implements Drawable
{
   protected Drawable decoratedDrawable;

   /**
    Constructor method for the BoardDecorator class
    @param decoratedDrawable
    */
   public BoardDecorator(Drawable decoratedDrawable)
   {
      this.decoratedDrawable = decoratedDrawable;
   }

   /**
    Gets the x-coordinate
    @return the x-coordinate
    */
   @Override
   public int getX()
   {
      return decoratedDrawable.getX();
   }

   /**
    Sets the x-coordinate
    @param x the new x-coordinate
    */
   @Override
   public void setX(int x)
   {
      decoratedDrawable.setX(x);
   }

   /**
    Gets the y-coordinate
    @return the y-coordinate
    */
   @Override
   public int getY()
   {
      return decoratedDrawable.getY();
   }

   /**
    Sets the y-coordinate
    @param y the new y-coordinate
    */
   @Override
   public void setY(int y)
   {
      decoratedDrawable.setY(y);
   }

   /**
    Get the width of the game board
    @return the current width
    */
   public int getWidth()
   {
      return decoratedDrawable.getWidth();
   }

   /**
    Sets the width of the game board
    @param w the width to set
    */
   public void setWidth(int w)
   {
      decoratedDrawable.setWidth(w);
   }

   /**
    Gets the height of the board
    @return the current height
    */
   public int getHeight()
   {
      return decoratedDrawable.getHeight();
   }

   /**
    Sets the height of the board
    @param h the height to set
    */
   public void setHeight(int h)
   {
      decoratedDrawable.setHeight(h);
   }

   /**
    Sets the color of the board
    @param c the color to set
    */
   public void setColor(Color c)
   {
      decoratedDrawable.setColor(c);
   }

   /**
    Gets the color of the board
    @return the current color
    */
   public Color getColor()
   {
      return decoratedDrawable.getColor();
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