//import java.lang.Object;
//import java.lang.Override;
//import java.util.Observable;
//import java.util.Observer;
//
// I'm not sure what the purpose of this class is, the things being tracked here
// should be tracked in the model.
//
//public class GameObject implements Observer {
//    // The correct number of total objects should be the total
//    // number of pits + cups + mancala + board = 48 + 12 + 2 + 1 = 63
//    static int objectCount;
//
//    /**
//     * Constructor for GameObject
//     */
//    public GameObject() {
//        objectCount++;
//    }
//
//    /**
//     * Returns the count of the object
//     * @return
//     */
//    public int getCount() {
//        return objectCount;
//    }
//
//    @Override
//    public void update(Observable o, Object arg) {
//        //Had to Create, we didnt override the abstract method of observer called update
//    }
//}
