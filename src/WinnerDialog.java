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

    public WinnerDialog() {
        jFrame = new JFrame();
        winnerLable = new JLabel("");

        jFrame.setResizable(false);
        jFrame.setVisible(true);

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}