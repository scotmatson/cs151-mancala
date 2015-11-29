import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 TODO: Class description

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/10/26

 */
public class Stone extends GameObject implements Observer
{

   private int stoneID;
   private boolean inUse; // Can only be added to a cup when false
   private Color color;

   /**
    Constructor method for the Stone class
    */
   public Stone() {
       stoneID = super.getCount();
       inUse = false;
   }

   /**
    * Returns the Stone Id when called
    */
   public int getStone()
    {
        return stoneID;
    }

   /**
    * Sets the
    * @param stoneID a stone ID
    */
   public void setStone(int stoneID)
    {
       this.stoneID = stoneID;
    }

   /**
    Get the color of the stones
    @return a Color object
    */
   public Color getColor()
   {
       return color;
   }

   /**
    Sets the color of the stones
    @param color a Color object
    */
   public void setColor(Color color)
   {
       this.color = color;
   }

   @Override
   public void update(Observable o, Object arg)
   {

   }
}