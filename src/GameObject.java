//import java.lang.Object;
//import java.lang.Override;
//import java.util.Observable;
//import java.util.Observer;
//


// I'm not sure what the purpose of this class is, the things being tracked here
// should be tracked in the model.

// This might be better off being an abstract class if we continue to use it,
// since the class name is ambiguous, similar to the use of the GameBoard class.

// I think we should leverage these for our decorator pattern if possible.

public class GameObject
{
    // The correct number of total objects should be the total
    // number of pits + cups + mancala + board = 48 + 12 + 2 + 1 = 63
    static int objectCount;

    /**
     * Constructor for GameObject
     */
    public GameObject() {
        objectCount++;
    }

    /**
     * Returns the count of the object
     * @return
     */
    public int getCount() {
        return objectCount;
    }
}