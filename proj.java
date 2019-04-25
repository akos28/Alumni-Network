import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextComponent.*;
import javax.swing.JPasswordField.*;

class Login extends JFrame implements ActionListener{
    JFrame fr,fr1,fr2,fr3;
    static JPanel p1,p2,p3,p4,p5;
    JButton login, forgot, signin, submit, start;
    JTextField uid, tf, nuid;
    JPasswordField up,nup, ncup;
    JLabel img,disp,disp1,user,pass,nuser,npass,ncpass;
    static String su,sp,egu,egp,s3,s4,s5;
    int count;
    static String email[] = new String[100];
    static String password[] = new String[100];
    Login(){
        p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p1 = new JPanel();
        p1.setLayout(null);
        JLabel user = new JLabel("USER ID: ");
        user.setBounds(100,280,100,30);
        JLabel pass = new JLabel("PASSWORD: ");
        pass.setBounds(100,330,100,30);
        uid = new JTextField(50);
        uid.setBounds(200, 280, 200, 30);
        up = new JPasswordField(50);
        up.setBounds(200,330,200,30);
        Font f1 = new Font("David",Font.PLAIN,15);
        uid.setFont(f1);
        uid.setBackground(Color.WHITE);
        uid.setForeground(Color.BLACK);
        up.setBackground(Color.WHITE);
        up.setForeground(Color.BLACK);
        p1.add(user);
        p1.add(uid);
        p1.add(pass);
        p1.add(up);
        ImageIcon ic = new ImageIcon("silhouette.png");
        Image image = ic.getImage(); // transform it 
        Image newimg = image.getScaledInstance(300, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        JLabel img = new JLabel(new ImageIcon(newimg));
        img.setBounds(200, 50, 300, 200);
        p1.add(img);
        login = new JButton("LOGIN");
        login.addActionListener(this);
        login.setBounds(100, 400, 100, 30);
        forgot = new JButton("Forgot Password");
        forgot.setBounds(230, 400, 200, 30);
        forgot.addActionListener(this);
        p1.add(login);
        p1.add(forgot);
        p2.add(p1,BorderLayout.CENTER);
        submit = new JButton("SUBMIT");
        submit.setBounds(200, 550, 100, 40);
        submit.addActionListener(this);
        /*egu = new String("hello@gmail.com");
        egp = new String("hello");*/
    }
    public static void infoBox(String infoMessage){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " ,JOptionPane.INFORMATION_MESSAGE);
    }
    void log(){
        fr1 = new JFrame();
        fr1.setVisible(true);
        fr1.setTitle("LOGIN PAGE");
        fr1.setSize(500,500);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disp = new JLabel();
        disp.setText("WELCOME!!");
        disp.setVisible(true);
        fr1.getContentPane().setBackground(Color.PINK);
        Font f1 = new Font("David",Font.PLAIN,50);
        disp.setFont(f1);
        fr1.add(disp);
    }
    void forg(){
        fr2 = new JFrame();
        fr2.setVisible(true);
        fr2.setTitle("ACCOUNT RECOVERY PAGE");
        fr2.setSize(700,700);
        fr2.setLayout(null);
        disp = new JLabel("PLEASE FILL THE FOLLOWING DETAILS");
        disp.setBounds(20, 20, 600, 30);
        fr2.getContentPane().setBackground(Color.LIGHT_GRAY);
        Font f1 = new Font("David",Font.PLAIN,30);
        disp.setFont(f1);
        fr2.add(disp);
        JLabel nuser = new JLabel("USER ID: ");
        nuser.setBounds(100,180,150,65);
        JLabel npass = new JLabel("PASSWORD: ");
        npass.setBounds(100,280,150,65);
        JLabel ncpass = new JLabel("CONFIRM PASSWORD: ");
        ncpass.setBounds(100,380,150,65);
        nuid = new JTextField(50);
        nuid.setBounds(250, 190, 150, 40);
        nup = new JPasswordField(50);
        nup.setBounds(250,290,150,40);
        ncup = new JPasswordField(50);
        ncup.setBounds(250,390,150,40);
        Font f2 = new Font("David",Font.PLAIN,15);
        nup.setFont(f2);
        ncup.setFont(f2);
        nuid.setFont(f2);
        nuid.setBackground(Color.WHITE);
        nuid.setForeground(Color.BLACK);
        nup.setBackground(Color.WHITE);
        nup.setForeground(Color.BLACK);
        ncup.setBackground(Color.WHITE);
        ncup.setForeground(Color.BLACK);
        fr2.add(nuser);
        fr2.add(nuid);
        fr2.add(npass);
        fr2.add(nup);
        fr2.add(ncpass);
        fr2.add(ncup);
        fr2.add(submit);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            su = uid.getText();
            sp = up.getText();
            if(su.equals("hello@gmail.com") && sp.equals("hello")){
                log();
            }
            else if(su.equals("saisreepokala") && sp.equals("Test1234")){
                log();
            }
            else if(su.equals("ananyakosuru") && sp.equals("Check1234")){
                log();
            }
            else{
            MyProj.infoBox("ERROR \n please check your password and user id again");
            }
        }
        if(ae.getSource()==forgot){
            forg();
        }
        if(ae.getSource()==submit){
            s3 = nup.getText();
            s4 = ncup.getText();
            s5 = nuid.getText();
            if(s3.length()!=0 && s4.length()!=0 && s5.length()!=0){
                if(s3.equals(s4)){
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
        if(ae.getSource()==forgot){
            forg();
        }    
    }
        
    public static void main(String args[]){
        
        Login pr = new Login();
        pr.setTitle("WELCOME TO THE LOGIN PAGE");
        pr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pr.setVisible(true);
        pr.setSize(500,500);
        pr.add(p2);
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

