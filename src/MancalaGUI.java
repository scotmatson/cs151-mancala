import javax.swing.*;

/**
 Created by scot on 11/14/15.
 */
public class MancalaGUI
{
   // Needs a frame with stats
   // A board
   // the board should have pits

   public MancalaGUI()
   {
      JFrame frame = new JFrame("This is Mancala Bitches.");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      /**
       The game has only one view I guess? Trying to read up on MVC patterns a bit more to
       understand this. It sounds like multiple-views, multiple-controllers, and usually
       one model is the way to do it.

       In our case I guess only one view exists (but alternate skins).
       */

      frame.pack();
      frame.setVisible(true);
   }
}
