import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.lang.Object;
import java.lang.Override;
import java.util.Observable;
import java.util.Observer;

/**
 * Winner dialog
 * Author Alex,
 */
public class WinnerDialog implements Observer {
    private JLabel winnerLable;
    private JFrame jFrame;
    private MancalaModel mancalaModel;

    public WinnerDialog() {
        jFrame = new JFrame();
        winnerLable = new JLabel();
        mancalaModel = new MancalaModel();

        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }

    /**
     * Sets the winner
     */
    public void setWinnerLable() {
       // winnerLable.setText(java.lang.String.format("%s", "" + mancalaModel.));
    }

    @Override
    public void update(Observable o, Object arg) {
    setWinnerLable();
    }
}