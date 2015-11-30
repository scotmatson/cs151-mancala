import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * COPYRIGHT (C) 2015 Team Tertiary. All Rights Reserved.
 * <p/>
 * TODO: Class description
 * <p/>
 * Solves CS151 Project - Mancala Game
 *
 * @author Kenneth Cross, Scot Matson, Alex Preston
 * @version 1.01 2015/10/26
 */
public class Stone extends GameObject implements Observer {
    private final int STONE_ID;
    private final int STONE_WIDTH = 10;
    private final int STONE_HEIGHT = 10;
    private int playerId;
    private int xPos;
    private int yPos;
    private boolean inUse; // Can only be added to a cup when false
    private Color color;

    /**
     * Constructor method for the Stone class
     */
    public Stone() {
        STONE_ID = super.getCount();
        inUse = false;
    }

    /**
     * Returns the Stone Id when called
     */
    public int getStone() {
        return STONE_ID;
    }

    /**
     * Sets the players Id
     * @param id
     */
    public void setPlayerId(int id) {
        this.playerId = id;
    }

    /**
     * This returns the playerId
     * @return
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * Get the color of the stones
     *
     * @return a Color object
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color of the stones
     *
     * @param color a Color object
     */
    public void setColor(Color c) {
        color = c;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}