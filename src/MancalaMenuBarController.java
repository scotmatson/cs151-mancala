/**
 Created by scot on 11/29/15.
 */
public class MancalaMenuBarController
{
   MancalaModel model;
   MancalaMenuBar view;

   MancalaMenuBarController(MancalaMenuBar view, MancalaModel m)
   {
      model = m;

      view.newGameActionListener(e -> {
         System.out.println("New game.");
      });

      view.undoMoveActionListener(e -> {
         System.out.println("Undo move.");
      });

      view.quitGameActionListener(e -> {
         System.exit(0);
      });

      view.lightThemeActionListener(e -> {
         System.out.println("Set light theme.");
      });

      view.darkThemeActionListener(e -> {
         System.out.println("Set dark theme.");
      });
   }
}
