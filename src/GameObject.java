
public class GameObject implements observer {
    // The correct number of total objects should be the total number of pits + cups + mancala + board = 48 + 12 + 2 + 1 = 63
    static int objectCount;

    public GameObject () {
        objectCount++;
    }

    public int getCoutn() { return objectCount; }
}