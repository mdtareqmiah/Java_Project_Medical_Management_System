package Hospital1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class addPatient extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label1,/*label21,*/ label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17;
    JTextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7, textfield8, textfield9, textfield10, textfield11, textfield12, textfield13, textfield14, textfield15, textfield16, textfield17;
    JPasswordField passfield;
    JButton button1, button2,button3;
    JRadioButton jrb1,jrb2,jrb3,jrb4;

    addPatient() {
        frame = new JFrame("AddPatient(Register)");
        frame.setBackground(Color.YELLOW);
        frame.setLayout(null);

        label1 = new JLabel();
        label1.setBounds(0, 0, 1200, 800);
        label1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital1/img1/bgimg14.jpg"));
        Image img1 = img.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(img1);
        label1.setIcon(img2);

        label2 = new JLabel("Register as a Patient");
        label2.setBounds(400, 50, 400, 40);
        label2.setFont(new Font("Arial", Font.BOLD, 35));
        label1.add(label2);
        frame.add(label1);
        
//        label21 = new JLabel("Gender");
//        label21.setBounds(650,570,200,30);
//        label21.setFont(new Font("Arial",Font.BOLD,18));
//        label1.add(label21);
//        
//        jrb1 = new JRadioButton("Male");
//        jrb1.setBounds(850,570,70,30);
//        label1.add(jrb1);
//        jrb2 = new JRadioButton("Female");
//        jrb2.setBounds(920,570,70,30);
//        label1.add(jrb2);
//        jrb3 = new JRadioButton("Third G");
//        jrb3.setBounds(990,570,70,30);
//        label1.add(jrb3);
        
        //Left side
        label3 = new JLabel();
        label3.setText("Name");
        label3.setBounds(100, 150, 200, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        label1.add(label3);
        
        textfield3 = new JTextField();
        textfield3.setBounds(300,150,220,30);
        label1.add(textfield3);
        
        label4 = new JLabel("Email");
        label4.setBounds(100,220,200,30);
        label4.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label4);
        
        textfield4 = new JTextField();
        textfield4.setBounds(300,220,220,30);
        label1.add(textfield4);
        
        label5 = new JLabel("Father's Name");
        label5.setBounds(100,290,200,30);
        label5.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label5);
        
        textfield5 = new JTextField();
        textfield5.setBounds(300,290,220,30);
        label1.add(textfield5);
        
        label6 = new JLabel("Maritial Status");
        label6.setBounds(100,360,200,30);
        label6.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label6);
        
        textfield6 = new JTextField();
        textfield6.setBounds(300,360,220,30);
        label1.add(textfield6);
        
        label7 = new JLabel("Gender");
        label7.setBounds(100,430,200,30);
        label7.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label7);
        
        textfield7 = new JTextField();
        textfield7.setBounds(300,430,220,30);
        label1.add(textfield7);
        
        label8 = new JLabel("Date of Birth");
        label8.setBounds(100,500,200,30);
        label8.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label8);
        
        textfield8 = new JTextField();
        textfield8.setBounds(300,500,220,30);
        label1.add(textfield8);
        
        label9 = new JLabel("Address");
        label9.setBounds(100,570,200,30);
        label9.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label9);
        
        textfield9 = new JTextField();
        textfield9.setBounds(300,570,220,30);
        label1.add(textfield9);
        
                
        //Right side 
        label10 = new JLabel("Username");
        label10.setBounds(650,150,200,30);
        label10.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label10);
        
        textfield10 = new JTextField();
        textfield10.setBounds(850,150,220,30);
        label1.add(textfield10);
        
        label11 = new JLabel("Password");
        label11.setBounds(650,220,200,30);
        label11.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label11);
        
        passfield = new JPasswordField();
        passfield.setBounds(850,220,220,30);
        label1.add(passfield);
                
        label12 = new JLabel("Phone");
        label12.setBounds(650,290,200,30);
        label12.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label12);
        
        textfield12 = new JTextField();
        textfield12.setBounds(850,290,220,30);
        label1.add(textfield12);
        
        label13 = new JLabel("City");
        label13.setBounds(650,360,200,30);
        label13.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label13);
        
        textfield13 = new JTextField();
        textfield13.setBounds(850,360,220,30);
        label1.add(textfield13);
        
        label14 = new JLabel("District");
        label14.setBounds(650,430,200,30);
        label14.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label14);
                
        textfield14 = new JTextField();
        textfield14.setBounds(850,430,220,30);
        label1.add(textfield14);
                        
        label15 = new JLabel("Blood Group");
        label15.setBounds(650,500,200,30);
        label15.setFont(new Font("Arial",Font.BOLD,18));
        label1.add(label15);
        
        textfield15 = new JTextField();
        textfield15.setBounds(850,500,220,30);
        label1.add(textfield15);
        
        button1 = new JButton("Submit");
        button1.setBounds(600,650,100,30);
        button1.setFont(new Font("Tahoma",Font.CENTER_BASELINE,15));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        label1.add(button1);
        
        button2 = new JButton("Cancle");
        button2.setBounds(500,650,100,30);
        button2.setFont(new Font("Tahoma",Font.CENTER_BASELINE,15));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        label1.add(button2);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        
        
        frame.setSize(1200, 800);
        frame.setLocation(50, 100);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==button1){
            this.frame.setVisible(false);
            
        }
        if(ae.getSource()==button2){
            this.frame.setVisible(false);
            new LoginPagePatient();
        }
    }

    public static void main(String[] args) {
        new addPatient();
    }
}
