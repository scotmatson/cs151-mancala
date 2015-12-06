import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class Pit extends GameBoardTile implements Drawable
{
   private int pitID;
   //private JLabel pitRepresentation;
   private JLabel pitStore;
   private JLabel pitLabel;
   private String name;

   public Pit(int x, int y, int w, int h, Color c, int pitNumber, int numberOfStones, String name)
   {
      super(x, y, w, h, c);
      this.name = name;
      pitID = pitNumber;

      pitStore = new JLabel(Integer.toString(numberOfStones));
      pitStore.setPreferredSize(new Dimension(getWidth(), getHeight() / 2));
      pitStore.setHorizontalAlignment(SwingConstants.CENTER);
      pitStore.setVerticalAlignment(SwingConstants.CENTER);
      pitStore.setOpaque(true);
      pitStore.setBackground(c);

      pitLabel = new JLabel(name);
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

   public void addPitListener(MouseAdapter listenForClicks)
   {
      this.addMouseListener(listenForClicks);
   }

   @Override
   public void setColor(Color c)
   {
      super.setColor(c);
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
      //pitRepresentation.setBackground(g.getColor());
   }

   public void setPitStoreColor(Color c)
   {
      pitStore.setBackground(c);
   }

   @Override
   public String getName()
   {
      return name;
   }

   public int getPitID()
   {
      return pitID;
   }
}