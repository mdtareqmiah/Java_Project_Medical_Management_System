package Hospital1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener {

    JFrame frame;
    //JPanel panel;
    JLabel label1, label2, label3, label4;
    JTextField textfield;
    JPasswordField passfield;
    JButton button1, button2;

    LoginPage() {
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
        label2.setBounds(190, 30, 500, 50);
        label2.setFont(new Font("Arial", Font.BOLD, 40));
        label2.setForeground(Color.WHITE);
        label1.add(label2);
        frame.add(label1);

        label3 = new JLabel("Username: ");
        label3.setBounds(130, 120, 150, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(Color.WHITE);
        label1.add(label3);

        label4 = new JLabel("Password: ");
        label4.setBounds(130, 170, 150, 30);
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        label4.setForeground(Color.WHITE);
        label1.add(label4);

        textfield = new JTextField();
        textfield.setBounds(310, 120, 150, 30);
        label1.add(textfield);

        passfield = new JPasswordField();
        passfield.setBounds(310, 170, 150, 30);
        label1.add(passfield);

        button1 = new JButton("Log In");
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        button1.setBounds(310, 220, 150, 30);
        label1.add(button1);

        button2 = new JButton("Back");
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
        button2.setBounds(130, 220, 150, 30);
        label1.add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(780, 400);
        frame.setLocation(300, 200);
        frame.setResizable(false);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==button1){
            try{
                ConnectionDbms obj=new ConnectionDbms();
                String name = textfield.getText();
                String pass = passfield.getText();
                String q="select * from admin where username= '"+name+"' and password= '"+pass+"'";
                ResultSet result = obj.stm.executeQuery(q);
                if(result.next()){
                    new AdminHomePage();
                    frame.setVisible(false);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"You have enter wrong username and password.");
                    frame.setVisible(false);
                    frame.setVisible(true);
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(ae.getSource()==button2){
            this.frame.setVisible(false);
            new index();
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
