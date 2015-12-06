import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
   private GridBagConstraints constraints;

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

      // Todo: remove tests begin
      model.printCurrentState();
      // Todo: remove tests end

      // View containers
      StatusPane statusPane = new StatusPane(FRAME_WIDTH, 150, model);
      GamePane gamePane = new GamePane(FRAME_WIDTH, 400, model);
      model.addObserver(statusPane);
      model.addObserver(gamePane);

      initilizeDefaults(model, statusPane);

      // Menu Controller
      new MancalaMenuBarController(menuBar, model);

      // Add content to JFrame
      Container pane = getContentPane();
      constraints = new GridBagConstraints();
      pane.setLayout(new GridBagLayout());
      constraints.gridx = 0;
      constraints.gridy = 0;
      setJMenuBar(menuBar);
      pane.add(statusPane, constraints);
      constraints.gridx = 0;
      constraints.gridy = 1;
      pane.add(gamePane, constraints);

      // Display the window.
      pack();
      setResizable(false);
      setVisible(true);
   }

   /**
    Initializes UI components for presentation on application
    launch.
    @param model the data to model
    @param pane
    */
   public void initilizeDefaults(MancalaModel model, StatusPane pane)
   {
      Color color = new Color(173, 136, 100);
      model.setBoardColor(color);
      pane.setStatusPaneColor(color); //TODO: Configure this so it is handled by the model
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