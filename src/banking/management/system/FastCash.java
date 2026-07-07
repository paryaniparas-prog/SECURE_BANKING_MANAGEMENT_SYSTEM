package banking.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FastCash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    String Accountno;

    FastCash(String pin, String Accountno){

        this.pin = pin;
        this.Accountno = Accountno;

        setLayout(null);

        JLabel text = new JLabel("Select Withdrawal Amount");
        text.setBounds(150,50,300,30);
        text.setFont(new Font("System",Font.BOLD,16));
        add(text);

        b1 = new JButton("Rs 100");
        b1.setBounds(50,120,120,30);
        add(b1);

        b2 = new JButton("Rs 500");
        b2.setBounds(200,120,120,30);
        add(b2);

        b3 = new JButton("Rs 1000");
        b3.setBounds(50,170,120,30);
        add(b3);

        b4 = new JButton("Rs 2000");
        b4.setBounds(200,170,120,30);
        add(b4);

        b5 = new JButton("Rs 5000");
        b5.setBounds(50,220,120,30);
        add(b5);

        b6 = new JButton("Rs 10000");
        b6.setBounds(200,220,120,30);
        add(b6);

        b7 = new JButton("Back");
        b7.setBounds(125,270,120,30);
        add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(400,400);
        setLocation(350,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b7){
            setVisible(false);
        }
    }
}