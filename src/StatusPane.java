import javax.swing.*;
import javax.swing.BoxLayout;
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
import java.awt.geom.Rectangle2D;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by scot on 11/14/15.
 */
public class StatusPane extends JPanel implements Observer {
    private MancalaModel model;
    private Container container;
    private GridBagConstraints constraints;
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private Color boardColor;
    private JTextArea capturedPlayer1, capturedPlayer2, capturedScore1, capturedScore2, currentPlayer, player, numberOfPlayer;


    public StatusPane(int width, int height, MancalaModel m) {
        model = m;

        container = new Container();
        constraints = new GridBagConstraints(); //I went with grid bag for ease of use
        container.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); //Right to left on the screen
        container.setLayout(new GridBagLayout());
        container.setBackground(boardColor);



        PANEL_WIDTH = width;
        PANEL_HEIGHT = height;

        createPane();

        add(container, BorderLayout.CENTER);
    }

    public void createPane() {
        capturedPlayer1 = new JTextArea("Captured ");
        capturedPlayer1.setEditable(false);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 100;
        constraints.gridy = 100;
        container.add(capturedPlayer1, constraints);

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
        validate();
        repaint();

    }
}
