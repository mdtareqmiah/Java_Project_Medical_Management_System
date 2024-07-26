package Hospital1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AdminHomePage extends JFrame{
    JFrame frame;
    JLabel label1, label2, label3, label4, label5;
    JMenu menu1, menu2, menu3,menu4,menu5;
    JMenuBar menubar;
    
    AdminHomePage(){
        frame = new JFrame("Admin Home Page");
        frame.setBackground(Color.RED);
        frame.setLayout(null);
        
        label1 = new JLabel();
        label1.setBounds(0,0,1600,1000);
        label1.setLayout(null);
                      
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital1/img1/bgimgp1.png"));
        Image img1 = img.getImage().getScaledInstance(1500,1000,Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(img1);
        label1.setIcon(img2);
        frame.add(label1);
        
        label2 = new JLabel("Doctor");
        label2.setBounds(0,0,50,20);
        label1.add(label2);
                                   
        frame.setSize(1000,800);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new AdminHomePage();
    }
}
