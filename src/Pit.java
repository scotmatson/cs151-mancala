import java.util.ArrayList;

public class Pit extends GameObject
{
   private int cupID;
   private ArrayList<Stone> stoneContainer;

    public Pit()
    {
        cupID = super.getCount();
        stoneContainer = new ArrayList<>();
    }

   /**

    @param newStone
    */
    public void populateCup(ArrayList<Stone> newStone)
    {
        for (int i = 0; i < newStone.size(); i++)
        {
           stoneContainer.add(newStone.get(i));
        }
    }

    /**
     * Increments the pit location
     * (was implemented because a call was made to a
     * method that didnt exist. Will fill in once understood)
     */
    public void incrementPit()
    {

    }

   /**

    @param addStone
    */
    public void incrementCup(Stone addStone)
    {
        stoneContainer.add(addStone);
    }

   /**

    @return
    */
    public ArrayList<Stone> unpopulateCup()
    {
        return stoneContainer;
    }

   /**

    @return
    */
   public int getSize()
   {
      return stoneContainer.size();
   }

}
