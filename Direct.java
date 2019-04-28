import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextComponent.*;
import javax.swing.JPasswordField.*;

class Dire extends JFrame{
	static JPanel p1;
	JFrame frr;
	Dire(){
		p1 = new JPanel();
		frr = new JFrame();
		p1.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : SUDHEENDRA RAGHAV<br><br>DOB : 30-10-1994<br><br>PRESENT ADDRESS : Flat no. A7-304, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Creating Drama, Photography, Eve teasing.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : raghav17555@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		// p3.add(sp);
		p1.add(sp,BorderLayout.CENTER);
		frr.setTitle("DIRECTORY");
		frr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frr.setVisible(true);
		frr.setSize(900,900);
		frr.add(p1);
	}
	public static void main(String args[]){
		Dire dr = new Dire();
	}
}