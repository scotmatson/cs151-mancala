import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
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
    private JLabel capturedPlayer1;
    private JLabel capturedPlayer2;
    private JLabel currentPlayer;
    private JLabel capturedScore1;
    private JLabel capturedScore2;
    private JLabel player;
    private JLabel numberOfPlayer;

   /**
    Constructor method for the status pane
    @param width
    @param height
    @param m
    */
    public StatusPane(int width, int height, MancalaModel m) {
        model = m;

        pane = new JPanel(new GridBagLayout());
        container = new Container();
        pane.setPreferredSize(new Dimension(width, height));

        constraints = new GridBagConstraints(); //I went with grid bag for ease of use

        PANEL_WIDTH = width;
        PANEL_HEIGHT = height;

        setStatusPaneColor(model.getStatusPaneColor());

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
        PlayerNumber();
    }

    /**
     * Creates the TextArea for player one "Captured"
     */
    public void CapPlayer1Text() {
        capturedPlayer1 = new JLabel("Player 1 Captured");

        constraints.fill = GridBagConstraints.HORIZONTAL;
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

        constraints.gridx = 2;
        constraints.gridy = 0;
        capturedPlayer2.setHorizontalAlignment(SwingConstants.RIGHT);
        constraints.weightx = 2;

        pane.add(capturedPlayer2, constraints);
    }

    /**
     * Shows the score for Player 1
     * Will change everyTime it is called to
     */
    public void CapPlayer1Score() {
        capturedScore1 = new JLabel("0");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        Border paddingBorder = BorderFactory.createEmptyBorder(0, 50, 0, 0);
        capturedScore1.setBorder(paddingBorder);

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
        capturedScore2.setHorizontalAlignment(SwingConstants.RIGHT);
        constraints.gridx = 2;
        constraints.gridy = 1;

        Border paddingBorder = BorderFactory.createEmptyBorder(0, 0, 0, 50);
        capturedScore2.setBorder(paddingBorder);

        pane.add(capturedScore2, constraints);

    }

    /**
     * Updates player 2 score
     *
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
        constraints.gridx = 1;
        constraints.gridy = 0;
        currentPlayer.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(currentPlayer, constraints);
    }


    /**
     * Creates a JLabel for the player 1
     */
    public void PlayerNumber() {
        numberOfPlayer = new JLabel("Player # 1");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        numberOfPlayer.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(numberOfPlayer, constraints);
    }

    /**
     * Updates what player is playing
     *
     * @return
     */
    public void updatePlayerNumber() {
        numberOfPlayer.setText(java.lang.String.format("Player # %s", "" + model.getCurrentPlayer()));
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
        pane.setBackground(c);
    }

    /**
     * Paints the componets
     *
     * @param g
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(boardColor);


    }

    /**
     * Updates the view with the current model
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
