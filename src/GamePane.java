import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 TODO: Add description

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/10/26

 */
public class GamePane extends JPanel implements Observer
{
   MancalaModel model;
   private final int PANEL_WIDTH;
   private final int PANEL_HEIGHT;

   public GamePane(int width, int height, MancalaModel m)
   {
      model = m;

      setLayout(new BorderLayout());

      PANEL_WIDTH = width;
      PANEL_HEIGHT = height;
      int boardWidth = 800;
      int boardHeight = 400;
      int boardX = (PANEL_WIDTH - boardWidth) / 2;
      int boardY = 0;
      MancalaBoard mancalaBoard = new MancalaBoard(boardX, boardY, boardWidth, boardHeight, Color.lightGray);

      add(mancalaBoard, BorderLayout.CENTER);
   }

   public Dimension getPreferredSize()
   {
      return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
   }

   @Override
   public void update(Observable o, Object arg)
   {

   }
}
