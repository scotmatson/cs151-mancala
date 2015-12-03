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
   Pit pit1;
   Pit pit2;
   Pit pit3;
   Pit pit4;
   Pit pit5;
   Pit pit6;
   Pit pit7;
   Pit pit8;
   Pit pit9;
   Pit pit10;
   Pit pit11;
   Pit pit12;

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
      //mancala1 = new Mancala();
      //pit1 = new Pit();
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(model.getPitColor());
      //g2.fill(pit1);
      //g2.fill(pit2);
      //g2.fill(pit3);
      //g2.fill(pit4);
      //g2.fill(pit5);
      //g2.fill(pit6);
      //g2.fill(pit7);
      //g2.fill(pit8);
      //g2.fill(pit9);
      //g2.fill(pit10);
      //g2.fill(pit11);
      //g2.fill(pit12);
      g2.dispose();
   }
}
