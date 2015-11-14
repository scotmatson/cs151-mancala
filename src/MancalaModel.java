import java.util.Observable;

/**
 Created by scot on 11/14/15.
 */
public class MancalaModel extends Observable
{
   private boolean playerOneTurn;
   private boolean playerTwoTurn;

   // Need to store previous state for UNDO function.
   //    No REDO is required so storing the current state isn't necessary.

   // Only 3 UNDOs are allowed per turn, each UNDO should increment a counter
   //    which is reset when the FINISH TURN button is pressed.

   public MancalaModel()
   {
      // TODO: Stores game logic.
   }
}
