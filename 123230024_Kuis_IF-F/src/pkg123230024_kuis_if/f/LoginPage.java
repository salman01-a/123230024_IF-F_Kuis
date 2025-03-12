/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230024_kuis_if.f;

import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame  implements ActionListener {
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JPasswordField pass = new JPasswordField();
    JTextField user = new JTextField();
    
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    int logincounter;
    public LoginPage()  {
        setVisible(true);
        setSize(720,480);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(username);
        add(password);
        add(user);
        add(pass);
        add(login);
        add(reset);
        
        username.setBounds(180,100,120,25);
        password.setBounds(180,160,120,25);
        user.setBounds(180,130,300,30);
        pass.setBounds(180,190,300,30);
        login.setBounds(180,240,300,30);
        reset.setBounds(180,300,300,30);
        
        login.addActionListener(this);
        reset.addActionListener(this);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        
            String Username = user.getText();
            String Pass = new String(pass.getPassword());
            
            if(e.getSource() == login){
                if(Username.equals("Salman")&& Pass.equals("123230024")){
                new HomePage(Username);
                dispose();
                
                }else{
                throw new Exception("Password Salah");
                }
            }else if(e.getSource() == reset){
                pass.setText("");
                user.setText("");
                
                        }
       }catch (Exception err){
        JOptionPane.showMessageDialog(this, err);
        logincounter++;
        if (logincounter >= 3){
        JOptionPane.showMessageDialog(this, "AKun terkunci");
        login.setEnabled(false);
        }
        }
    }
    
}
