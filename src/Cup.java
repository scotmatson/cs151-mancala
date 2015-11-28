import java.util.ArrayList;

public class Cup extends GameObject {
    private ArrayList<Pit> pitContainer;
    private int cupID;

    public Cup () {
        cupID = super.getCount();
        pitContainer = new ArrayList<Pit>();
    }

    public void populateCup(ArrayList<Pit> newPit) {
        for (int i = 0; i < newPit.size(); i++) pitContainer.add(newPit.get(i));
    }

    /**
     * Increments the pit location
     * (was implemented because a call was made to a
     * method that didnt exist. Will fill in once understood)
     */
    public void incrementPit() {

    }

    public void incrementCup(Pit addPit) {
        pitContainer.add(addPit);
    }

    public ArrayList<Pit> unpopulateCup() {
        return pitContainer;
    }


}
