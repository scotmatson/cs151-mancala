import javax.swing.*;
import java.awt.*;

public class Pit extends GameBoardTile implements Drawable
{
   private int pitID;
   //private JLabel pitRepresentation;

   public Pit(int x, int y, int w, int h, Color c, int pitNumber, int numberOfStones, String name)
   {
      super(x, y, w, h, c);
      pitID = pitNumber;

      JLabel pitStore = new JLabel(Integer.toString(numberOfStones));
      pitStore.setPreferredSize(new Dimension(getWidth(), getHeight()/2));
      pitStore.setHorizontalAlignment(SwingConstants.CENTER);
      pitStore.setVerticalAlignment(SwingConstants.CENTER);
      pitStore.setOpaque(true);
      pitStore.setBackground(c);

      JLabel pitLabel = new JLabel(name);
      pitLabel.setPreferredSize(new Dimension(getWidth(), getHeight()/2));
      pitLabel.setHorizontalAlignment(SwingConstants.CENTER);
      pitLabel.setVerticalAlignment(SwingConstants.CENTER);
      pitLabel.setOpaque(true);
      pitLabel.setBackground(Color.WHITE);

      add(pitStore);
      add(pitLabel);

      //pitRepresentation = new JLabel(Integer.toString(numberOfStones));
      //pitRepresentation.setBackground(c);
   }

   //public JLabel getPitRepresentation() { return pitRepresentation; }

   public void update(int numberOfStones)
   {
      //pitRepresentation.setText(Integer.toString(numberOfStones));
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      //pitRepresentation.setBackground(g.getColor());
   }
}