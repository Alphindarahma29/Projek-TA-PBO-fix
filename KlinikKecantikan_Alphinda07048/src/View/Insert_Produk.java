package View;

import AllObject.AllObject;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Model.Data_Produk;
import java.awt.Color;

public class Insert_Produk extends Object_IP {

    private static String font = "Consolas";
    private static String jd = "Arial";

    public Insert_Produk() 
    {
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.yellow);
        setTitle("PRODUK KECANTIKAN");
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        
        judul.setBounds(50,10,200,30);
        judul.setFont(new Font(jd, Font.BOLD, 20));
        judul.setForeground(Color.magenta);
        add(judul);

        id.setBounds(50, 50, 50, 30);
        id.setFont(new Font(font, Font.BOLD, 14));
        add(id);

        Id.setBounds(250, 50, 180, 30);
        Id.setFont(new Font(font, Font.BOLD, 13));
        add(Id);

        produk.setBounds(50, 100, 50, 30);
        produk.setFont(new Font(font, Font.BOLD, 14));
        add(produk);

        prd.setBounds(250, 100, 180, 30);
        prd.setFont(new Font(font, Font.BOLD, 13));
        add(prd);

        jumlah.setBounds(50, 150, 50, 30);
        jumlah.setFont(new Font(font, Font.BOLD, 14));
        add(jumlah);

        jml.setBounds(250, 150, 180, 30);
        jml.setFont(new Font(font, Font.BOLD, 13));
        add(jml);

        harga.setBounds(50, 200, 50, 30);
        harga.setFont(new Font(font, Font.BOLD, 14));
        add(harga);

        hrg.setBounds(250, 200, 180, 30);
        hrg.setFont(new Font(font, Font.BOLD, 13));
        add(hrg);
        
        insert.setBounds(50, 280, 80, 20);
        insert.setBackground(Color.yellow);
        insert.setFont(new Font(font, Font.BOLD, 13));
        add(insert);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Data Sudah Tersimpan");
                    Data_Produk dt = new Data_Produk(Id.getText(), prd.getText(), jml.getText(), hrg.getText());
                    AllObject.produkArr.add(dt);
                    
            }
        });
        
        delete.setBounds(150, 280, 80, 20);
        delete.setFont(new Font(font, Font.BOLD, 13));
        delete.setBackground(Color.yellow);
        add(delete);

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Data Sudah Terhapus Silahkan Lihat Pada View");
                for (int i = 0; i < AllObject.produkArr.size(); i++) {
                    if (Id.getText().equals(AllObject.produkArr.get(i).getId())) {
                        AllObject.produkArr.get(i).setId(null);
                        AllObject.produkArr.get(i).setProduk(null);
                        AllObject.produkArr.get(i).setJumlah(null);
                        AllObject.produkArr.get(i).setHarga(null);
                    }
                }
            }
        });
        
        update.setBounds(200, 320, 80, 20);
        update.setFont(new Font(font, Font.BOLD, 13));
        update.setBackground(Color.yellow);
        add(update);
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "DATA SUDAH DI UPDATE");
                for (int a = 0; a < AllObject.produkArr.size(); a++) {
                    
                    if (Id.getText().equals(AllObject.produkArr.get(a).getId())) {
                        AllObject.produkArr.get(a).setProduk(prd.getText());
                        AllObject.produkArr.get(a).setJumlah(jml.getText());
                        AllObject.produkArr.get(a).setHarga(hrg.getText());
                    }else{
                        JOptionPane.showMessageDialog(null, "MAAF ID TIDAK ADA");
                    }
                }
            }
        });
        
        
        view.setBounds(250, 280, 80, 20);
        view.setFont(new Font(font, Font.BOLD, 13));
        view.setBackground(Color.yellow);
        add(view);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new JFrameViewProduk().setVisible(true);
               dispose();
            }
        });

        exit.setBounds(350, 280, 80, 20);
        exit.setFont(new Font(font, Font.BOLD, 13));
        exit.setBackground(Color.yellow);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null, "yakin?","Confirm", JOptionPane.YES_NO_OPTION);
                if(input == JOptionPane.YES_OPTION){
                    dispose();
                }
            }
        });
    }
}
