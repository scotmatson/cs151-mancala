import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.util.Observer;
import java.util.Observable;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 // TODO: Add description

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/12/01

 */
public class LabeledMancalaBoard extends JPanel implements Observer
{
    private JPanel pane;
    private GridBagConstraints constraints;
    private GamePane gamePane;

    public LabeledMancalaBoard(GamePane gamePane) {
       this.gamePane = gamePane;
       pane = new JPanel(new GridBagLayout());
       setLayout(new GridBagLayout());
       constraints = new GridBagConstraints();

       addGamePane();
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
        constraints.gridx = 2;
        constraints.gridy = 1;

        pane.add(mancalaA, constraints);
    }

    private void setManacalB() {
        JLabel mancalaB = new JLabel("Mancala B", JLabel.CENTER);
        mancalaB.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;

        pane.add(mancalaB, constraints);
    }

    public void setPlayerAText() {
        JLabel playerA = new JLabel("Player A -------->", JLabel.CENTER);
        playerA.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;

        pane.add(playerA, constraints);
    }

    public void setPlayerBText() {
        JLabel playerB = new JLabel("<-------- Player B", JLabel.CENTER);
        playerB.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 0;

        pane.add(playerB, constraints);
    }

    private void addGamePane() {
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        pane.add(gamePane, constraints);
    }

    public int getWidth() {
        return (int)pane.getPreferredSize().getWidth();
    }

    @Override
    public void update(Observable o, Object arg)
    {
        gamePane.board.setColor(Color.black);
        revalidate();
        repaint();
    }
}
