package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Object_IP extends JFrame
{
        //label
        JLabel id = new JLabel("ID");
        JLabel produk = new JLabel("PRODUK");
        JLabel jumlah = new JLabel("JUMLAH");
        JLabel harga = new JLabel("HARGA");
        JLabel judul = new JLabel("DATA PRODUK");
        
        //TextField
        JTextField Id = new JTextField();
        JTextField prd = new JTextField();
        JTextField jml = new JTextField();
        JTextField hrg = new JTextField();
        
        //Button
        JButton insert = new JButton("Insert");
        JButton view = new JButton("View");
        JButton delete = new JButton("Delete");
        JButton exit = new JButton("Exit");
        JButton update = new JButton("Update");

}
