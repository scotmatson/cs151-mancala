import javax.swing.*;

/**

 COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.

 Classes to manipulate widgets.

 Solves CS151 Project - Mancala Game

 @author Kenneth Cross, Scot Matson, Alex Preston

 @version 1.01 2015/10/26

 */
public class MancalaTest
{
   /**
    Constructor method for the MancalaTest class.
    */
   public MancalaTest()
   {
      new MancalaGUI();
   }

   /**
    The main method of execution for the JVM.
    @param args user-defined arguments.
    */
   public static void main(String[] args)
   {
      MancalaModel testModel = new MancalaModel();
      testModel.printCurrentState();

      SwingUtilities.invokeLater(new Runnable() // Isn't this for using threads? I thought we weren't going to do that...
      {
         @Override
         public void run()
         {
            new MancalaTest();
         }
      });
   }
}
