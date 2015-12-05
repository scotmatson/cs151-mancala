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
public class Stone {
    private final int STONE_WIDTH = 10;
    private final int STONE_HEIGHT = 10;
    private int xPos;
    private int yPos;
    private Color color;

    /**
     * Constructor method for the Stone class
     */
    public Stone() {
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
     * @param c a Color object
     */
    public void setColor(Color c) {
        color = c;
    }
}