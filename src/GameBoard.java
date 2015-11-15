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
public abstract class GameBoard extends JPanel
{
   private final double BOARD_WIDTH;
   private final double BOARD_HEIGHT;
   private Color surface;
   private int numberOfPlayers;

   // TODO: Other definable properties of a generic board?

   public GameBoard(double width, double height, Color c, int playerCount)
   {
      BOARD_WIDTH = width;
      BOARD_HEIGHT = height;
      surface = c;
      numberOfPlayers = playerCount;
   }

   public Dimension getPreferredSize()
   {
      return new Dimension((int)BOARD_WIDTH, (int)BOARD_HEIGHT);
   }

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;

      RoundRectangle2D board = new RoundRectangle2D.Double(0, 0, BOARD_WIDTH, BOARD_HEIGHT, 50, 50);
      g2.draw(board);

   }

   public double getBoardWidth()
   {
      return BOARD_WIDTH;
   }

   public double getBoardHeight()
   {
      return BOARD_HEIGHT;
   }

   public Color getColor()
   {
      return surface;
   }

   public void setColor(Color c)
   {
      surface = c;
   }

   public int getNumberOfPlayers()
   {
      return numberOfPlayers;
   }

   public void setNumberOfPlayers(int playerCount)
   {
      numberOfPlayers = playerCount;
   }
}
