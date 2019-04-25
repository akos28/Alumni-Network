//Alumni Network V0.0.1
//2019-04-16
//Edited by Kos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Home extends JFrame implements ActionListener{
	JMenuBar mb_1;
	CardLayout card;  
	JButton b2,b3; 
	JPanel right; 
    	  
	
	Home(){
		
		JFrame f1=new JFrame("MEC");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
        	int xSize = ((int) tk.getScreenSize().getWidth());
        	int ySize = ((int) tk.getScreenSize().getHeight());
       	 	f1.setSize(xSize,ySize);
       	 	//System.out.println(xSize);
       	 	//System.out.println(ySize);
       	 	
       	 	
       	 	//Creating main menu bar
		mb_1=new JMenuBar();
		JMenu m1=new JMenu("About us");
		JMenu m2=new JMenu("Contact us");
		JMenu m3=new JMenu("News");
		
		
		//JMenu m21
		
		JMenuItem m31=new JMenuItem("Events");
		JMenuItem m32=new JMenuItem("Seminars");
		JMenuItem m33=new JMenuItem("Awards");
		JMenuItem m34=new JMenuItem("Student Council");
		
		
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		m3.add(m34);
		
		m31.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Events e1=new Events(); 
				e1.setVisible(true);
			}
		});
		
		
		ImageIcon ic_1 = new  ImageIcon("/home/ananyak/Desktop/javaproj/logo.jpeg");//loads image to image icon
		 
        	Image ict_1 = ic_1.getImage(); // transform it 
        	Image newict_1 = ict_1.getScaledInstance(70, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        	JLabel ictLabel = new JLabel(new ImageIcon(newict_1));
		//JLabel mb_l1=new JLabel(ic_1);
		
		JLabel mb_l2=new JLabel("MEC");
		mb_1.setBounds(0, 0,xSize, 50);
		
		mb_1.add(ictLabel);
		mb_1.add(mb_l2);
		
		mb_1.add(Box.createRigidArea(new Dimension(680,0)));
		
		mb_1.add(m1);
		mb_1.add(Box.createRigidArea(new Dimension(50,0)));
		mb_1.add(m2);
		mb_1.add(Box.createRigidArea(new Dimension(50,0)));
		mb_1.add(m3);
		
		f1.setLayout(new BorderLayout());
		f1.add(mb_1,BorderLayout.NORTH); 
		
		
		////////welcome statement////////
		JPanel center=new JPanel();
		
		JLabel welcome=new JLabel("Welcome to the MEC Alumni Portal");
		
		center.setLayout(new BorderLayout());
		welcome.setFont(new Font("Seriaf", Font.BOLD,40));
		
		
		//center2.add(welcome,BorderLayout.CENTER);
		center.add(welcome, BorderLayout.CENTER);
		
		//////buttons/////
		JPanel center1=new JPanel();
		JPanel buttons1=new JPanel();
		
		JButton sign=new JButton("Sign up");
		JButton login=new JButton("Login");
		
		sign.setPreferredSize(new Dimension(140,40));
		login.setPreferredSize(new Dimension(140,40));
		
		center1.setLayout(new BorderLayout());
		buttons1.setLayout(new FlowLayout());

		buttons1.add(sign);
		buttons1.add(login);
		center1.add(buttons1,BorderLayout.NORTH);
		
		center1.add(center,BorderLayout.SOUTH);
	
		f1.add(center1,BorderLayout.CENTER);
		
		
		//////////creating a new right panel for pictures/////////
   
		right=new JPanel();
        	card=new CardLayout(20,20);  
 
 		right.setPreferredSize(new Dimension(500,500));
        	right.setLayout(card);
        	  
          
          	ImageIcon ecole_1 = new  ImageIcon("ecole3.png");//loads image to image icon
        	Image ec_1 = ecole_1.getImage(); // transform it 
        	Image newec_1 = ec_1.getScaledInstance(1200, 700,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        	JButton ec1Button = new JButton(new ImageIcon(newec_1));
        	
        	ImageIcon ecole_2 = new  ImageIcon("ecole2.jpg");
        	Image ec_2 = ecole_2.getImage(); 
        	Image newec_2 = ec_2.getScaledInstance(1200, 700,  java.awt.Image.SCALE_SMOOTH); 
        	JButton ec2Button = new JButton(new ImageIcon(newec_2));
        	
        	ImageIcon ecole_3 = new  ImageIcon("ecole1.jpeg");
        	Image ec_3 = ecole_3.getImage();
        	Image newec_3 = ec_3.getScaledInstance(1200, 700,  java.awt.Image.SCALE_SMOOTH);  
        	JButton ec3Button = new JButton(new ImageIcon(newec_3));
        
        	
        	ec1Button.setBorder(BorderFactory.createEmptyBorder());
        	ec1Button.setContentAreaFilled(false);
        	
        	ec2Button.setBorder(BorderFactory.createEmptyBorder());
        	ec2Button.setContentAreaFilled(false);
        	
        	ec3Button.setBorder(BorderFactory.createEmptyBorder());
        	ec3Button.setContentAreaFilled(false);
        	
        
        	ec1Button.addActionListener(this);  
        	ec2Button.addActionListener(this);  
        	ec3Button.addActionListener(this);  
        	      
        	right.add("a",ec1Button);
        	right.add("b",ec2Button);
        	right.add("c",ec3Button); 
        	
		center1.add(right,BorderLayout.CENTER);
      
		////adding stuff to the frame
		f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		f1.setVisible(true);	
		
	}
	
	public void actionPerformed(ActionEvent e){  
    			card.next(right);  
    		}
    		
    		
	
	public static void main(String args[]){
		new Home();
	}
}



