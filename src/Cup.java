

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

    public void incrementCup(Pit addPit) {
        pitContainer.add(Pit addPit);
    }

    public ArrayList<Pit> unpopulateCup() {
        return pitContainer;
    }
}