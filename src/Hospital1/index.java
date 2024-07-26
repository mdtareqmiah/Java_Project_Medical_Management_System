package Hospital1;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class index extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label1, label2, label3;
    JButton button1, button2, button3, button4;

    index() {
        frame = new JFrame("Index Page");
        frame.setBackground(Color.BLACK);
        frame.setLayout(null);

        label1 = new JLabel();
        label1.setBounds(0, 0, 900, 670);
        label1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital1/img1/FirstPage.jpg"));
        Image img1 = img.getImage().getScaledInstance(900, 670, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(img1);
        label1.setIcon(img2);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("Hospital1/img1/LOGO.png"));
        frame.setIconImage(image1.getImage());

        label2 = new JLabel("Unique Medical Group");
        label2.setBounds(250, 50, 600, 40);
        label2.setFont(new Font("Arial", Font.BOLD, 40));
        label2.setForeground(Color.BLACK);
        label1.add(label2);
        frame.add(label1);

        label3 = new JLabel("Provide Best quality health service");
        label3.setBounds(295, 100, 600, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(Color.BLACK);
        label1.add(label3);

        button1 = new JButton("Doctor");
        button1.setBounds(220, 170, 200, 40);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Tahoma", Font.BOLD, 25));
        label1.add(button1);

        button2 = new JButton("Patient");
        button2.setBounds(470, 170, 200, 40);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Arial", Font.BOLD, 25));
        label1.add(button2);

        button3 = new JButton("Receptionist");
        button3.setBounds(220, 260, 200, 40);
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Arial", Font.BOLD, 25));
        label1.add(button3);

        button4 = new JButton("Admin");
        button4.setBounds(470, 260, 200, 40);
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setFont(new Font("Arial", Font.BOLD, 25));
        label1.add(button4);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        frame.setSize(900, 670);
        frame.setLocation(200, 100);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            frame.setVisible(false);
            new LoginPage();
        }
        if (ae.getSource() == button2) {
            frame.setVisible(false);
            new LoginPagePatient();
        }
        if (ae.getSource() == button3) {
            frame.setVisible(false);
            new LoginPage();
        }
        if (ae.getSource() == button4) {
            frame.setVisible(false);
            new LoginPage();
        }
    }

    public static void main(String[] args) {
        new index();
    }
}
