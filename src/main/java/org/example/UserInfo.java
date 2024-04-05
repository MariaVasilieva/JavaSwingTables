package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInfo extends JFrame{
    private JTable table;
    private DefaultTableModel model;
    private JTextField nameField, ageField;
    private JButton addButton;
    private JButton deleteButton;
    public UserInfo(){
        setTitle("Users Table");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        createTable();

        add(new JScrollPane(table),BorderLayout.CENTER);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        nameField = new JTextField(10);
        panel.add(nameField);
        panel.add(new JLabel("Age:"));
        ageField = new JTextField(10);
        panel.add(ageField);
        createAddButton();
        panel.add(addButton);
        createDeleteButton();
        panel.add(deleteButton);
        add(panel,BorderLayout.SOUTH);
    }
    private void createTable(){
        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");
        table = new JTable(model);
    }
    private void createAddButton(){
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                model.addRow(new Object[]{name,age});
                nameField.setText("");
                ageField.setText("");
            }
        });
    }
    private void createDeleteButton(){
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if(selectedRow==-1){
                    JOptionPane.showMessageDialog(UserInfo.this,"Choose row!","Error",JOptionPane.ERROR_MESSAGE);
                }
                model.removeRow(selectedRow);
            }
        });
    }
    public static void main(String[] args) {
        UserInfo tableframe = new UserInfo();
        tableframe.setVisible(true);
    }
}
