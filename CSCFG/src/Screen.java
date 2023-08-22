import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class Screen extends JFrame {

    String dot = "cl_crosshairdot 1";
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

        //Botao CFG
        JButton cfgButton = new JButton("CFG");

        cfgButton.setBounds(720,10,60,30);
        
        cfgButton.setForeground(new Color(255, 255, 255));
        cfgButton.setBackground(new Color(11,0,28));
        
        cfgButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Funcionou");
            }
            
        });
        

        add(cfgButton);
        
        //CheckBox
        JCheckBox dotCheckBox = new JCheckBox("Ponto na Mira");

        dotCheckBox.setBounds(200,100,110,20);
        
        dotCheckBox.setForeground(new Color(255, 255, 255));
        dotCheckBox.setBackground(new Color(11,0,28));
        dotCheckBox.isDisplayable();
        dotCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Tbm Funfa");
            }
            
        });

        add(dotCheckBox);

        

    }
}
