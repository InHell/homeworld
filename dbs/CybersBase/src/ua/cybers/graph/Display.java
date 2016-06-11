package ua.cybers.graph;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import us.cybers.other.ButtonAction;

public class Display extends JFrame{

	
	static JButton b1 = new JButton(" b 1");
	static JButton b2 = new JButton(" b 2");
	static JButton b3 = new JButton(" b 3");
	static JButton b4 = new JButton(" b 4");
	public static JTextField t1 = new JTextField(30);
	public static JTextField t2 = new JTextField(30);
	
	
	public  Display(){
		// constructor , hz poka nahuya on tut ;)			
		
	}
	
	public static void bf(){
		
       JFrame mw = new JFrame();			
        mw.setLocation(MAXIMIZED_BOTH, MAXIMIZED_VERT);
		mw.setResizable(false);
		mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mw.setSize(1300, 800);
		mw.setLayout(null);
		mw.setTitle(" cyborg incorporated/notcorporated programs: ");
		mw.setVisible(true);
	   
		
		// buttons 
		mw.add(b1);
	    b1.setBounds(50, 150, 150, 40);	   
	    mw.add(b2);
	    b2.setBounds(50, 250, 150, 40);	    
	    mw.add(b3);
	    b3.setBounds(50, 350, 150, 40);	    
	    mw.add(b4);
	    b4.setBounds(50, 450, 150, 40);
	    mw.add(t1);
	    t1.setBounds(400, 150, 400, 40);
	    t1.setBackground(Color.CYAN);
	    
	    
	    
	    
	    ButtonAction a1 = new ButtonAction();
	    b1.addActionListener(a1);
	    
	 
	   
	    
	    // content
		mw.getContentPane().setBackground(Color.darkGray);
		
		
	}
	
	
}


