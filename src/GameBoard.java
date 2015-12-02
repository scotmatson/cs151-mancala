import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 A generic game board class.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.02 2015/12/01

 */
public abstract class GameBoard implements Drawable
{
   private Color color;
   RoundRectangle2D board;
   private int xPos;
   private int yPos;
   private int width;
   private int height;

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
      board = new RoundRectangle2D.Double(x, y, width, height, 50, 50);
   }

   /**
    Sets the color of the board
    @param c a Color object
    */
   public void setColor(Color c)
   {
      this.color = c;
   }

   /**
    Gets the color of the board
    @return a Color object
    */
   public Color getColor()
   {
      return color;
   }

   public void draw(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(color);
      g2.fill(board);
      g2.dispose();
   }
}