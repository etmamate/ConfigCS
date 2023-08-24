import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import javax.swing.*;

public class Screen extends JFrame {

    public Screen() {
        // Configurations
        setTitle("CFG Config");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        // BG Color

        getContentPane().setBackground(new Color(11, 0, 28));

        // Layout
        setLayout(null);

        // CheckBox Ponto na Mira
        JCheckBox dotCheckBox = new JCheckBox();
        dotCheckBox.setText("Ponto na Mira");
        dotCheckBox.setBounds(50, 40, 110, 20);

        dotCheckBox.setForeground(new Color(255, 255, 255));
        dotCheckBox.setFocusable(false);
        dotCheckBox.setBackground(new Color(11, 0, 28));
        dotCheckBox.isDisplayable();

        // Action
        dotCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });

        add(dotCheckBox);

        // Check Box CorMira
        JCheckBox colorGreen = new JCheckBox();
        colorGreen.setText("Mira Cor Verde");

        colorGreen.setBounds(50, 80, 110, 20);

        colorGreen.setForeground(new Color(0, 255, 0));
        colorGreen.setFocusable(false);
        colorGreen.setBackground(new Color(11, 0, 28));
        colorGreen.isDisplayable();

        // Action
        colorGreen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });

        add(colorGreen);

        // Botao CFG
        JButton cfgButton = new JButton();

        cfgButton.setText("CFG");
        cfgButton.setBounds(720, 10, 60, 30);

        cfgButton.setForeground(new Color(255, 255, 255));
        cfgButton.setBackground(new Color(11, 0, 28));

        add(cfgButton);

        cfgButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cfgButton) {
                    System.out.println(dotCheckBox.isSelected());
                    File file = new File("file.txt");

                    if (dotCheckBox.isSelected()) {
                        try (FileWriter fileWriter = new FileWriter("cfg.txt")) {
                            fileWriter.write("cl_crosshairdot 1");
                            fileWriter.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        System.out.println("ta nao o");
                    }
                }
            }

        });

        cfgButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == cfgButton){
                    
                }
            }
            
        });
    }

}
