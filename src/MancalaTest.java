import javax.swing.*;
import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Class to launch Mancala, include the main() method

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/10/26

 */
public class MancalaTest extends JFrame
{

   private final String FRAME_TITLE = "This is Mancala, bitches.";
   private final int FRAME_WIDTH = 1000;

   /**
    Constructor method for the MancalaTest class.
    */
   public MancalaTest()
   {
      // Define properties of the JFrame.
      setTitle(FRAME_TITLE);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setDefaultLookAndFeelDecorated(true);
      MancalaMenuBar menuBar = new MancalaMenuBar();

      // The model
      MancalaModel model = new MancalaModel();

      // Outer views
      StatusPane statusPane = new StatusPane(FRAME_WIDTH, 150, model);
      GamePane gamePane = new GamePane(FRAME_WIDTH, 400, model);

      // Menu Controller
      new MancalaMenuBarController(menuBar, model);

      // Add content to JFrame
      Container pane = getContentPane();
      setJMenuBar(menuBar);
      pane.add(statusPane, BorderLayout.PAGE_START);
      pane.add(gamePane, BorderLayout.PAGE_END);

      // Display the window.
      pack();
      setVisible(true);
   }

   /**
    The main method of execution for the JVM.
    @param args user-defined arguments.
    */
   public static void main(String[] args)
   {
      MancalaModel testModel = new MancalaModel();
      testModel.printCurrentState();

      SwingUtilities.invokeLater(MancalaTest::new);
   }
}