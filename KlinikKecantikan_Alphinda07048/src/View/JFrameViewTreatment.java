package View;

import AllObject.AllObject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import Model.Data_Treatment;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JFrameViewTreatment extends JFrame
{
    JTable tabel;
    private static String font = "Consolas";

    public JFrameViewTreatment(){
        setTitle("TABEL VIEW TREATMENT");
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
        model.addColumn("JENIS");
        model.addColumn("HARGA");
        
//        model.addRow(new String[] { "1", "Normal Facial", String.valueOf(150000) });
//        model.addRow(new String[] { "2", "Acne Facial", String.valueOf(350000) });
//        model.addRow(new String[] { "3", "Collagen Facial", String.valueOf(600000) });
//        model.addRow(new String[] { "4", "Anti-Aging Facial", String.valueOf(450000) });
//        model.addRow(new String[] { "5", "Brightening Facial", String.valueOf(900000) });
//        model.addRow(new String[] { "6", "Gold Facial", String.valueOf(350000) });
                 
        for (int i = 0; i < AllObject.treatArr.size(); i++) {
            
            String data[]=new String[4];
            data[0]=AllObject.treatArr.get(i).getId();
            data[1]=AllObject.treatArr.get(i).getJenis();
            data[3]=AllObject.treatArr.get(i).getHarga();
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
                new Insert_Treatment().setVisible(true);
                dispose();
            }
        });

        setVisible(true);
        
     return model;    
    }
    
}
