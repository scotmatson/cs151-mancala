import javax.swing.*;

/**
 Created by scot on 11/14/15.
 */
public class MancalaGUI extends JFrame
{
   private final String FRAME_TITLE = "This is Mancala, bitches.";
   private final int FRAME_WIDTH = 200;
   private final int FRAME_HEIGHT = 200;

   public MancalaGUI()
   {
      setTitle(FRAME_TITLE);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setDefaultLookAndFeelDecorated(true);

      setJMenuBar(new MancalaMenuBar());
      /**
       The game has only one view I guess? Trying to read up on MVC patterns a bit more to
       understand this. It sounds like multiple-views, multiple-controllers, and usually
       one model is the way to do it.

       In our case I guess only one view exists (but alternate skins).
       */

      pack();
      setVisible(true);
   }
}
