import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.border.Border;

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
   private JPanel mancalaBoardPanel;

   // TODO: Shouldn't these be private?
   Mancala mancala1;
   Mancala mancala2;
   ArrayList<Pit> mancalaPits;
   //Pit pit1;
   //Pit pit2;
   //Pit pit3;
   //Pit pit4;
   //Pit pit5;
   //Pit pit6;
   //Pit pit7;
   //Pit pit8;
   //Pit pit9;
   //Pit pit10;
   //Pit pit11;
   //Pit pit12;

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
      mancalaBoardPanel = new JPanel(new BorderLayout());
      JPanel pitPanel = new JPanel(new GridLayout(2, model.getNumberOfPits()/2));

      // TODO: change actual placement values of mancala
      mancala1 = new Mancala(0, 0, 0, 0, Color.white, 0);
      mancala2 = new Mancala(0, 0, 0, 0, Color.white, 1);

      // TODO: change actual placement values of pits
      mancalaPits = new ArrayList<>();
      for (int i = 0; i < model.getNumberOfPits(); i++) {
         Border paddingBorder = BorderFactory.createEmptyBorder(0, 100, 0, 0);
         pitPanel.setBorder(paddingBorder);
         mancalaPits.add(new Pit(x, y, 50, 50, m.getPitColor(), i, model.getStonesInPit(i)));
         pitPanel.add(mancalaPits.get(i).getPitRepresentation());
      }

      mancalaBoardPanel.add(pitPanel, BorderLayout.CENTER);
      mancalaBoardPanel.add(mancala1.getMancalaRepresentation(), BorderLayout.WEST);
      mancalaBoardPanel.add(mancala2.getMancalaRepresentation(), BorderLayout.EAST);
   }

   public JPanel getMancalaBoardPanel() { return mancalaBoardPanel; }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      Graphics2D g2 = (Graphics2D) g;

      for (Pit p : mancalaPits)
      {
         p.draw(g2);
      }
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
      //g2.dispose();
   }
}
