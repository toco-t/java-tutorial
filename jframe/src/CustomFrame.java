import javax.swing.JFrame;
import java.awt.*;

public class CustomFrame extends JFrame{

    CustomFrame() {
        // add title
        this.setTitle("JFrame");

        // exit frame when closing
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set default size
        this.setSize(420, 420);

        // make frame visible
        this.setVisible(true);

        // set background colour
        this.getContentPane().setBackground(new Color(33, 33, 33));
    }
}
