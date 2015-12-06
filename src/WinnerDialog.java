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
    private JLabel winnerLabel;
    private JFrame jFrame;
    private MancalaModel mancalaModel;

    public WinnerDialog() {
        jFrame = new JFrame();
        winnerLabel = new JLabel();
        mancalaModel = new MancalaModel();

        jFrame.setSize(200,300);

        jFrame.setResizable(false);
        jFrame.setVisible(true);

        jFrame.add(winnerLabel);

    }

    /**
     * Sets the winner
     */
    public void setWinnerLable() {
        if(mancalaModel.playerOneWins > mancalaModel.playerTwoWins) {
            winnerLabel.setText("Congrats! Player 1 wins");
        }
        else {
            winnerLabel.setText("Congrats! Player 2 wings");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
    setWinnerLable();
    }
}