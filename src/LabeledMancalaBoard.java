import java.awt.*;

/**
 Created by scot on 12/1/15.
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

      setAllBorders();
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
