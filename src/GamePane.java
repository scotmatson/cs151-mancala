package com.tertiary;
import javax.swing.*;
import java.awt.*;

/**
 Created by scot on 11/14/15.
 */
public class GamePane extends JPanel
{
   private final int PANEL_WIDTH;
   private final int PANEL_HEIGHT;

   public GamePane(int width, int height)
   {
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
}
