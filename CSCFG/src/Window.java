

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
    public static void main(String[] args) {
        
        JFrame windowFrame = new JFrame("CFG CONFIG");
        windowFrame.setSize(800,600);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setVisible(true);
        windowFrame.setResizable(false);

        JLabel label = new JLabel(null, null, 0);
        label.setSize(200, 200);
        windowFrame.add(label);

        //CheckBox's
        JCheckBox dot = new JCheckBox("cl_crosshairdot 1", null, false);
        dot.setBounds(50, 50, 132, 50);
        windowFrame.add(dot);

        //Button
        JButton generateCFG = new JButton("Gerar CFG", null);
        generateCFG.setSize(120, 60);
        generateCFG.setLocation(350, 250);
        windowFrame.add(generateCFG);

        generateCFG.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                File cfg = new File("CFG.txt");
                try {
                    if(cfg.createNewFile()){
                        System.out.println("criou");
                    }else{
                        System.out.println("ja criado");
                    }
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
            
        });
        

    }
}
