import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.lang.Override;
import java.lang.System;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Creates a JMenuBar component for performing system operations.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/11/14

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
      fileMenu.setMnemonic(KeyEvent.VK_F);
      fileMenu.getAccessibleContext().setAccessibleDescription("File menu.");

      menuItem = new JMenuItem("New Game", KeyEvent.VK_N);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Starts a new game of Mancala.");
      fileMenu.add(menuItem);

      menuItem = new JMenuItem("Undo Move", KeyEvent.VK_U);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Quit the application.");
      fileMenu.add(menuItem);

      menuItem = new JMenuItem("Quit Game", KeyEvent.VK_Q);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Quit the application.");
      menuItem.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.exit(0);
         }
      });
      fileMenu.add(menuItem);

      // Settings Menu
      settingsMenu = new JMenu("Settings");
      settingsMenu.setMnemonic(KeyEvent.VK_T);
      fileMenu.getAccessibleContext().setAccessibleDescription("Settings menu.");

      menuItem = new JMenuItem("Light Theme", KeyEvent.VK_L);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Changes the game appearance to a light theme.");
      menuItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

          }
      });
      settingsMenu.add(menuItem);

      menuItem = new JMenuItem("Dark Theme", KeyEvent.VK_D);
      menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
      menuItem.getAccessibleContext().setAccessibleDescription("Changes the game apperance to a dark theme.");
      menuItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

          }
      });
      settingsMenu.add(menuItem);

      add(fileMenu);
      add(settingsMenu);
   }
}
