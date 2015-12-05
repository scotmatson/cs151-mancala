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
