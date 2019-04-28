import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextComponent.*;
import javax.swing.JPasswordField.*;

class Dire extends JFrame implements ActionListener{
	static JPanel p1,p2;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JFrame fm;
	Dire()
	{
		p2 = new JPanel();
		p2.setLayout(new GridLayout(11,2));
		Font f3 = new Font("Arial",Font.PLAIN,25);
		l0 = new JLabel("SUDHEEDRA RAGHAVA");
		b0 = new JButton("click here");
		l0.setFont(f3);
		b0.addActionListener(this);
		l1 = new JLabel("SAUDAMINI REDDY");
		b1 = new JButton("click here");
		l1.setFont(f3);
		b1.addActionListener(this);
		l2 = new JLabel("VATHSAVI BOGGARAPU");
		b2 = new JButton("click here");	
		l2.setFont(f3);
		b2.addActionListener(this);
		l3 = new JLabel("DHEERAJ GOLI");
		b3 = new JButton("click here");
		l3.setFont(f3);
		b3.addActionListener(this);
		l4 = new JLabel("QURRAM ZAHEER");
		b4 = new JButton("click here");
		l4.setFont(f3);
		b4.addActionListener(this);
		l5 = new JLabel("ROHAN NEDUNGADI");
		b5 = new JButton("click here");
		l5.setFont(f3);
		b5.addActionListener(this);
		l6 = new JLabel("SHARATH CHANDRA");
		b6 = new JButton("click here");
		l6.setFont(f3);
		b6.addActionListener(this);
		l7 = new JLabel("SANTOSH MEDURI");
		b7 = new JButton("click here");
		l7.setFont(f3);
		b7.addActionListener(this);
		l8 = new JLabel("RAHUL SANGAMKAR");
		b8 = new JButton("click here");
		l8.setFont(f3);
		b8.addActionListener(this);
		l9 = new JLabel("ROHAN PANDEY");
		b9 = new JButton("click here");
		l9.setFont(f3);
		b9.addActionListener(this);
		l10 = new JLabel("HUSEIN NOBLE");
		b10 = new JButton("click here");
		l10.setFont(f3);
		b10.addActionListener(this);
		p2.add(l0);
		p2.add(b0);
		p2.add(l1);
		p2.add(b1);
		p2.add(l2);
		p2.add(b2);
		p2.add(l3);
		p2.add(b3);
		p2.add(l4);
		p2.add(b4);
		p2.add(l5);
		p2.add(b5);
		p2.add(l6);
		p2.add(b6);
		p2.add(l7);
		p2.add(b7);
		p2.add(l8);
		p2.add(b8);
		p2.add(l9);
		p2.add(b9);
		p2.add(l10);
		p2.add(b10);
		fm = new JFrame();
		fm.setTitle("DIRECTORY");
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.setVisible(true);
		fm.setSize(900,900);
		fm.add(p2);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b0){
			Ragh rg = new Ragh();
		}
		if(ae.getSource()==b1){
			Saud sd = new Saud();
		}
		if(ae.getSource()==b2){
			Vaths vt = new Vaths();
		}
		if(ae.getSource()==b3){
			Dheer dg = new Dheer();
		}
		if(ae.getSource()==b4){
			Zah qz = new Zah();
		}
		if(ae.getSource()==b5){
			Nedu rn = new Nedu();
		}
		if(ae.getSource()==b6){
			Shar sc = new Shar();
		}
		if(ae.getSource()==b7){
			Sant sm = new Sant();
		}
		if(ae.getSource()==b8){
			Sang rs = new Sang();
		}
		if(ae.getSource()==b9){
			Pan rp = new Pan();
		}
		if(ae.getSource()==b10){
			Nob hn = new Nob();
		}

	}
	
}

class Ragh extends JFrame implements ActionListener{
	JFrame frg;
	JPanel prg;
	Ragh(){
		prg = new JPanel();
		frg = new JFrame();
		prg.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : SUDHEENDRA RAGHAV<br><br>DOB : 30-10-1994<br><br>PRESENT ADDRESS : Flat no. A7-304, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Creating Drama, Photography.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : raghav17555@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		prg.add(sp,BorderLayout.CENTER);
		frg.setTitle("DIRECTORY");
		frg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frg.setVisible(true);
		frg.setSize(900,900);
		frg.add(prg);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Saud extends JFrame implements ActionListener{
	JFrame fsd;
	JPanel psd;
	Saud(){
		psd = new JPanel();
		fsd = new JFrame();
		psd.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : SAUDAMINI THAKKALA<br><br>DOB : 10-01-1994<br><br>PRESENT ADDRESS : Flat no. AJ-15, XYZ Residencies, SR Nagar, Hyderabad.PIN : 500038.<br><br>PERIOD OF STUDY IN COLLEGE : 4 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Photography.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : saudamini17567@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		psd.add(sp,BorderLayout.CENTER);
		fsd.setTitle("DIRECTORY");
		fsd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsd.setVisible(true);
		fsd.setSize(900,900);
		fsd.add(psd);
	}
	public void actionPerformed(ActionEvent ae){}

}

class Vaths extends JFrame implements ActionListener{
	JFrame fvt;
	JPanel pvt;
	Vaths(){
		pvt = new JPanel();
		fvt = new JFrame();
		pvt.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : VATHSAVI BOGGARAPU<br><br>DOB : 09-08-1994<br><br>PRESENT ADDRESS : Flat no. AJ-18, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : vathsavi17560@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		pvt.add(sp,BorderLayout.CENTER);
		fvt.setTitle("DIRECTORY");
		fvt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fvt.setVisible(true);
		fvt.setSize(900,900);
		fvt.add(pvt);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Dheer extends JFrame implements ActionListener{
	JFrame fdg;
	JPanel pdg;
	Dheer(){
		pdg = new JPanel();
		fdg = new JFrame();
		pdg.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : DHEERAJ GOLI<br><br>DOB : 19-10-1994<br><br>PRESENT ADDRESS : Flat no. ST-34, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Making shor films.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : dheeraj17512@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		pdg.add(sp,BorderLayout.CENTER);
		fdg.setTitle("DIRECTORY");
		fdg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fdg.setVisible(true);
		fdg.setSize(900,900);
		fdg.add(pdg);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Zah extends JFrame implements ActionListener{
	JFrame fqz;
	JPanel pqz;
	Zah(){
		pqz = new JPanel();
		fqz = new JFrame();
		pqz.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : QURRAM ZAHEER<br><br>DOB : 25-07-1994<br><br>PRESENT ADDRESS : Flat no. ST-18, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Gaming, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : qurram175370@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		pqz.add(sp,BorderLayout.CENTER);
		fqz.setTitle("DIRECTORY");
		fqz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fqz.setVisible(true);
		fqz.setSize(900,900);
		fqz.add(pqz);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Nedu extends JFrame implements ActionListener{
	JFrame frn;
	JPanel prn;
	Nedu(){
		prn = new JPanel();
		frn = new JFrame();
		prn.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : ROHAN RUSSEL NEDUNGADI<br><br>DOB : 30-03-1994<br><br>PRESENT ADDRESS : Flat no. ST-53, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Studying, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : rohan17544@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		prn.add(sp,BorderLayout.CENTER);
		frn.setTitle("DIRECTORY");
		frn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frn.setVisible(true);
		frn.setSize(900,900);
		frn.add(prn);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Shar extends JFrame implements ActionListener{
	JFrame fsc;
	JPanel psc;
	Shar(){
		psc = new JPanel();
		fsc = new JFrame();
		psc.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : SHARATH CHANDRA PALAKURI<br><br>DOB : 03-04-1994<br><br>PRESENT ADDRESS : Flat no. ST-45, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Listening to music, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : sharath17245@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		psc.add(sp,BorderLayout.CENTER);
		fsc.setTitle("DIRECTORY");
		fsc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsc.setVisible(true);
		fsc.setSize(900,900);
		fsc.add(psc);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Sant extends JFrame implements ActionListener{
	JFrame fsm;
	JPanel psm;
	Sant(){
		psm = new JPanel();
		fsm = new JFrame();
		psm.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : SANTOSH PRITHVI MEDURI<br><br>DOB : 20-04-1994<br><br>PRESENT ADDRESS : Flat no. ST-10, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Watching movies, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : santosh17551@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		psm.add(sp,BorderLayout.CENTER);
		fsm.setTitle("DIRECTORY");
		fsm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsm.setVisible(true);
		fsm.setSize(900,900);
		fsm.add(psm);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Sang extends JFrame implements ActionListener{
	JFrame frs;
	JPanel prs;
	Sang(){
		prs = new JPanel();
		frs = new JFrame();
		prs.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : RAHUL SANGAMKER<br><br>DOB : 13-08-1994<br><br>PRESENT ADDRESS : Flat no. ST-30, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Sports, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : rahul17232@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		prs.add(sp,BorderLayout.CENTER);
		frs.setTitle("DIRECTORY");
		frs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frs.setVisible(true);
		frs.setSize(900,900);
		frs.add(prs);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Pan extends JFrame implements ActionListener{
	JFrame frp;
	JPanel prp;
	Pan(){
		prp = new JPanel();
		frp = new JFrame();
		prp.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : ROHAN PANDEY<br><br>DOB : 30-06-1994<br><br>PRESENT ADDRESS : Flat no. ST-23, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Programming, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : rohan17236@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		prp.add(sp,BorderLayout.CENTER);
		frp.setTitle("DIRECTORY");
		frp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frp.setVisible(true);
		frp.setSize(900,900);
		frp.add(prp);
	}
	public void actionPerformed(ActionEvent ae){}
}

class Nob extends JFrame implements ActionListener{
	JFrame fhn;
	JPanel phn;
	Nob(){
		phn = new JPanel();
		fhn = new JFrame();
		phn.setLayout(new BorderLayout());
		JEditorPane web = new JEditorPane();
		web.setContentType("text/html");
		web.setEditable(false);
		web.setText("<h1>STUDENT INFORMATION</h1><h2 style=\"font-weight:normal;\">NAME : HUSEIN NOBLE<br><br>DOB : 07-01-1994<br><br>PRESENT ADDRESS : Flat no. ST-52, Brigade Millenium, JP Nagar, Phase 7, Bengaluru.PIN : 560078.<br><br>PERIOD OF STUDY IN COLLEGE : 5 years<br><br>ACADEMIC QUALIFICATION : UNDERGRAD<br><br>OCCUPATION : Intern at ALPHABET Inc.<br><br>HOBBY : Getting 10 points, Listening to Ariana Grande, Reading.<br><br>Contact no. : 8657867500<br><br>EMAIL ID : vathsavi17318@mechyd.ac.in</h2>");
		JScrollPane sp = new JScrollPane(web);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setPreferredSize(new Dimension(900,900));
		sp.setMinimumSize(new Dimension(60,60));
		phn.add(sp,BorderLayout.CENTER);
		fhn.setTitle("DIRECTORY");
		fhn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fhn.setVisible(true);
		fhn.setSize(900,900);
		fhn.add(phn);
	}
	public void actionPerformed(ActionEvent ae){}
}