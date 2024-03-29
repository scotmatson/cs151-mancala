import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 A generic game board

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/10/26

 */
public abstract class GameBoard extends JPanel implements Drawable
{
   Shape board;
   private final int BORDER_RADIUS = 50;
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   private Color color;

   /**
    Constructor method for the GameBoard class.
    @param x the x-position of the game board.
    @param y the y-position of the game board.
    @param width the width of the game board.
    @param height the height of the game board.
    @param c the color of the game board.
    */
   public GameBoard(int x, int y, int width, int height, Color c)
   {
      this.xPos = x;
      this.yPos = y;
      this.width = width;
      this.height = height;
      this.color = c;
      board = new RoundRectangle2D.Double(x, y, width, height, BORDER_RADIUS, BORDER_RADIUS);
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
    Get the width of the game board
    @return the current width
    */
   public int getWidth()
   {
      return width;
   }

   /**
    Sets the width of the game board
    @param width the width to set
    */
   public void setWidth(int width)
   {
      this.width = width;
   }

   /**
    Gets the height of the board
    @return the current height
    */
   public int getHeight()
   {
      return height;
   }

   /**
    Sets the height of the board
    @param height the height to set
    */
   public void setHeight(int height)
   {
      this.height = height;
   }

   /**
    Sets the color of the board
    @param c the color to set
    */
   public void setColor(Color c)
   {
      this.color = c;
   }

   /**
    Gets the color of the board
    @return the current color
    */
   public Color getColor()
   {
      return color;
   }

   /**
    Draws a game board template
    @param g a Graphics object
    */
   public void draw(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(color);
      g2.fill(board);
      g2.dispose();
   }
}