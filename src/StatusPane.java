import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 Created by scot on 11/14/15.
 */
public class StatusPane extends JPanel implements Observer
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

   /**
    Updates the view with the current model
    @param o an Observable object
    @param arg an argument passed to notify the notifyObservers method
    */
   @Override
   public void update(Observable o, Object arg)
   {

   }
}
