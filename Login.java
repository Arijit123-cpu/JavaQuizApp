package quiz_application;

/* JFrame class is under Swing package 
   And Swing package comes under 
   Java Extended package */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener { 

	// All the frames of the classes needs
	// to be written within the constructor
	// for calling the frames
	
	JButton back,rules;
	JTextField tfname;
	
	Login(){
		/*To change the color of the Frame we 
		 need to use the setBackground method
		*/
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		// Within JFrame there is class ImageIcon.
		ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		/* To select the image from file directory/system 
		we use a class named ClassLoader where we 
		 use a static method named getSystemResource where 
		 we pass the full address of the image.*/
		
		JLabel image =new JLabel(i1);
		image.setBounds(0, 0, 500, 360);
		add(image);
		// If we make any component and want to place that on a frame 
		// then
		
		JLabel heading = new JLabel("Simple Minds");
		heading.setBounds(650, 25, 300, 25);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,25));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name = new JLabel("Enter your name");
		name.setBounds(675, 40, 500, 115);
		name.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		name.setForeground(new Color(30,144,254));
		add(name);
		
		tfname =new JTextField();
		tfname.setBounds(600, 120, 285, 25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,12));
		add(tfname);
		
		rules =new JButton("Rules");
		rules.setBounds(600, 175, 110, 30);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		back =new JButton("Back");
		back.setBounds(775, 175, 110, 30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		
		/* Our frames visibility by default is 0.
		(Non visible/Hidden) */
		setSize(1000,400);//(Length,Width)of the frame
		setLocation(150,200);
		setVisible(true);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==rules) {
			 String name=tfname.getText();
			 setVisible(false);
			 new Rules(name);
			 
		 }else if(e.getSource()==back) {
			 setVisible(false);
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Login l=new Login(); // Class's object
		is stored within the variable l */
		new Login(); // Anonymous Object
	}

}
