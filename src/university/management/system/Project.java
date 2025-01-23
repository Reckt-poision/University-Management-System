package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener{
    Project(){
        
        setSize(1540,850);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        //new information
       JMenuBar mb = new JMenuBar();
       JMenu newInformation = new JMenu("New Information");
       newInformation.setForeground(Color.BLACK);
       mb.add(newInformation);
      
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
       facultyInfo.setBackground(Color.WHITE);
       facultyInfo.addActionListener(this);
       facultyInfo.setFont(new Font("Tahoma",Font.BOLD,11));
       newInformation.add(facultyInfo);
       
       JMenuItem studentInfo = new JMenuItem("New Student Information");
       studentInfo.setBackground(Color.WHITE);
       studentInfo.addActionListener(this);
       studentInfo.setFont(new Font("Tahoma",Font.BOLD,11));
       newInformation.add(studentInfo);
      //Detailes
        JMenuItem details = new JMenu("View Details");
       details.setBackground(Color.WHITE);
       details.add(details);
       mb.add(details);
        
       JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
       facultyDetails.setBackground(Color.WHITE);
       facultyDetails.setFont(new Font("Tahoma",Font.BOLD,11));
       facultyDetails.addActionListener(this);
       details.add(facultyDetails);
       
        JMenuItem studentDetails = new JMenuItem("View Student Details");
       studentDetails.setBackground(Color.WHITE);
       studentDetails.setFont(new Font("Tahoma",Font.BOLD,11));
       studentDetails.addActionListener(this);
       details.add(studentDetails);
       
       
       //Leave
        JMenuItem leave = new JMenu("Apply Leave");
       leave.setBackground(Color.WHITE); 
       mb.add(leave);
        
       JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
       facultyLeave.setBackground(Color.WHITE);
       facultyLeave.addActionListener(this);
       facultyLeave.setFont(new Font("Tahoma",Font.BOLD,11));
       leave.add(facultyLeave);
       
        JMenuItem studentLeave = new JMenuItem("Student Leave");
       studentLeave.setBackground(Color.WHITE);
       studentLeave.addActionListener(this);
       studentLeave.setFont(new Font("Tahoma",Font.BOLD,11));
       leave.add(studentLeave);
       
        //Leave Deatils
        JMenuItem leaveDetails = new JMenu("Leave Details");
       leaveDetails.setBackground(Color.WHITE); 
       mb.add(leaveDetails);
        
       JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
       facultyLeaveDetails.setBackground(Color.WHITE);
       facultyLeaveDetails.addActionListener(this);
       facultyLeaveDetails.setFont(new Font("Tahoma",Font.BOLD,11));
       leaveDetails.add(facultyLeaveDetails);
       
        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Deatils");
       studentLeaveDetails.setBackground(Color.WHITE);
       studentLeaveDetails.addActionListener(this);
       studentLeaveDetails.setFont(new Font("Tahoma",Font.BOLD,11));
       leaveDetails.add(studentLeaveDetails);
       
       //Exam 
        JMenuItem exam = new JMenu("Exam Details");
       exam.setBackground(Color.WHITE); 
       mb.add(exam);
        
       JMenuItem examDetails = new JMenuItem("Exam Result");
       examDetails.setBackground(Color.WHITE);
       examDetails.addActionListener(this);
       examDetails.setFont(new Font("Tahoma",Font.BOLD,11));
       exam.add(examDetails);
       
        JMenuItem entermarks = new JMenuItem("Enter Marks");
       entermarks.setBackground(Color.WHITE);
       entermarks.addActionListener(this);
       entermarks.setFont(new Font("Tahoma",Font.BOLD,11));
       exam.add(entermarks);
       
        //update
        JMenuItem update = new JMenu("Update Details");
       update.setBackground(Color.WHITE); 
       mb.add(update);
        
       JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
       updatefacultyinfo.setBackground(Color.WHITE);
       updatefacultyinfo.addActionListener(this);
       updatefacultyinfo.setFont(new Font("Tahoma",Font.BOLD,11));
       update.add(updatefacultyinfo);
       
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
       updatestudentinfo.setBackground(Color.WHITE);
       updatestudentinfo.addActionListener(this);
       updatestudentinfo.setFont(new Font("Tahoma",Font.BOLD,11));
       update.add(updatestudentinfo);
       
        //fees
        JMenuItem fee = new JMenu("Fees Details");
       fee.setBackground(Color.WHITE); 
       mb.add(fee);
        
       JMenuItem feestructure = new JMenuItem("Fees Structure");
       feestructure.setBackground(Color.WHITE);
       feestructure.addActionListener(this);
       feestructure.setFont(new Font("Tahoma",Font.BOLD,11));
       fee.add(feestructure);
       
        JMenuItem feesform = new JMenuItem("Pay Fees");
       feesform.setBackground(Color.WHITE);
       feesform.setFont(new Font("Tahoma",Font.BOLD,11));
       feesform.addActionListener(this);
       fee.add(feesform);
       
        //utility
        JMenuItem utility = new JMenu("Utility");
       utility.setBackground(Color.WHITE); 
       mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("Tahoma", Font.BOLD, 11));
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
       
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("Tahoma", Font.BOLD, 11));
        calculator.setBackground(Color.WHITE);
        calculator.addActionListener(this);
        utility.add(calculator);

       
       //about
        JMenu about = new JMenu("About");
       about.setBackground(Color.WHITE); 
       mb.add(about);
       
       JMenuItem ab = new JMenuItem("About");
        ab.setFont(new Font("Tahoma", Font.BOLD, 11));
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
       

       
       
       //exit
        JMenuItem exit = new JMenu("Exit");
       exit.setBackground(Color.WHITE); 
       mb.add(exit);
        
       JMenuItem logout = new JMenuItem("Logout");
        logout.setFont(new Font("Tahoma", Font.BOLD, 11));
        logout.setBackground(Color.WHITE);
        logout.addActionListener(this);
        exit.add(logout);
       
       setJMenuBar(mb);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Logout")) {
            setVisible(false); // Close the window
        } 
        else if(msg.equals("Calcultor")){
            try{
            Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e){
        }
        }
        else if(msg.equals("Notpad")){
            try{
            Runtime.getRuntime().exec("notepad.exe");
        }catch(Exception e){
        }
         
        }   else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        }else if(msg.equals("New Student Information")){
            new AddStudent();
        }else if (msg.equals("View Faculty Details")){
            new TeacherDetail();
        }else if (msg.equals("View Student Details")){
             new StudentDetail();
        }else if (msg.equals("Faculty Leave")){
             new TeacherLeave();
        }else if (msg.equals("Student Leave")){
             new StudentLeave();
        }else if (msg.equals("Student Leave Deatils")){
             new StudentLeaveDetail();
        }else if (msg.equals("Faculty Leave Details")){
             new TeacherLeaveDetail();
        }else if (msg.equals("Update Faculty Details")){
             new UpdateTeacher();
        }else if (msg.equals("Update Student Details")){
             new UpdateStudent();
        }else if (msg.equals("Enter Marks")){
             new EnterMarks();
        }else if (msg.equals("Exam Result")){
             new ExaminationDetails();
        }else if (msg.equals("Fees Structure")){
             new FeeStructure();
        }else if (msg.equals("About")){
             new About();
        }else if (msg.equals("Pay Fees")){
        new StudentFeeForm();
        }
    
    
    }
    public static void main(String[] agrs){
    new Project();
    }
}


 