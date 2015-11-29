import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Creates a JMenuBar component for performing system operations.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/11/14

 */
public class MancalaMenuBar extends JMenuBar
{
   private JMenuItem newGame;
   private JMenuItem undoMove;
   private JMenuItem quitGame;
   private JMenuItem lightTheme;
   private JMenuItem darkTheme;

   public MancalaMenuBar()
   {
      JMenu fileMenu;
      JMenu settingsMenu;

      // File Menu
      fileMenu = new JMenu("File");
      fileMenu.setMnemonic(KeyEvent.VK_F);
      fileMenu.getAccessibleContext().setAccessibleDescription("File menu.");

      newGame = new JMenuItem("New Game", KeyEvent.VK_N);
      newGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
      newGame.getAccessibleContext().setAccessibleDescription("Starts a new game of Mancala.");
      fileMenu.add(newGame);

      undoMove = new JMenuItem("Undo Move", KeyEvent.VK_U);
      undoMove.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
      undoMove.getAccessibleContext().setAccessibleDescription("Quit the application.");
      fileMenu.add(undoMove);

      quitGame = new JMenuItem("Quit Game", KeyEvent.VK_Q);
      quitGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
      quitGame.getAccessibleContext().setAccessibleDescription("Quit the application.");
      fileMenu.add(quitGame);

      // Settings Menu
      settingsMenu = new JMenu("Settings");
      settingsMenu.setMnemonic(KeyEvent.VK_T);
      fileMenu.getAccessibleContext().setAccessibleDescription("Settings menu.");

      lightTheme = new JMenuItem("Light Theme", KeyEvent.VK_L);
      lightTheme.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
      lightTheme.getAccessibleContext().setAccessibleDescription("Changes the game appearance to a light theme.");
      settingsMenu.add(lightTheme);

      darkTheme = new JMenuItem("Dark Theme", KeyEvent.VK_D);
      darkTheme.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
      darkTheme.getAccessibleContext().setAccessibleDescription("Changes the game apperance to a dark theme.");
      settingsMenu.add(darkTheme);

      add(fileMenu);
      add(settingsMenu);
   }

   public void newGameActionListener(ActionListener listenForMenu)
   {
      newGame.addActionListener(listenForMenu);
   }

   public void undoMoveActionListener(ActionListener listenForMenu)
   {
      undoMove.addActionListener(listenForMenu);
   }

   public void quitGameActionListener(ActionListener listenForMenu)
   {
      quitGame.addActionListener(listenForMenu);
   }

   public void lightThemeActionListener(ActionListener listenForMenu)
   {
      lightTheme.addActionListener(listenForMenu);
   }

   public void darkThemeActionListener(ActionListener listenForMenu)
   {
      darkTheme.addActionListener(listenForMenu);
   }
}
