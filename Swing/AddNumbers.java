package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNumbers {
    Addition obj=new Addition();

}
class Addition extends JFrame implements ActionListener
{
    public Addition(){
        JTextField t1= new JTextField(20);
        JTextField t2= new JTextField(20);
        JButton b= new JButton("ok");
        JLabel l=new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
