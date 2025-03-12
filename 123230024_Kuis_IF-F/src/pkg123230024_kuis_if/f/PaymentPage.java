/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230024_kuis_if.f;

import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class PaymentPage extends JFrame implements ActionListener {
    JLabel labeljudul = new JLabel("Daftar Pembelian ");
    JLabel labelpensil = new JLabel();
    JLabel labelpulpen = new JLabel();
    JLabel labelbuku = new JLabel();
    JLabel labelsubtotal = new JLabel();
    JLabel labeldiskon = new JLabel();
    JLabel labeltotal = new JLabel();
    JButton kembali = new JButton("Kembali");
    
    int pensil;
    int pulpen;
    int buku;
    
    int subpensil;
    int subpulpen;
    int subbuku;
    int subtotal;
    int diskon;
    int total;
    String user;
    public PaymentPage(String user, int pencil, int pen, int book, int subpensil, int subpulpen, int subbuku, int subtotal, int total, int diskon) {
        this.user = user;
        this.pensil= pencil;
        this.pulpen = pen;
        this.buku = book;
        this.subpensil = subpensil;
        this.subpulpen = subpulpen;
        this.subbuku = subbuku;
        this.total= total;
        this.diskon = diskon;
        setVisible(true);
        setSize(720,480);
        setTitle("Halaman Pembelian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(labeljudul);
        add(labelpensil);
        add(labelpulpen);
        add(labelbuku);
        add(labelsubtotal);
        add(labeldiskon);
        add(labeltotal);
        add(kembali);
           
        
        labelpensil.setBounds(20,20,300,30);
        labelpulpen.setBounds(20,60,300,30);
        labelbuku.setBounds(20,100,300,30);
        labelsubtotal.setBounds(20,150,300,30);
        labeldiskon.setBounds(20,190,300,30);
        labeltotal.setBounds(20,230,300,30);
        kembali.setBounds(20,270,300,30);
        
        labelpensil.setText("Pensil: x "+ pensil+ "Rp2.000 = "+ subpensil);
        labelpulpen.setText("Pensil: x"+ pulpen+ "Rp2.000 = "+ subpulpen);
        labelbuku.setText("Pensil: x"+ buku+ "Rp2.000 = "+ subbuku);
        labelsubtotal.setText("Subtotal: Rp"+subtotal);
        labeldiskon.setText("Diskon : Rp"+ diskon);
        labeltotal.setText("Total Harga: "+ total);

        
        kembali.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== kembali){
        new HomePage(user);
        dispose();
        }
            
    }
    
}
