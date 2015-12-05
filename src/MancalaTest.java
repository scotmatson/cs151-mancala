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
   private final String FRAME_TITLE = "Mancala by Tertiary";
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
      setLayout(new BorderLayout());
      MancalaMenuBar menuBar = new MancalaMenuBar();

      // The model
      MancalaModel model = new MancalaModel();
      initilizeDefaults(model);

      // Todo: remove tests begin
      model.printCurrentState();
      model.pitSelector(2);
      model.printCurrentState();
      model.pitSelector(2);
      model.printCurrentState();
      model.pitSelector(11);
      model.printCurrentState();
      // Todo: remove tests end

      // View containers
      StatusPane statusPane = new StatusPane(FRAME_WIDTH, 150, model);
      GamePane gamePane = new GamePane(FRAME_WIDTH, 400, model);
      model.addObserver(statusPane);
      model.addObserver(gamePane);

      // Menu Controller
      new MancalaMenuBarController(menuBar, model);

      // Add content to JFrame
      Container pane = getContentPane();
      setJMenuBar(menuBar);
      pane.add(statusPane, BorderLayout.PAGE_START);
      pane.add(gamePane, BorderLayout.PAGE_END);

      // Display the window.
      pack();
      setResizable(false);
      setVisible(true);
   }

   public void initilizeDefaults(MancalaModel model)
   {
      model.setBoardColor(new Color(173, 136, 100));
      model.setPitColor(new Color(125, 69, 36));
      model.setStoneColor(new Color(128, 140, 131));
   }

   /**
    The main method of execution for the JVM.
    @param args user-defined arguments.
    */
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(MancalaTest::new);
   }
}