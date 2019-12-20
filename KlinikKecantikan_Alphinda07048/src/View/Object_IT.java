package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Object_IT extends JFrame
{
        //label
        JLabel id = new JLabel("ID");
        JLabel jenis = new JLabel("JENIS TREATMENT");
        JLabel harga = new JLabel("HARGA");
        JLabel judul = new JLabel("DATA TREATMENT");
        
        //TextField
        JTextField Id = new JTextField();
        JTextField jns = new JTextField();
        JTextField hrg = new JTextField();
        
        //Button
        JButton insert = new JButton("Insert");
        JButton view = new JButton("View");
        JButton exit = new JButton("Exit");
        JButton delete = new JButton("Delete");
        JButton update = new JButton("Update");
}
