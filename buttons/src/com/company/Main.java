package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TERMINAKOV");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Instructions");
        panel.add(button);
        button.addActionListener (new Action1());

        JButton button2 = new JButton("Start the Game");
        panel.add(button2);
        button.addActionListener (new Action2());
    }
    static class Action1 implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            JFrame frame2 = new JFrame("Instructions");
            frame2.setVisible(true);
            frame2.setSize(400,400);
            JLabel label = new JLabel("" +
                    "Once upon a time there was a GREAT SUPREME programmer and LEADER \r\n" +
                    "He tried to make a machine with its own artificial intelligence \r\n" +
                    "AND he DID ..... but .....\r\n" +
                    ".... the machine turned against its creator and even more ......\r\n" +
                    "it turned itself to a complete copy of the GREAT SUPREME programmer and LEADER\r\n" +
                    ".... and now your job is to kill it. KILL IT BEFORE IT IS TOO LATE......" +
                    "");
            JPanel panel = new JPanel();
            frame2.add(panel);
            panel.add(label);
        }
    }
    static class Action2 implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            JFrame frame3 = new JFrame("TERMINAKOV");
            frame3.setVisible(true);
            frame3.setSize(400,400);

            JLabel label = new JLabel("tuka ve4e trqbva da e samata igra");
            JPanel panel = new JPanel();
            frame3.add(panel);
            panel.add(label);
        }
    }
}