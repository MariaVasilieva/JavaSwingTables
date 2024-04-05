package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserWindow extends JFrame {
    public UserWindow(){
        setTitle("User info");
        setSize(500,300);
        setLocation(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Task 1
//        JPanel panel = new JPanel();
//        JLabel label = new JLabel("Enter your name:");
//        panel.add(label);
//        JTextField textField = new JTextField(20);
//        panel.add(textField);
//        JButton button = new JButton("OK");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = textField.getText();
//                JOptionPane.showMessageDialog(UserWindow.this,"Hello, "+name+" !");
//            }
//        });
//        panel.add(button);
//        add(panel);

        //Task 2
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter your date of birth: ");
        Integer[] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        JComboBox<Integer> day = new JComboBox<>(days);
        String[] monthes = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        JComboBox<String> month = new JComboBox<>(monthes);
        Integer[] years = {1990,1991,1992,1993, 1994,1995,1996,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022};
        JComboBox<Integer> year = new JComboBox<>(years);

        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dayOfBirth = (int)day.getSelectedItem();
                String monthOfBirth = (String) month.getSelectedItem();
                int yearOfBirth = (int) year.getSelectedItem();
                JOptionPane.showMessageDialog(UserWindow.this,"Date of birth: "+dayOfBirth+" "+monthOfBirth+" "+yearOfBirth);
            }
        });
        panel.add(label);
        panel.add(day);
        panel.add(month);
        panel.add(year);
        panel.add(button);
        add(panel);
    }
    public static void main(String[] args) {
        UserWindow userWindow = new UserWindow();
        userWindow.setVisible(true);
    }
}
