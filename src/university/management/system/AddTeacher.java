package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddTeacher extends JFrame implements ActionListener {
    JTextField tfname,tffname,tfaddress,tfphone,tfemail,tfx,tfxii,tfadhar;
    JLabel labelempid;
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch;
   JButton submit, cancel;

    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() %9000L)+1000L);
    
    AddTeacher(){
    setSize(900,700);
    setLocation(350,50);
    
    setLayout(null);
    
    JLabel heading = new JLabel("New Teacher Deatils");
    heading.setBounds(310, 30, 500, 50);
    heading.setFont(new Font("Serif",Font.BOLD,30));
    add(heading);
    
    JLabel lblname = new JLabel("Name:");
    lblname.setBounds(100, 150, 90, 30);
    lblname.setFont(new Font("Serif",Font.BOLD,20));
    add(lblname);
    
    tfname = new JTextField();
    tfname.setBounds(200,150,150,30);
    add(tfname);
    
    
     JLabel lblfname = new JLabel("Father's Name:");
    lblfname.setBounds(400, 150, 200, 30);
    lblfname.setFont(new Font("Serif",Font.BOLD,20));
    add(lblfname);
    
    tffname = new JTextField();
    tffname.setBounds(600,150,150,30);
    add(tffname);
    
    JLabel lblempid = new JLabel("Employee ID:");
    lblempid.setBounds(80, 200, 200, 30);
    lblempid.setFont(new Font("Serif",Font.BOLD,20));
    add(lblempid);
    
    labelempid = new JLabel("101"+first4);
    labelempid.setBounds(200, 200, 200, 30);
    labelempid.setFont(new Font("Serif",Font.BOLD,20));
    add(labelempid);
    
      JLabel lbldob = new JLabel("Date Of Birth:");
    lbldob.setBounds(400, 200, 200, 30);
    lbldob.setFont(new Font("Serif",Font.BOLD,20));
    add(lbldob);
    
    dcdob = new JDateChooser();
    dcdob.setBounds(550,200,200,30);
    dcdob.setFont(new Font("Serif",Font.BOLD,20));
    add(dcdob);
    
     JLabel lblfaddress = new JLabel("Address:");
    lblfaddress.setBounds(70, 250, 200, 30);
    lblfaddress.setFont(new Font("Serif",Font.BOLD,20));
    add(lblfaddress);
    
    tfaddress = new JTextField();
    tfaddress.setBounds(200,250,150,30);
    add(tfaddress);
    
    
    
    JLabel lblphone = new JLabel("Phone Number:");
    lblphone.setBounds(400, 250, 200, 30);
    lblphone.setFont(new Font("Serif",Font.BOLD,20));
    add(lblphone);
    
    tfphone = new JTextField();
    tfphone.setBounds(600,250,150,30);
    add(tfphone);
    
    
    
     JLabel lblemail = new JLabel("Email:");
    lblemail.setBounds(70, 300, 200, 30);
    lblemail.setFont(new Font("Serif",Font.BOLD,20));
    add(lblemail);
    
    tfemail = new JTextField();
    tfemail.setBounds(200,300,150,30);
    add(tfemail);
    
    
    
    JLabel lblx = new JLabel("Class X(%):");
    lblx.setBounds(400, 300, 200, 30);
    lblx.setFont(new Font("Serif",Font.BOLD,20));
    add(lblx);
    
    tfx = new JTextField();
    tfx.setBounds(600,300,150,30);
    add(tfx);
    
     JLabel lblxii = new JLabel("Class XII(%):");
    lblxii.setBounds(70, 350, 200, 30);
    lblxii.setFont(new Font("Serif",Font.BOLD,20));
    add(lblxii);
    
    tfxii = new JTextField();
    tfxii.setBounds(200,350,150,30);
    add(tfxii);
    
    JLabel lbladdhar = new JLabel("Addhar Number:");
    lbladdhar.setBounds(400, 350, 200, 30);
    lbladdhar.setFont(new Font("Serif",Font.BOLD,20));
    add(lbladdhar);
    
    tfadhar = new JTextField();
    tfadhar.setBounds(600,350,150,30);
    add(tfadhar);
    
    
     JLabel lblcourse = new JLabel("Qualification:");
    lblcourse.setBounds(60, 400, 150, 30);
    lblcourse.setFont(new Font("Serif",Font.BOLD,20));
    add(lblcourse);
    
    String course[] = {"B-TECH","BCA","BCOM","MBA","M-COM","BA","MA","MSC","BSC"};
    cbcourse = new JComboBox(course);
    cbcourse.setBounds(200, 400, 150, 30);
    cbcourse.setFont(new Font("Serif",Font.BOLD,20));
    cbcourse.setBackground(Color.white);
    add(cbcourse);
    
    
    JLabel lblbranch = new JLabel("Department:");
    lblbranch.setBounds(400, 400, 200, 30);
    lblbranch.setFont(new Font("Serif",Font.BOLD,20));
    add(lblbranch);
    
    String branch[] = {"Computer Science","Electroincs","Mechanical","Civil","IT","Petrolium"};
    cbbranch = new JComboBox(branch);
    cbbranch.setBounds(600, 400, 200, 30);
    cbbranch.setFont(new Font("Serif",Font.BOLD,20));
    cbbranch.setBackground(Color.white);
    add(cbbranch);
    
    submit = new JButton("submit");
        submit.setBounds(250, 550, 150, 50);
        submit.setBackground(Color.LIGHT_GRAY);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma",Font.BOLD,18));
        add(submit);
    
        
         cancel = new JButton("Cancel");
        cancel.setBounds(500, 550, 150, 50);
        cancel.setBackground(Color.LIGHT_GRAY);
        cancel.setForeground(Color.BLACK);
       cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,18));
        add(cancel);
    
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelempid.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfadhar.getText();
            String course = (String)cbcourse.getSelectedItem();
            String branch = (String)cbbranch.getSelectedItem();
            
            try{
                String query = "insert into teacher values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+course+"','"+branch+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
            }catch(Exception e){
                 e.printStackTrace();
            }
             
        }else{
            setVisible(false);
        }
    
    }
    
    public static void main(String[] args){
    new AddTeacher();
    }
    
}
