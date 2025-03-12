    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230024_kuis_if.f;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class HomePage extends JFrame implements ActionListener{
    
    JLabel labeljudul = new JLabel();
    JLabel labelpensil = new JLabel("Pensil Rp.2.000");
    JLabel labelpulpen = new JLabel("Pulpen Rp.5.000");
    JLabel labelbuku = new JLabel("Pensil Rp.10.000");
    
    JTextField pensil = new JTextField();
    JTextField pulpen = new JTextField();
    JTextField buku = new JTextField();
    
    JButton beli = new JButton("Beli");
    JButton logout = new JButton("LogOut");
    String user;
    HomePage(String user){
        this.user = user;
        setVisible(true);
        setSize(720,480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(labeljudul);
        add(labelpensil);
        add(labelpulpen);
        add(labelbuku);
        
        add(pensil);
        add(pulpen);
        add(buku);
        add(beli);
        add(logout);
        
        labeljudul.setText("Selamat Datang, "+ user);
        labeljudul.setBounds(20,20,300,30);
                
        labelpensil.setBounds(20,70,150,30);
        labelpulpen.setBounds(20,120,150,30);
        labelbuku.setBounds(20,170,150,30);
        
        pensil.setBounds(190,70,180,30);
        pulpen.setBounds(190,120,180,30);
        buku.setBounds(190,170,180,30);
        beli.setBounds(20,220,420,40);
        logout.setBounds(20,280,420,40);
        
        beli.addActionListener(this);
        logout.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == beli){
            int pencil = Integer.parseInt(pensil.getText());
            int pen = Integer.parseInt(pulpen.getText());
            int book = Integer.parseInt(buku.getText());
            
            if(pencil <=0 || pen <= 0 || book <=0){
            throw new Exception("Masukan Jumlah yang benar");
            
            }
           int hargapensil = 2000;
           int hargapulpen = 5000;
           int hargabuku = 10000;
           
           int subpensil = hargapensil * pencil;
           int subpulpen = hargapulpen * pen;
           int subbuku = hargabuku * book;
           
           int subtotal = subpensil + subpulpen + subbuku;
           int total;
           int diskon;
           if (subtotal >= 100000){
               diskon = subtotal * 20/100;
               total = subtotal - diskon;
               JOptionPane.showMessageDialog(this, "Selamat anda mendapat diskon 20%");
               new PaymentPage(user, pencil, pen ,book , subpensil,subpulpen,subbuku, subtotal , total , diskon);
               dispose();
           }else if (subtotal >= 50000){
               diskon = subtotal * 10/100;
               total = subtotal - diskon;
               JOptionPane.showMessageDialog(this, "Selamat anda mendapat diskon 10%");
               new PaymentPage(user, pencil, pen, book, subpensil, subpulpen, subbuku, subtotal, total, diskon);
               dispose();
           }
            
            }else if(e.getSource()== logout){
                new LoginPage();
            }
        
        }catch (Exception err){
        JOptionPane.showMessageDialog(this, err);
        }

    }
}
