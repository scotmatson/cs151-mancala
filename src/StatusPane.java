import javax.swing.*;
import java.awt.*;

/**
 Created by scot on 11/14/15.
 */
public class StatusPane extends JPanel
{
   private MancalaModel model;

   private final int PANEL_WIDTH;
   private final int PANEL_HEIGHT;

   public StatusPane(int width, int height, MancalaModel m)
   {
      model = m;

      PANEL_WIDTH = width;
      PANEL_HEIGHT = height;
   }

   public Dimension getPreferredSize()
   {
      return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
   }

   public void paintComponent()
   {

   }
}
