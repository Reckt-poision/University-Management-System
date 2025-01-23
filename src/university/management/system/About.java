package university.management.system;
import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    About(){
     setSize(700  , 500);
        setLocation(400, 150);
        
        setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 400, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 0, 300, 200);
        add(image);
        
         JLabel heading1 = new JLabel("Developed By:Arman Baig");
        heading1.setBounds(20, 220, 500, 120);
        heading1.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading1);
        
         JLabel heading2 = new JLabel("Reference :Code For Interview");
        heading2.setBounds(20, 250, 900, 120);
        heading2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(heading2);
        
        setVisible(true);
    }
    
public static void main(String[] args){

    new About();

}    
}
