
import java.util.Observable;
import java.util.Observer;

/**
 * Created by scot on 11/14/15.
 */
public class Stone extends GameObject implements Observer {
    String textLabel;
    private int pitID;
    private boolean inUse; // Can only be added to a cup when false

    //Constructor for the pit
    public Stone() {
        pitID = super.getCount();
        inUse = false;
    }

    /**
     * Returns the Stone Id when called
     */
    public int getPit() {
        return pitID;
    }



    /**
     * Sets the PitId
     * @param pitID
     */
    public void setPit(int pitID) {
       this.pitID = pitID;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}