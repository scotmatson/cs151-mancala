import javax.swing.*;
import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 The outer frame for a Mancala game. Bootstraps all necessary
 graphical components.

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/10/26

 */
public class MancalaGUI extends JFrame
{
   private final String FRAME_TITLE = "This is Mancala, bitches.";

   public MancalaGUI()
   {
      // Define properties of the JFrame.
      setTitle(FRAME_TITLE);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setDefaultLookAndFeelDecorated(true);
      setJMenuBar(new MancalaMenuBar());

      // Define the content of the JFrame.
      Container contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());
      //TODO: Display game information in NORTHERN pane (i.e., turn, won stones, etc...)
      contentPane.add(new MancalaBoard(), BorderLayout.CENTER);


      pack();
      setVisible(true);
   }
}
