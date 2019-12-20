package View;

import AllObject.AllObject;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Model.Data_Treatment;
import java.awt.Color;

public class Insert_Treatment extends Object_IT
{
    private static String font = "Consolas";
    
    public Insert_Treatment ()
    {
        
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TREATMENT");
        setBackground(Color.yellow);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        
        judul.setBounds(50,10,200,30);
        judul.setFont(new Font(font, Font.BOLD, 20));
        judul.setForeground(Color.magenta);
        add(judul);
        
        id.setBounds(50, 50, 50, 30);
        id.setFont(new Font(font, Font.BOLD ,14));
        add(id);
        
        Id.setBounds(250, 50, 180, 30);
        Id.setFont(new Font(font, Font.BOLD ,13));
        add(Id);
        
        jenis.setBounds(50, 100, 130, 30);
        jenis.setFont(new Font(font, Font.BOLD ,14));
        add(jenis);
        
        jns.setBounds(250, 100, 180, 30);
        jns.setFont(new Font(font, Font.BOLD ,13));
        add(jns);
        
        harga.setBounds(50, 150, 50, 30);
        harga.setFont(new Font(font, Font.BOLD ,14));
        add(harga);
        
        hrg.setBounds(250, 150, 180, 30);
        hrg.setFont(new Font(font, Font.BOLD ,13));
        add(hrg);
        
        insert.setBounds(80, 230, 80, 20);
        insert.setFont(new Font(font, Font.BOLD, 13));
        insert.setBackground(Color.yellow);
        add(insert);
        
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Data Sudah Tersimpan");
                    Data_Treatment dt = new Data_Treatment(Id.getText(), jns.getText(), hrg.getText());
                    AllObject.treatArr.add(dt);
                    Id.setText("");
                    jns.setText("");
                    hrg.setText("");
            }
        });
        
        delete.setBounds(140, 280, 80, 20);
        delete.setFont(new Font(font, Font.BOLD, 13));
        delete.setBackground(Color.yellow);
        add(delete);

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Data Sudah Terhapus Silahkan Lihat Pada View");
                for (int i = 0; i < AllObject.treatArr.size(); i++) {
                    if (Id.getText().equals(AllObject.treatArr.get(i).getId())) {
                        AllObject.treatArr.get(i).setId(null);
                        AllObject.treatArr.get(i).setJenis(null);
                        AllObject.treatArr.get(i).setHarga(null);
                    }
                }
            }
        });
        
        update.setBounds(260, 280, 80, 20);
        update.setFont(new Font(font, Font.BOLD, 13));
        update.setBackground(Color.yellow);
        add(update);
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "DATA SUDAH DI UPDATE");
                for (int a = 0; a < AllObject.treatArr.size(); a++) {
                    
                    if (Id.getText().equals(AllObject.treatArr.get(a).getId())) {
                        AllObject.treatArr.get(a).setJenis(jns.getText());
                        AllObject.treatArr.get(a).setHarga(hrg.getText());
                    }
                }
            }
        });
            
        view.setBounds(200, 230, 80, 20);
        view.setFont(new Font(font, Font.BOLD, 13));
        view.setBackground(Color.yellow);
        add(view);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JFrameViewTreatment().setVisible(true);
                dispose();
            }
        });
        
        exit.setBounds(320, 230, 80, 20);
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
