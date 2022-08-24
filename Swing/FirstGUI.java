package Swing;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        Abc obj=new Abc();
    }

}
class Abc extends JFrame {
    public Abc(){
        setLayout(new FlowLayout());
        JLabel l=new JLabel("Hello Akash");
        JLabel l1=new JLabel("Welcome Home");
        add(l);
        add(l1);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

