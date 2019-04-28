import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextComponent.*;
import javax.swing.JPasswordField.*;
import javax.swing.JScrollPane;  

class Scrollp extends JFrame{
	static JPanel p1,p2,p3;
	Scrollp(){
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		/*p3 = new JPanel();
		p3.setLayout(null);*/
		//.setPreferredSize(new Dimension(400,400));
		ImageIcon ic = new ImageIcon("MEC.png");
		Image image = ic.getImage(); // transform it 
		Image newimg = image.getScaledInstance(400, 400,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		JLabel img = new JLabel(new ImageIcon(newimg));
		p1.add(img,BorderLayout.NORTH);
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>ABOUT US</h1><h2>MAHINDRA ÉCOLE CENTRALE</h2><p>MEC signifies the Rise of the New Engineer." + " A new paradigm made possible by a historic collaboration involving the Mahindra Group, École Central Paris (now CentraleSupélec) and Jawaharlal Nehru Technological University Hyderabad (JNTUH)." + "Established by the Mahindra Group, in collaboration with École Central Paris (now CentraleSupélec) - a 180 year old leading French institution, and JNTU Hyderabad, a premier technological university, MEC is an international quality, technology school with assured career progression for engineering aspirants. This college of engineering in Hyderabad creates three-dimensional engineers: high level scientific and technical generalists, experts in initiating and piloting innovative projects, and well-rounded experts with a strong international culture. Key aspects of education at MEC engineering college in Hyderabad are the focus on multi-disciplinary knowledge, personality development, and critical-creative thinking. Mahindra École Centrale (MEC) College of Engineering, heralds the Rise of the New Engineer in India. </p><hr>"+"<h2>ALUMNI</h2><p>Thia was created by the Alumni of MEC to clear the queries of the newly joining students and their parents. </p>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(500,600));
		sp.setMinimumSize(new Dimension(60,60));
		// p3.add(sp);
		p1.add(sp,BorderLayout.CENTER);
		ss = new JFrame();
		ss.setTitle("ABOUT US");
		ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ss.setVisible(true);
		ss.setSize(900,900);
		ss.add(p1);
		ss = new JFrame();
		ss.setTitle("ABOUT US");
		ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ss.setVisible(true);
		ss.setSize(900,900);
		ss.add(p1);
	}
}