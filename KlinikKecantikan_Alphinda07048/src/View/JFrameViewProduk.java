package View;

import AllObject.AllObject;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JFrameViewProduk extends JFrame {

    JTable tabel;
    private static String font = "Consolas";

    public JFrameViewProduk(){
        setTitle("TABEL VIEW PRODUK");
        setSize(600, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tabel = new JTable(viewTabel());
        JScrollPane scroll = new JScrollPane(tabel);
        scroll.setBounds(0, 0, 600, 500);
        add(scroll);
        
        
    }
    public DefaultTableModel viewTabel()
    {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("PRODUK");
        model.addColumn("JUMLAH");
        model.addColumn("HARGA");
        
//        model.addRow(new String[] { "1", "Toner", String.valueOf(50), String.valueOf(200000) });
//        model.addRow(new String[] { "2", "Night Cream", String.valueOf(45), String.valueOf(300000) });
//        model.addRow(new String[] { "3", "Day Cream", String.valueOf(67), String.valueOf(230000) });
//        model.addRow(new String[] { "4", "Cleanser", String.valueOf(90), String.valueOf(90000) });
//        model.addRow(new String[] { "5", "Acne Cream", String.valueOf(35), String.valueOf(85000) });
//        model.addRow(new String[] { "6", "Sun Screen", String.valueOf(93), String.valueOf(280000) });
          
        
        for (int i = 0; i < AllObject.produkArr.size(); i++) {
            
            String data[]=new String[4];
            data[0]=AllObject.produkArr.get(i).getId();
            data[1]=AllObject.produkArr.get(i).getProduk();
            data[2]=AllObject.produkArr.get(i).getJumlah();
            data[3]=AllObject.produkArr.get(i).getHarga();
            model.addRow(data);
        }
        
        JButton back = new JButton("BACK");
        back.setBounds(500, 520, 80, 20);
        back.setFont(new Font(font, Font.BOLD, 13));
        back.setBackground(Color.yellow);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Insert_Produk().setVisible(true);
                dispose();
            }
        });

        setVisible(true);
        
     return model;    
    }
 
}
