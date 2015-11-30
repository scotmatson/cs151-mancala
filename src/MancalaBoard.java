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
   private MancalaModel model;

   /**
    Constructor method for the MancalaBoard class.
    @param x the x-position of the game board.
    @param y the y-position of the game board.
    @param width the width of the game board.
    @param height the height of the game board.
    @param c the color of the game board.
    @param m a data model to represent
    */
   public MancalaBoard(int x, int y, int width, int height, Color c, MancalaModel m)
   {
      super(x, y, width, height, c);
      model = m;
   }

   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Pit p1 = new Pit(0, 0, 5, 5, model.getPitColor());

   }

   @Override
   public void update(Observable o, Object arg)
   {
      Color newColor = model.getPitColor();
      // Set the pit colors

      validate();
      repaint();
   }
}
