import java.awt.Color;

import javax.swing.*;

public class Screen extends JFrame {
    public Screen(){
        //Configurations
        setTitle("CFG Config");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
        //BG Color
        
        getContentPane().setBackground(new Color(11,0,28));

        //Layout
        setLayout(null);

        JButton cfg = new JButton("CFG");
        cfg.setBounds(720,10,60,30);
        cfg.setForeground(new Color(255, 255, 255));
        cfg.setBackground(new Color(11,0,28));
        add(cfg);
    }
}
