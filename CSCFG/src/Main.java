import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) throws Exception {
        
        JFrame frame = new JFrame("Config");
        JLabel label = new JLabel("CFG CONFIG");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        
    }
}
