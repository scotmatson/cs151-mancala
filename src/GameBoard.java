import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 A generic game board class.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/11/14

 */
public abstract class GameBoard extends JComponent
{
   private Color boardColor;
   RoundRectangle2D board;

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
      boardColor = c;
      board = new RoundRectangle2D.Double(x, y, width, height, 50, 50);
   }

   //public RoundRectangle2D getBoard()
   //{
   //   return board;
   //}

   public Color getBoardColor()
   {
      return boardColor;
   }

   public void setBoardColor(Color c)
   {
      boardColor = c;
   }

   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;

      g2.setColor(boardColor);
      g2.fill(board);
      g2.dispose();
   }
}
