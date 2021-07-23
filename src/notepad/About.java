
package notepad;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class About  extends JFrame implements ActionListener{

    JButton b1;
    public About() 
    {
        setBounds(300, 100, 700, 600);
        setLayout(null);
        
        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icon/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150, 40, 400, 80);
        add(l1);
        
        ImageIcon  i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icon/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50, 180, 70, 70);
        add(l2);
        
        JLabel l3 = new JLabel("<html>Surya Windows <br> Version 2021(OS Bulis 19041.264)<br> 2021 Surya Corporation. All right reserved. <br> <br> The Windows 10 Home Single Language Operation System and its User <br>Interface are Protected by trademark and other pending or existing <br> Intellectual property right in the United State and othe countries/regions.<br><br><br><br> This product is licensed under the  <a href ='Microsoft Software License Terms'>Surya Software License !</a><br>Terms to: <br> Surya </html>");
         l3.setBounds(150, 130, 500, 300);
         l3.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
         add(l3);
         
         b1= new JButton("OK");
         b1.setBounds(580, 500, 80, 25);
         b1.addActionListener(this);
         add(b1);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        this.setVisible(false);
    }
    public static void main(String args[])
    {
        new About().setVisible(true);
    }
    
}
