import javax.swing.JOptionPane;

public class GraphicalUserInterface {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

        long studentNumber = Long.parseLong(JOptionPane.showInputDialog("Enter your student number:" ));
        JOptionPane.showMessageDialog(null, "No. " + studentNumber);

    }
}
