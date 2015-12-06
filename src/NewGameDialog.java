import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Override;

/**

 COPYRIGHT (C) 2015 Scot Matson. All Rights Reserved.

 Overrides the JDialog to create a custom dialog box
 for entering new events

 Solves CS151 homework assignment #4

 @author Scot Matson

 @version 1.01 2015/11/23

 */
public class NewGameDialog extends JDialog
{
   private MancalaModel mancalaModel;

   /**
    Constructor method for CreateDialog
    @param p parent JFrame
    @param m a model
    */
   public NewGameDialog(JFrame p, MancalaModel m) {
      super(p, "New Game", true);
      mancalaModel = m;

      // DIALOG PANEL
      final String NEWGAME_TEXT = "Please select the number of stones that each pit will start with.";
      JLabel introLabel = new JLabel(NEWGAME_TEXT);
      introLabel.setHorizontalAlignment(JLabel.CENTER);

      final JRadioButton jRad3 = new JRadioButton("3 Stones");
      jRad3.setFocusPainted(false);
      jRad3.setSelected(true);
      final JRadioButton jRad4 = new JRadioButton("4 Stones");
      jRad4.setFocusPainted(false);
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(jRad3);
      buttonGroup.add(jRad4);

      JPanel radioPanel = new JPanel(new GridBagLayout());
      radioPanel.setBorder(new EmptyBorder(10, 0, 0, 0));
      GridBagConstraints c = new GridBagConstraints();
      c.gridx = 0;
      c.gridy = 0;
      radioPanel.add(jRad3);
      c.gridx = 1;
      radioPanel.add(jRad4);

      JPanel dialogPanel = new JPanel(new BorderLayout());
      dialogPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
      dialogPanel.add(introLabel, BorderLayout.PAGE_START);
      dialogPanel.add(radioPanel, BorderLayout.PAGE_END);

      // BUTTON PANEL //
      final String PLAY_BUTTON = "Play Mancala";
      JButton playButton = new JButton(PLAY_BUTTON);
      playButton.setFocusPainted(false);


          playButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  if (jRad3.isSelected()) {
                      mancalaModel.resetGame(12, 3);
                      mancalaModel.notifyObservers();
                  } else if(jRad4.isSelected()) {
                      mancalaModel.resetGame(12,4);
                      mancalaModel.notifyObservers();
                  }
                  setVisible(false);
                  dispose();
              }
          });



      JPanel buttonPanel = new JPanel();
      buttonPanel.add(playButton, BorderLayout.CENTER);

      getContentPane().add(dialogPanel, BorderLayout.PAGE_START);
      getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      pack();
      setLocationRelativeTo(p);
      setVisible(true);
   }

   /**
    Disposes of the JDialog without taking action
    */
   class PlayButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {

         // TODO: Update the model with game settings.
         mancalaModel.resetGame();
         setVisible(false);
         dispose();
      }
   }
}