import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextComponent.*;
import javax.swing.JPasswordField.*;

class Dire{
	static JPanel p1,p2;
	Dire(){
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><p>NAME : SUDHEENDRA RAGHAV</br>DOB : 30-10-1994</br>PRESENT ADDRESS : Flat no. A7-304, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.</br>PERIOD OF STUDY IN COLLEGE : 5 years</br>ACADEMIC QUALIFICATION : UNDERGRAD</br>OCCUPATION : Intern at ALPHABET Inc.</br>HOBBY : Programming, Creating Drama, Photography, Eve teasing.</br>Contact no. : 8657867500</br>EMAIL ID : raghav17555@mechyd.ac.in</p>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(500,600));
		sp.setMinimumSize(new Dimension(60,60));
		// p3.add(sp);
		p1.add(sp,BorderLayout.CENTER);
	}
}