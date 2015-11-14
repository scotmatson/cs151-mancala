import javax.swing.*;
import java.awt.Color;
/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 A generic game board class.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/11/14

 */
public abstract class GameBoard extends JPanel
{
   private final int BOARD_WIDTH;
   private final int BOARD_HEIGHT;
   private Color surface;
   private int numberOfPlayers;

   // TODO: Other definable properties of a generic board?

   public GameBoard(int width, int height, Color c, int playerCount)
   {
      BOARD_WIDTH = width;
      BOARD_HEIGHT = height;
      surface = c;
      numberOfPlayers = playerCount;
   }

   public int getBoardWidth()
   {
      return BOARD_WIDTH;
   }

   public int getBoardHeight()
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
