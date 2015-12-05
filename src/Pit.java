import javax.swing.*;
import java.awt.*;

public class Pit extends GameBoardTile implements Drawable
{
   private int pitID;
   private JLabel pitRepresentation;

   public Pit(int x, int y, int w, int h, Color c, int pitNumber, int numberOfStones)
   {
      super(x, y, w, h, c);
      pitID = pitNumber;

      pitRepresentation = new JLabel(Integer.toString(numberOfStones));
      pitRepresentation.setBackground(c);
   }

   public JLabel getPitRepresentation() { return pitRepresentation; }

   public void update(int numberOfStones)
   {
      pitRepresentation.setText(Integer.toString(numberOfStones));
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      pitRepresentation.setBackground(g.getColor());
      // TODO: Add stones here... maybe
   }
}