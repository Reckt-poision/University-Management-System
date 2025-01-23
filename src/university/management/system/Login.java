package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login,cancel;
    JTextField tfusername,tfpassword;
    Login(){
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(160,20,150,20);
        add(lblusername);
         lblusername.setForeground(Color.BLACK); // Change text color to blue
         lblusername.setFont(new Font("Arial", Font.BOLD, 15));
        
        tfusername = new JTextField();
        tfusername.setBounds(250, 20, 150, 20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password:");
        lblpassword.setBounds(160,70,100,20);
        add(lblpassword);
        lblpassword.setForeground(Color.BLACK);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(250, 70, 150, 20);
         lblpassword.setFont(new Font("Arial", Font.BOLD, 15));
        add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(150, 140, 120, 30);
        login.setBackground(Color.GRAY);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma",Font.BOLD,15));
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(280, 140, 120, 30);
        cancel.setBackground(Color.GRAY);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel);
        
        /* ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(340, 0, 200,200);
        add(image);*/
        
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login){
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query ="select * from login where username='"+username+"'and password='"+password+"'";
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    
                    if(rs.next()){
                        setVisible(false);
                        new Project();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                        setVisible(false);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
        
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
        }
    }
    
    
public static void main(String[] args){
new Login();
}
    
}
