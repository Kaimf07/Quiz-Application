package quizapplication;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame{
    login(){
        getContentPane().setBackground(new Color(249,227,203));
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/log.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,640,480);
        add(image);

        ImageIcon i2= new ImageIcon(ClassLoader.getSystemResource("icons/quizz.jpg"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(720,80,235,190);
        add(image2);


        JLabel heading = new JLabel("The Lightening Quiz..");
        heading.setBounds(680,30,400,60);
        heading.setFont(new Font("Cooper Black",Font.BOLD,30));
        heading.setForeground(new Color(71,66,63));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(750,250,400,60);
        name.setFont(new Font("Cooper Black",Font.BOLD,20));
        name.setForeground(new Color(71,66,63));
        add(name);

        JTextField tfname=new JTextField();
        tfname.setBounds(700,300,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        


        setSize(1100,500);
        setLocation(100,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }
}
