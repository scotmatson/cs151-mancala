import javax.swing.*;
import java.awt.*;

/**
 Created by scot on 11/29/15.
 */
public class MancalaMenuBarController
{
   MancalaMenuBarController(MancalaMenuBar view, MancalaModel m)
   {
      MancalaModel model = m;

      //model = m;

      view.newGameActionListener(e ->
      {
         System.out.println("New game.");
         // TODO: Set default game conditions
         JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(view);
         NewGameDialog dialog = new NewGameDialog(parentFrame, model);
         dialog.setSize(300, 150);
         model.notifyObservers();
      });

      view.undoMoveActionListener(e ->
      {
         System.out.println("Undo move.");
         // TODO: Revert state
      });

      view.quitGameActionListener(e ->
      {
         System.exit(0);
      });

      view.lightThemeActionListener(e ->
      {
         System.out.println("Set light theme.");
         model.setBoardColor(new Color(173, 136, 100));
         model.setPitColor(new Color(125, 69, 36));
         model.setStoneColor(new Color(128, 140, 131));
         model.notifyObservers();
      });

      view.darkThemeActionListener(e ->
      {
         System.out.println("Set dark theme.");
         model.setBoardColor(new Color(95, 50, 26));
         model.setPitColor(new Color(44, 22, 17));
         model.setStoneColor(new Color(0, 0, 0));
         model.notifyObservers();
      });
   }
}
