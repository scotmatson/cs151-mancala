import javax.swing.*;
import java.awt.*;

/**
 Created by scot on 11/14/15.
 */
public class Mancala extends GameBoardTile
{
   private int mancalaID;
   //private JLabel mancalaRepresentation;
   private JLabel mancalaStore;

   /**
    Constructor method for the Mancala class.
    */
   public Mancala(int x, int y, int w, int h, Color c, int pid)
   {
      super(x, y, w, h, c);
      mancalaID = pid;
      //mancalaRepresentation = new JLabel("0");

      mancalaStore = new JLabel("0");
      mancalaStore.setHorizontalAlignment(SwingConstants.CENTER);
      mancalaStore.setVerticalAlignment(SwingConstants.CENTER);
      mancalaStore.setPreferredSize(new Dimension(getWidth(), getHeight()));
      mancalaStore.setOpaque(true);
      mancalaStore.setBackground(c);

      add(mancalaStore);
   }

   public int getMancalaID() { return mancalaID; }

   //public JLabel getMancalaRepresentation() { return mancalaRepresentation; }


   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      //mancalaRepresentation.setBackground(g.getColor());
   }

   // Is this supposed to be extended from the Observer interface? The naming
   // is the same.
   public void update(int numberOfStones)
   {
      //mancalaRepresentation.setText(Integer.toString(numberOfStones));
   }

   public void setMancalaNumberOfStones(int numberOfStones)
   {
      mancalaStore.setText(Integer.toString(numberOfStones));
   }

   public void setMancalaColor(Color c)
   {
      mancalaStore.setBackground(c);
   }
}
