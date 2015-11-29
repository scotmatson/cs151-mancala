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
   private final int PANEL_WIDTH;
   private final int PANEL_HEIGHT;
   MancalaModel model;
   MancalaBoard mancalaBoard;

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
      mancalaBoard = new MancalaBoard(boardX, boardY, boardWidth, boardHeight, Color.lightGray, model);
      add(mancalaBoard, BorderLayout.CENTER);
   }

   /**
    Sets the size of the GamePane panel
    @return a Dimension object
    */
   public Dimension getPreferredSize()
   {
      return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
   }

   /**
    Updates the view with the current model
    @param o an Observable object
    @param arg an argument passed to notify the notifyObservers method
    */
   @Override
   public void update(Observable o, Object arg)
   {
      Color newColor = model.getBoardColor();
      mancalaBoard.setBoardColor(newColor);

      validate();
      repaint();
   }
}
