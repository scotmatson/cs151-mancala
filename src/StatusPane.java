import javax.swing.*;
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

    public StatusPane(int width, int height, MancalaModel m) {
        model = m;

        container = new Container();
        constraints = new GridBagConstraints(); //I went with grid bag for ease of use
        container.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); //Right to left on the screen
        container.setLayout(new GridBagLayout());


        PANEL_WIDTH = width;
        PANEL_HEIGHT = height;

        add(container, BorderLayout.CENTER);
    }

    public void createPane(int x, int y, int width, int height, MancalaModel m) {


    }


    /**
     * Sets the Prefered Size
     * @return
     */
    public Dimension getPreferredSize() {
        return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
    }

    /**
     * Sets the StatusPanel Color
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

        validate();
        repaint();

    }
}
