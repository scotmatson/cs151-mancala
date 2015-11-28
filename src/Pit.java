import java.util.Observable;
import java.util.Observer;

/**
 Created by scot on 11/14/15.
 */
public class Pit extends GameObject implements Observer
{
   String   textLabel;
   private int pitID;
   private boolean inUse; // Can only be added to a cup when false

   public Pit()
   {
      pitID = super.getCount();
      inUse = false;
   }

   @Override
   public void update(Observable o, Object arg)
   {

   }
}
