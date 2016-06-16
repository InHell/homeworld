package ua.cybers.graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import us.cybers.other.ButtonAction;

public class Display extends JFrame{

	static Image img = new ImageIcon("res/zdr1.jpg").getImage();
	
	
	static JLabel ilb = new JLabel(new ImageIcon("res/zdr1.jpg"));
	
	static JButton b1 = new JButton(" Филиалы ");
	static JButton b2 = new JButton(" 1 категория компов");
	static JButton b3 = new JButton(" 2 категория компов");
	static JButton b4 = new JButton(" 3-4 отстойная категория");
	public static JTextField t1 = new JTextField(300);
	public static JTextArea ta1 = new JTextArea("", 40, 40);
	public static JTextField t2 = new JTextField(30);
	public static JTextPane l1 = new JTextPane();
	public static JTextPane l2 = new JTextPane();
	public static JTextPane l3 = new JTextPane();
	
	static int W1 = 300;
	static int W2 = 300;
	
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
		mw.setTitle(" cyborg incorporated/notcorporated programs ltd: " + "    |     " +  "    |    " + "Version 0.03.b");
		mw.setVisible(true);
	    mw.setDefaultLookAndFeelDecorated(true);
	    
	    //get some image to content
	    mw.add(ilb); 
	    ilb.setBounds(905, 600, 480, 220);
		
	    
		// buttons 
		mw.add(b1);
	    b1.setBounds(125, 150, 190, 40);	   
	    mw.add(b2);
	    b2.setBounds(125, 250, 190, 40);	    
	    mw.add(b3);
	    b3.setBounds(125, 350, 190, 40);	    
	    mw.add(b4);
	    b4.setBounds(125, 450, 190, 40);
	   
	 // set some text string . nice
	    mw.add(l1);
	    l1.setText("                                               Информационное окно");
	    l1.setBounds(500, 130, 450, 20);
	    l1.setEditable(false);
	    l1.setBackground(Color.lightGray);
	    l1.setForeground(Color.black);
	    
	    
	    mw.add(l2);
	    l2.setText("                  Главное меню    ");
	    l2.setBounds(125, 90, 190, 20);
	    l2.setEditable(false);
	    l2.setBackground(Color.lightGray);
	    l2.setForeground(Color.black);
	    
	    mw.add(l3);
	    l3.setText("made by Sviridov D.I.(c) 2016. IT-CREW");
	    l3.setBounds(1005, 580, 280, 18);
	    l3.setEditable(false);
	    l3.setBackground(Color.darkGray);
	    Font font = new Font("Verdana", Font.PLAIN, 12);
	    l3.setFont(font);	    
	    l3.setForeground(Color.cyan);
	  
	    
	   
	    
	    mw.add(ta1);
	    ta1.setBackground(Color.WHITE);
	    ta1.setBounds(500, 150, 450, 540);
	    ta1.setEditable(true);
	    ta1.setFont(new Font("Dialog", Font.PLAIN, 14));
        ta1.setTabSize(10);
        ta1.setLineWrap(true);
      //  ta1.setWrapStyleWord(true);
	    
        ButtonAction.Button4 a4 = new ButtonAction.Button4();
	    b4.addActionListener(a4);
        
        ButtonAction.Button3 a3 = new ButtonAction.Button3();
	    b3.addActionListener(a3);
        
	    ButtonAction.Button2 a2 = new ButtonAction.Button2();
	    b2.addActionListener(a2);
	    
	    ButtonAction a1 = new ButtonAction();
	    b1.addActionListener(a1);
	    
	   
	     mw.setIconImage(img);
	     
	    
	    
	    // content
		mw.getContentPane().setBackground(Color.darkGray);
	
		
		
	}
	
	
}


