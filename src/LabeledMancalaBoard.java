import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.GridBagLayout;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 // TODO: Add description

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/12/01

 */
public class LabeledMancalaBoard extends JPanel
{
    private JPanel pane;
    private GridBagConstraints constraints;

    public LabeledMancalaBoard(int width, int height, GamePane gamePane) {
       pane = new JPanel(new GridBagLayout());
       setLayout(new GridBagLayout());
       constraints = new GridBagConstraints();

       addGamePane(gamePane);
       setMancalaA();
       setManacalB();
       setPlayerAText();
       setPlayerBText();

       this.add(pane);
    }

    private void setMancalaA() {
        JLabel mancalaA = new JLabel("Mancala A", JLabel.CENTER);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        mancalaA.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        constraints.gridx = 0;
        constraints.gridy = 1;

        pane.add(mancalaA, constraints);
    }

    private void setManacalB() {
        JLabel mancalaB = new JLabel("Mancala B", JLabel.CENTER);
        mancalaB.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 1;

        pane.add(mancalaB, constraints);
    }

    public void setPlayerAText() {
        JLabel playerA = new JLabel("Player A ---->", JLabel.CENTER);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;

        pane.add(playerA, constraints);
    }

    public void setPlayerBText() {
        JLabel playerB = new JLabel("<--- Player B", JLabel.CENTER);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 0;

        pane.add(playerB, constraints);
    }

    private void addGamePane(GamePane gamePane) {
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        pane.add(gamePane, constraints);
    }

    public int getWidth() {
        return (int)pane.getPreferredSize().getWidth();
    }
}
