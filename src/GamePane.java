import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 A pane to house a game GUI

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/12/5

 */
public class GamePane extends JPanel implements Observer {
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;

    public MancalaModel model;
    public MancalaBoard board;

   /**
    Constructor method for a GamePane
    @param width a pane width
    @param height a pane height
    @param m a model to represent
    */
    public GamePane(int width, int height, MancalaModel m) {
        model = m;
        setLayout(new BorderLayout());

      PANEL_WIDTH = width;
      PANEL_HEIGHT = height;
      board = new MancalaBoard(0, 0, PANEL_WIDTH, PANEL_HEIGHT, model.getBoardColor(), model);
      model.addObserver(board);


      this.add(board, BorderLayout.CENTER);
    }

    /**
     * Sets the size of the GamePane panel
     * @return a Dimension object
     */
    public Dimension getPreferredSize() {
        return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
    }

   /**
     Method for painting stuff
     @param g a basic graphics object
    */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

   /**
    Updates the view with the current model
    @param o an Observable object
    @param arg an argument passed to notify the notifyObservers method
    */
   @Override
   public void update(Observable o, Object arg)
   {
      Color newColor = model.getBoardColor();
      board.setColor(newColor);

      revalidate();
      repaint();
   }
}