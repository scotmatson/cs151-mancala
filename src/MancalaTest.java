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
      MancalaGUI game = new MancalaGUI();
   }

   /**
    The main method of execution for the JVM.
    @param args user-defined arguments.
    */
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(new Runnable()
      {
         @Override
         public void run()
         {
            new MancalaTest();
         }
      });
   }
}
