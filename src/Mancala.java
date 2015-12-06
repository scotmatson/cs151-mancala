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

      mancalaStore = new JLabel("0");
      mancalaStore.setFont(new Font("Serif", Font.PLAIN, 40));
      mancalaStore.setHorizontalAlignment(SwingConstants.CENTER);
      mancalaStore.setVerticalAlignment(SwingConstants.CENTER);
      mancalaStore.setPreferredSize(new Dimension(getWidth(), getHeight()));
      mancalaStore.setOpaque(true);
      mancalaStore.setBackground(c);

      add(mancalaStore);
   }

   public int getMancalaID() { return mancalaID; }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
   }

   /**
    Updates the number of the stones in the mancala
    @param numberOfStones the number of stones in the mancala
    */
   public void setMancalaNumberOfStones(int numberOfStones)
   {
      mancalaStore.setText(Integer.toString(numberOfStones));
   }

   /**
    Sets the color of the mancala
    @param c a new color for the mancala
    */
   public void setMancalaColor(Color c)
   {
      mancalaStore.setBackground(c);
   }
}
