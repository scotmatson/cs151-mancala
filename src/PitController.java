import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 Created by scot on 12/5/15.
 */
public class PitController
{
   MancalaModel model;

   public PitController(Pit view, MancalaModel m)
   {
      model = m;

      view.addMouseListener(new MouseAdapter()
      {
         @Override
         public void mouseClicked(final MouseEvent e)
         {

            
             model.pitSelector(view.getPitID());
             model.printCurrentState();


         }
      });
   }
}
