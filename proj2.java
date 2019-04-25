import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextComponent.*;
import javax.swing.JPasswordField.*;

class Sign extends JFrame implements ActionListener{
    JFrame fr4;
    static JPanel p4;
    JButton  register;
    JTextField ruid, runam;
    JPasswordField rup, rcup;
    static JLabel disp, ruser, rpass, rcpass, rname;
    static String s6,s7,s8,s9;
    Sign(){
        p4 = new JPanel();
        p4.setLayout(null);
        disp = new JLabel("PLEASE FILL THE FOLLOWING DETAILS");
        disp.setBounds(20, 20, 600, 30);
        Font f6 = new Font("Arial",Font.PLAIN,15);
        disp.setFont(f6);
        p4.add(disp);
        JLabel rname = new JLabel("USERNAME: ");
        rname.setBounds(100,130,150,65);
        JLabel ruser = new JLabel("USER ID: ");
        ruser.setBounds(100,230,150,65);
        JLabel rpass = new JLabel("PASSWORD: ");
        rpass.setBounds(100,330,150,65);
        JLabel rcpass = new JLabel("CONFIRM PASSWORD");
        rcpass.setBounds(100,430,150,65);
        ruid = new JTextField(50);
        ruid.setBounds(250, 240, 150, 40);
        runam = new JTextField(50);
        runam.setBounds(250,140,150,40);
        rup = new JPasswordField(50);
        rup.setBounds(250,340,150,40);
        rcup = new JPasswordField(50);
        rcup.setBounds(250,440,150,40);
        rup.setFont(f6);
        rcup.setFont(f6);
        ruid.setFont(f6);
        runam.setFont(f6);
        ruid.setBackground(Color.WHITE);
        ruid.setForeground(Color.BLACK);
        rup.setBackground(Color.WHITE);
        rup.setForeground(Color.BLACK);
        rcup.setBackground(Color.WHITE);
        rcup.setForeground(Color.BLACK);
        runam.setBackground(Color.WHITE);
        runam.setForeground(Color.BLACK);
        p4.add(rname);
        p4.add(runam);
        p4.add(ruser);
        p4.add(ruid);
        p4.add(rpass);
        p4.add(rup);
        p4.add(rcpass);
        p4.add(rcup);
        register = new JButton("REGISTER");
        register.setBounds(200, 580, 100, 40);
        register.addActionListener(this);
        p4.add(register);
    }
    public static void infoBox(String infoMessage){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " ,JOptionPane.INFORMATION_MESSAGE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==register){
            s6 = ruid.getText();
            s7 = runam.getText();
            s8 = rup.getText();
            s9 = rcup.getText();
            if(s6.length()!=0 && s7.length()!=0 && s8.length()!=0 && s9.length()!=0){
                if(s8.equals(s9)){
                    Home hr = new Home();
                }
                else{
                    MyProj.infoBox("ERROR \n passwords do not match, please type again");
                }    
            }
            else{
                MyProj.infoBox("ERROR \n please fill all the boxes");
            }
        }
       
    }
    public static void main(String args[]){
        Sign si = new Sign();
        si.setTitle("WELCOME TO THE LOGIN PAGE");
        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        si.setVisible(true);
        si.setSize(700,700);
        si.add(p4);
        si.setTitle("SIGN IN PAGE");
        si.getContentPane().setBackground(Color.LIGHT_GRAY);
    } 
}

class Home extends JFrame implements ActionListener{
    JFrame fr3;
    static JPanel p3;
    JButton  start;
    //JTextField uid, tf, nuid;
    //JPasswordField up,nup, ncup;
    JLabel disp1;
    static String s6,s7,s8;
    //static String su,sp,egu,egp,s3,s4,s5;
    Home(){
        p3 = new JPanel();
        fr3 = new JFrame();
        p3.setLayout(null); 
        disp1 = new JLabel("WELCOME BACK");
        disp1.setBounds(40, 40, 500, 40);
        Font f3 = new Font("David",Font.PLAIN,40);
        disp1.setFont(f3);
        start = new JButton("Get Started");
        start.addActionListener(this);
        start.setBounds(400,600,200,60);
        p3.add(disp1);
        p3.add(start);
        fr3.setVisible(true);
        fr3.setTitle("WELCOME PAGE");
        fr3.setSize(800,800);
        fr3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr3.add(p3);
        fr3.getContentPane().setBackground(Color.BLUE);
    }
    public void actionPerformed(ActionEvent ae){
    
        if(ae.getSource()==start){
            //main page
        }
    }
}