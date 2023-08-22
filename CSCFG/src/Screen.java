import javax.swing.*;

public class Screen extends JFrame {
    public Screen(){
        setTitle("CFG Config");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setLayout(null);

        JButton cfg = new JButton("CFG");
        cfg.setBounds(400,300,100,50);
        add(cfg);
    }
}
