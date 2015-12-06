import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
   private ArrayList<Pit> pits = new ArrayList<>();

   // TODO: Shouldn't these be private?
   Mancala mancala1;
   Mancala mancala2;

   Pit pitb6;
   Pit pitb5;
   Pit pitb4;
   Pit pitb3;
   Pit pitb2;
   Pit pitb1;

   Pit pita1;
   Pit pita2;
   Pit pita3;
   Pit pita4;
   Pit pita5;
   Pit pita6;

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
      setLayout(new BorderLayout());

      // TODO: change actual placement values of mancala
      int mancalaWidth = 150;
      mancala1 = new Mancala(0, 0, mancalaWidth, height, m.getPitColor(), 0);
      //mancala1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); // TODO: TEST
      mancala2 = new Mancala((width - mancalaWidth), 0, mancalaWidth, height, m.getPitColor(), 1);
      //mancala2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); // TODO: TEST

      JPanel pitPanel = new JPanel(new GridLayout(2, model.getNumberOfPits()/2));

      int pitWidth = 115;
      int pitHeight = 100;
      pitb6 = new Pit(pitWidth*0, 0, pitWidth, height/2, m.getPitColor(), 0, model.getStonesInPit(0), "B6");
      pitb5 = new Pit(pitWidth*1, 0, pitWidth, height/2, m.getPitColor(), 1, model.getStonesInPit(1), "B5");
      pitb4 = new Pit(pitWidth*2, 0, pitWidth, height/2, m.getPitColor(), 2, model.getStonesInPit(2), "B4");
      pitb3 = new Pit(pitWidth*3, 0, pitWidth, height/2, m.getPitColor(), 3, model.getStonesInPit(3), "B3");
      pitb2 = new Pit(pitWidth*4, 0, pitWidth, height/2, m.getPitColor(), 4, model.getStonesInPit(4), "B2");
      pitb1 = new Pit(pitWidth*5, 0, pitWidth, height/2, m.getPitColor(), 5, model.getStonesInPit(5), "B1");

      pita1 = new Pit(pitWidth*0, height/2, pitWidth, height/2, m.getPitColor(), 6, model.getStonesInPit(6), "A1");
      pita2 = new Pit(pitWidth*1, height/2, pitWidth, height/2, m.getPitColor(), 7, model.getStonesInPit(7), "A2");
      pita3 = new Pit(pitWidth*2, height/2, pitWidth, height/2, m.getPitColor(), 8, model.getStonesInPit(8), "A3");
      pita4 = new Pit(pitWidth*3, height/2, pitWidth, height/2, m.getPitColor(), 9, model.getStonesInPit(9), "A4");
      pita5 = new Pit(pitWidth*4, height/2, pitWidth, height/2, m.getPitColor(), 10, model.getStonesInPit(10), "A5");
      pita6 = new Pit(pitWidth*5, height/2, pitWidth, height/2, m.getPitColor(), 11, model.getStonesInPit(11), "A6");

      addPitControllers();

      pitPanel.add(pitb6);
      pitPanel.add(pitb5);
      pitPanel.add(pitb4);
      pitPanel.add(pitb3);
      pitPanel.add(pitb2);
      pitPanel.add(pitb1);
      pitPanel.add(pita1);
      pitPanel.add(pita2);
      pitPanel.add(pita3);
      pitPanel.add(pita4);
      pitPanel.add(pita5);
      pitPanel.add(pita6);

      pits.add(pitb6);
      pits.add(pitb5);
      pits.add(pitb4);
      pits.add(pitb3);
      pits.add(pitb2);
      pits.add(pitb1);
      pits.add(pita1);
      pits.add(pita2);
      pits.add(pita3);
      pits.add(pita4);
      pits.add(pita5);
      pits.add(pita6);
      //for (int i = 0; i < model.getNumberOfPits(); i++)
      //{
         //pitPanel.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 0));
         //pitPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); // TODO: TEST
      //   Pit pit = new Pit(x, y, 100, height/2, m.getPitColor(), i, model.getStonesInPit(i), "Test");
         //pit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

      //   mancalaPits.add(pit);

      //   //pitPanel.add(mancalaPits.get(i).getPitRepresentation());
        // pitPanel.add(mancalaPits.get(i));
      //}


      add(mancala1, BorderLayout.WEST);
      add(pitPanel, BorderLayout.CENTER);
      add(mancala2, BorderLayout.EAST);
      //add(mancala1.getMancalaRepresentation(), BorderLayout.WEST);
      //add(mancala2.getMancalaRepresentation(), BorderLayout.EAST);
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      Graphics2D g2 = (Graphics2D) g;

      //for (Pit p : mancalaPits)
      //{
      //   p.draw(g2);
      //}
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

   /**
    Wires up the pits to a controller for event handling
    */
   public void addPitControllers()
   {
      new PitController(pitb6, model);
      new PitController(pitb5, model);
      new PitController(pitb4, model);
      new PitController(pitb3, model);
      new PitController(pitb2, model);
      new PitController(pitb1, model);

      new PitController(pita1, model);
      new PitController(pita2, model);
      new PitController(pita3, model);
      new PitController(pita4, model);
      new PitController(pita5, model);
      new PitController(pita6, model);
   }
}