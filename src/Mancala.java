import javax.swing.*;
import java.awt.*;

/**
 Created by scot on 11/14/15.
 */
public class Mancala extends GameBoardTile
{
   private int mancalaID;
   private JLabel mancalaRepresentation;

   /**
    Constructor method for the Mancala class.
    */
   public Mancala(int x, int y, int w, int h, Color c, int pid)
   {
      super(x, y, w, h, c);
      mancalaID = pid;
      mancalaRepresentation = new JLabel("0");
      mancalaRepresentation.setBackground(c);
   }

   public int getMancalaID() { return mancalaID; }

   public JLabel getMancalaRepresentation() { return mancalaRepresentation; }

   public void update(int numberOfStones)
   {
      mancalaRepresentation.setText(Integer.toString(numberOfStones));
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      mancalaRepresentation.setBackground(g.getColor());
      // TODO: Add stones here
   }
}
