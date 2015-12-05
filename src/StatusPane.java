import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.lang.Override;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by scot on 11/14/15.
 */
public class StatusPane extends JPanel implements Observer {
    private MancalaModel model;
    private Container container;
    private JPanel pane;
    private GridBagConstraints constraints;
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private Color boardColor;
    private JLabel capturedPlayer1, capturedPlayer2, currentPlayer, capturedScore1, capturedScore2, player, numberOfPlayer;


    public StatusPane(int width, int height, MancalaModel m) {
        model = m;

        pane = new JPanel(new GridBagLayout());
        container = new Container();

        constraints = new GridBagConstraints(); //I went with grid bag for ease of use

        PANEL_WIDTH = width;
        PANEL_HEIGHT = height;

        //pane.setSize(PANEL_WIDTH, PANEL_HEIGHT);


        createPane();

        add(pane, BorderLayout.PAGE_START);
    }

    /**
     * Creates all of the Pane
     */
    public void createPane() {
        CapPlayer1Text();
        CapPlayer2Text();
        CapPlayer1Score();
        CapPlayer2Score();
        CurrentPlayer();
        PlayerTxtArea();
        PlayerNumber();
    }

    /**
     * Creates the TextArea for player one "Captured"
     */
    public void CapPlayer1Text() {
        capturedPlayer1 = new JLabel("Player 1 Captured");

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridwidth = 30;
        constraints.ipadx = 10;
        constraints.ipady = 10;
        constraints.gridx = 0;
        constraints.gridy = 0;
        pane.add(capturedPlayer1, constraints);
    }

    /**
     * Text for player Two "Captured"
     */
    public void CapPlayer2Text() {
        capturedPlayer2 = new JLabel("Player 2 Captured");

        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.ipadx = 10;
        constraints.ipady = 10;
        constraints.gridx = 2;
        constraints.gridy = 0;

        pane.add(capturedPlayer2, constraints);
    }

    /**
     * Shows the score for Player 1
     * Will change everyTime it is called to
     */
    public void CapPlayer1Score() {
        capturedScore1 = new JLabel("0");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0; //All these nums are arbitrary will change later
        constraints.gridy = 100;

        pane.add(capturedScore1, constraints);

    }

    public void updatePlayer1Score() {
        capturedScore1.setText(java.lang.String.format("%s", "" + model.getStonesInMancala(0)));
    }

    /**
     * Shows the score for Player 2
     * Will change everytime it is called to
     */
    public void CapPlayer2Score() {
        capturedScore2 = new JLabel("0");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 500;
        constraints.gridy = 100;

        pane.add(capturedScore2, constraints);

    }

    /**
     * Updates player 2 score
     * @return
     */
    public void updatePlayer2Score() {
        capturedScore2.setText(java.lang.String.format("%s", "" + model.getStonesInMancala(1)));
    }

    /**
     * Shows the Current player
     */
    public void CurrentPlayer() {
        currentPlayer = new JLabel("Current Player");

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 100;
        constraints.gridy = 150;
        pane.add(currentPlayer, constraints);
    }

    /**
     * Either will be a 1 or a 2
     * Will have observer attached to it.
     */
    public void PlayerTxtArea() {
        player = new JLabel("Player");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 200;
        constraints.gridy = 50;
        pane.add(player, constraints);
    }

    /**
     * Creates a JLabel for the player 1
     *
     */
    public void PlayerNumber() {
        numberOfPlayer = new JLabel("1");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 300;
        constraints.gridy = 450;
        pane.add(numberOfPlayer, constraints);
    }

    /**
     * Updates what player is playing
     * @return
     */
    public void updatePlayerNumber() {
      numberOfPlayer.setText(java.lang.String.format("%s", "" + model.getCurrentPlayer()));
    }



    /**
     * Sets the Prefered Size
     *
     * @return
     */
    public Dimension getPreferredSize() {
        return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
    }

    /**
     * Sets the StatusPanel Color
     *
     * @param c
     */
    public void setStatusPaneColor(Color c) {
        boardColor = c;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(boardColor);


    }

    /**
     * Updates the view with the current model
     *
     * @param o   an Observable object
     * @param arg an argument passed to notify the notifyObservers method
     */
    @Override
    public void update(Observable o, Object arg) {
        Color newColor = model.getBoardColor();
        setStatusPaneColor(newColor);
        updatePlayer2Score();
        updatePlayer1Score();
        updatePlayerNumber();
        validate();
        repaint();

    }
}
