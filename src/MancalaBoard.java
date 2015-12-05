import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Class which defines a Mancala style game board.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/11/14

 */
public class MancalaBoard extends GameBoard
{
   private MancalaModel model;
   Mancala mancala1;
   Mancala mancala2;

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
      mancala1 = new Mancala(5, 5, 20, 50, m.getPitColor());

      add(mancala1, BorderLayout.LINE_START);
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
   }
}
