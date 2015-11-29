import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Class which defines a Mancala style game board.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/11/14

 */
public class MancalaBoard extends GameBoard implements Observer
{
   private final int NUMBER_OF_PITS = 12;
   public MancalaBoard(int x, int y, int width, int height, Color c)
   {
      super(x, y, width, height, c);
   }

   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
   }

   @Override
   public void update(Observable o, Object arg)
   {
      super.update(o, arg);
   }
}
