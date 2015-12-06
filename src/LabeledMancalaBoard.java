import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.util.Observer;
import java.util.Observable;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 A class to wrap a GameBoard object with labels

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/12/5

 */
public class LabeledMancalaBoard extends JPanel implements Observer
{
    private JPanel pane;
    private GridBagConstraints constraints;
    private GamePane gamePane;

   /**
    Constructor method for a LabeledMancalaBoard
    @param gamePane a GamePane to frame
    */
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

   /**
    A mancala to label
    */
    private void setMancalaA() {
        JLabel mancalaA = new JLabel("Mancala 1", JLabel.CENTER);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        mancalaA.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        constraints.gridx = 0;
        constraints.gridy = 1;

        pane.add(mancalaA, constraints);
    }

   /**
    A mancala to label
    */
    private void setManacalB() {
        JLabel mancalaB = new JLabel("Mancala 2", JLabel.CENTER);
        mancalaB.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        constraints.gridy = 1;

        pane.add(mancalaB, constraints);
    }

   /**
    A row of pits to label
    */
    public void setPlayerAText() {
        JLabel playerA = new JLabel("<-------- Player 1 ", JLabel.CENTER);
        playerA.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 0;

        pane.add(playerA, constraints);
    }

   /**
    A row of pits to label
    */
    public void setPlayerBText() {
        JLabel playerB = new JLabel("Player 2 -------->", JLabel.CENTER);
        playerB.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;

        pane.add(playerB, constraints);
    }

   /**
    Adds a game pane
    */
    private void addGamePane() {
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        pane.add(gamePane, constraints);
    }

   /**
    Gets the width of a pane
    @return
    */
    public int getWidth() {
        return (int)pane.getPreferredSize().getWidth();
    }

   /**
    Updates the view with data from the model
    @param o Observable object
    @param arg Things to update
    */
    @Override
    public void update(Observable o, Object arg)
    {
        gamePane.board.setColor(Color.black);
        revalidate();
        repaint();
    }
}
