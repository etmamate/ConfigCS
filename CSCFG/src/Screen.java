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

        // CheckBox
        JCheckBox dotCheckBox = new JCheckBox();
        dotCheckBox.setText("Ponto na Mira");
        dotCheckBox.setBounds(200, 100, 110, 20);

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
                    if (dotCheckBox.isSelected()) {
                        File file = new File("file.txt");
                        try (FileWriter fileWriter = new FileWriter("file.txt")) {
                            fileWriter.write("cl_crosshairdot 1");
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        System.out.println("ta nao o");
                    }
                }
            }

        });
    }

}
