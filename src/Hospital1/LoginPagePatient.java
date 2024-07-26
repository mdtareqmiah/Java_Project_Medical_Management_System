package Hospital1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPagePatient extends JFrame implements ActionListener {

    JFrame frame;
    //JPanel panel;
    JLabel label1, label2, label3, label4, label5;
    JTextField textfield;
    JPasswordField passfield;
    JButton button1, button2, button3;

    LoginPagePatient() {
        frame = new JFrame("LogIn Page");
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);

        label1 = new JLabel();
        label1.setBounds(0, 0, 780, 400);
        label1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital1/img1/bgimg15.jpg"));
        Image img1 = img.getImage().getScaledInstance(780, 400, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(img1);
        label1.setIcon(img2);

        label2 = new JLabel("Login Page");
        label2.setBounds(130, 30, 500, 50);
        label2.setFont(new Font("Arial", Font.BOLD, 40));
        label2.setForeground(Color.WHITE);
        label1.add(label2);
        frame.add(label1);

        label3 = new JLabel("Username: ");
        label3.setBounds(70, 120, 150, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(Color.WHITE);
        label1.add(label3);

        label4 = new JLabel("Password: ");
        label4.setBounds(70, 170, 150, 30);
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        label4.setForeground(Color.WHITE);
        label1.add(label4);

        label5 = new JLabel("If you are a new user register here ");
        label5.setBounds(50, 280, 500, 30);
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setForeground(Color.WHITE);
        label1.add(label5);

        textfield = new JTextField();
        textfield.setBounds(250, 120, 150, 30);
        label1.add(textfield);

        passfield = new JPasswordField();
        passfield.setBounds(250, 170, 150, 30);
        label1.add(passfield);

        button1 = new JButton("Log In");
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        button1.setBounds(250, 220, 150, 30);
        label1.add(button1);

        button2 = new JButton("Home1");
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
        button2.setBounds(70, 220, 150, 30);
        label1.add(button2);

        button3 = new JButton("Register");
        button3.setBackground(Color.WHITE);
        button3.setForeground(Color.BLACK);
        button3.setBounds(380, 285, 100, 20);
        label1.add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(780, 400);
        frame.setLocation(300, 200);
        frame.setResizable(false);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {

        }
        if (ae.getSource() == button2) {
            this.frame.setVisible(false);
            new index();
        }
        if (ae.getSource()== button3){
            this.frame.setVisible(false);
            new addPatient();
        }
    }

    public static void main(String[] args) {
        new LoginPagePatient();
    }
}
