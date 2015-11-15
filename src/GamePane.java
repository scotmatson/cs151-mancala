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
      PANEL_WIDTH = width;
      PANEL_HEIGHT = height;
   }

   public Dimension getPreferredSize()
   {
      return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
   }

   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;

      int boardWidth = 800;
      int boardHeight = 400;
      int boardX = (PANEL_WIDTH - boardWidth) / 2;
      int boardY = 0;
      MancalaBoard board = new MancalaBoard(boardX, boardY, boardWidth, boardHeight, Color.lightGray);
      g2.setColor(board.getBoardColor());
      g2.fill(board.getBoard());
   }
}
