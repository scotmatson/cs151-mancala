import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class Pit extends JPanel implements Observer
{

   private final int X_COORD;
   private final int Y_COORD;
   private final int PIT_WIDTH;
   private final int PIT_HEIGHT;

   private ArrayList<Stone> stoneContainer;
   private Color color;

   public Pit() // TODO: Remove after tests complete please
   {
      X_COORD = Y_COORD = PIT_WIDTH = PIT_HEIGHT = 0;
      stoneContainer = new ArrayList<>();
      color = Color.white;
   }

   public Pit(int x, int y, int width, int height, Color c)
   {
       X_COORD = x;
       Y_COORD = y;
       PIT_WIDTH = width;
       PIT_HEIGHT = height;
       color = c;
       stoneContainer = new ArrayList<>();
   }

   /**
    * @param newStone
    */
   public void populatePit(ArrayList<Stone> newStone)
   {
       for (int i = 0; i < newStone.size(); i++)
       {
           stoneContainer.add(newStone.get(i));
       }
   }

   /**
    * Returns the size of each pit
    * @return
    */
   public int pitCount()
   {
       return stoneContainer.size();
   }

   /**
    * @param addStone
    */
   public void incrementPit(Stone addStone)
   {
       stoneContainer.add(addStone);
   }

   /**
    * @return
    */
   public ArrayList<Stone> unpopulatePit()
   {
       return stoneContainer;
   }

   @Override
   protected void paintComponent(Graphics g)
   {
       super.paintComponent(g);
   }

   @Override
   public void update(Observable o, Object arg)
   {
       // Updates the stone color
   }
}