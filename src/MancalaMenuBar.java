import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 Created by scot on 11/14/15.
 */
public class MancalaMenuBar extends JMenuBar
{
   public MancalaMenuBar()
   {
      JMenu fileMenu;
      JMenu settingsMenu;
      JMenuItem menuItem;

      // File Menu
      fileMenu = new JMenu("File");
      fileMenu.setMnemonic(KeyEvent.VK_A);
      fileMenu.getAccessibleContext().setAccessibleDescription(
         "File menu."
      );

      menuItem = new JMenuItem("New Game", KeyEvent.VK_N);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Starts a new game of Mancala.");
      fileMenu.add(menuItem);

      menuItem = new JMenuItem("Undo Move", KeyEvent.VK_U);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Quit the application.");
      fileMenu.add(menuItem);

      menuItem = new JMenuItem("Quit Game", KeyEvent.VK_Q);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Quit the application.");
      fileMenu.add(menuItem);

      // Settings Menu
      settingsMenu = new JMenu("Settings");


      add(fileMenu);
      add(settingsMenu);
   }
}
