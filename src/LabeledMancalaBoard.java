import javax.swing.*;
import java.awt.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 // TODO: Add description

 Solves CS151 Project - Mancala Game

 @author Scot Matson

 @version 1.01 2015/12/01

 */
public class LabeledMancalaBoard extends BoardDecorator implements Drawable
{
   public LabeledMancalaBoard(Drawable decoratedDrawable)
   {
      super(decoratedDrawable);

      JLabel playerA = new JLabel("Player A -->");
      JLabel playerB = new JLabel("<-- Player B");
      JLabel mancalaA = new JLabel("<html>M<br>a<br>n<br>c<br>a<br>l<br>a<br><br>A</html>");
      JLabel mancalaB = new JLabel("<html>M<br>a<br>n<br>c<br>a<br>l<br>a<br><br>B</html>");

      add(playerA, BorderLayout.PAGE_END);
      add(playerB, BorderLayout.PAGE_START);
      add(mancalaB, BorderLayout.LINE_START);
      add(mancalaA, BorderLayout.LINE_END);
   }

   @Override
   public Dimension getPreferredSize()
   {
      return super.getPreferredSize();
   }

   @Override
   public void draw(Graphics g)
   {
      super.draw(g);
   }

   @Override
   protected void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      draw(g);
   }

   public void setAllBorders()
   {
      setBorderNorth();
      setBorderEast();
      setBorderSouth();
      setBorderWest();
   }

   public void setBorderNorth()
   {
      System.out.println("Adding North");
   }

   public void setBorderEast()
   {
      System.out.println("Adding East");
   }

   public void setBorderSouth()
   {
      System.out.println("Adding South");
   }

   public void setBorderWest()
   {
      System.out.println("Adding West");
   }
}
