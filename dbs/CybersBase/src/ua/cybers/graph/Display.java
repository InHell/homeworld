package ua.cybers.graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.TableModel;

import us.cybers.other.ButtonAction;
import us.cybers.other.Read;

public class Display extends JFrame{





	public static JTable tab1;
	 
    
	
	// fr1 JPN ===================================================================================
	static Image img = new ImageIcon("res/zdr1.jpg").getImage();
	
	
	static JLabel ilb = new JLabel(new ImageIcon("res/zdr1.jpg"));
	
	static JButton b1 = new JButton(" 4 категория - под снос ");
	static JButton b2 = new JButton(" 1 категория компов");
	static JButton b3 = new JButton(" 2 категория компов");
	static JButton b4 = new JButton(" 3 категория компов");
	
	static JButton b5 = new JButton(" реклама ");
	static JButton b6 = new JButton(" Добавить данные ");
	
	public static JTextField t1 = new JTextField(300);
	public static JTextArea ta1 = new JTextArea("", 40, 40);
	public static JTextField t2 = new JTextField(30);
	public static JTextPane l1 = new JTextPane();
	public static JTextPane l2 = new JTextPane();
	public static JTextPane l3 = new JTextPane();
	public static JTextPane l4 = new JTextPane();
	
	static int W1 = 300;
	static int W2 = 300;
	//end fr1 Jpn ===================================================================================
	
	
	
	
	// Frame JP2==============================================================================
	static JLabel f2ilb2 = new JLabel(new ImageIcon("res/wrk1.jpg"));
	static Image f2img = new ImageIcon("res/zdr1.jpg").getImage();
	
	
	static JButton f2b2 = new JButton("данунахер");
	static JButton f2b3 = new JButton("нахер нахер");
	static JButton f2b4 = new JButton("хочу назад");
	
	//end ==========================================================================================================
	
	public  Display(){
		// constructor , hz poka nahuya on tut ;)			
		
	}
	
	public static void bf (){
		
		// frame window
     JFrame mw = new JFrame();	
        mw.setLocation(MAXIMIZED_BOTH, MAXIMIZED_VERT);
		mw.setResizable(false);
		mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	mw.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mw.setSize(1300, 800);
		mw.setLayout(null);
		mw.setTitle(" cyborg incorporated/notcorporated programs ltd: " + "    |     " +  "    |    " + "Version 1.27.c");
		mw.setVisible(true);
	//    mw.setDefaultLookAndFeelDecorated(true);
	    mw.setIconImage(img);
	    
	    
	
// main PANEL //	  ========================================================================================  
	 JPanel p1 = new JPanel();   
	    p1.setSize(1300, 800);
	    p1.setBounds(1, 1, 1300, 800);
	    p1.setLayout(null);
	    p1.setBackground(Color.BLACK);
// panel 1 off ===============================================================================================	    
	    //get some image to content
	    p1.add(ilb); 
	    ilb.setBounds(905, 600, 480, 220);
			    
		// buttons 
	    p1.add(b1);
	    b1.setBounds(125, 550, 190, 40);	   
	    p1.add(b2);
	    b2.setBounds(125, 250, 190, 40);	    
	    p1.add(b3);
	    b3.setBounds(125, 350, 190, 40);	    
	    p1.add(b4);
	    b4.setBounds(125, 450, 190, 40);
	    p1.add(b5);
	    b5.setBounds(1000, 250, 190, 40);
	//  p1.add(b6);
	//  b6.setBounds(1000, 350, 190, 40);
	   
	 // set some text string . nice
	    p1.add(l1);
	    l1.setText("                                                                               Информационное окно");
	    l1.setBounds(350, 130, 620, 20);
	    l1.setEditable(false);
	    l1.setBackground(Color.lightGray);
	    l1.setForeground(Color.black);   
	   
	   
   
	    p1.add(l2);
	    l2.setText("                  Главное меню    ");
	    l2.setBounds(125, 230, 190, 20);
	    l2.setEditable(false);
	    l2.setBackground(Color.lightGray);
	    l2.setForeground(Color.black);
	    
	    p1.add(l3);
	    l3.setText("made by Sviridov D.I.(c) 2016. IT-CREW");
	    l3.setBounds(1005, 580, 280, 18);
	    l3.setEditable(false);
	    l3.setBackground(Color.darkGray);
	    Font font = new Font("Verdana", Font.PLAIN, 12);
	    l3.setFont(font);	    
	    l3.setForeground(Color.cyan);
	    
//	   p1.add(ta1);
//	    ta1.setBackground(Color.WHITE);
//	   ta1.setBounds(500, 150, 450, 540);
//	   ta1.setEditable(true);
//	    ta1.setFont(new Font("Dialog", Font.PLAIN, 14));
 //       ta1.setTabSize(10);
 //       ta1.setLineWrap(true);
	   
	  
	     // Object[] columnsHeader = new String[] {"Филиал", "Всего ПК","Этой Категории"};
        
       tab1 = new JTable();
		
	    
		p1.add(tab1);
		tab1.setBounds(350,150,620, 450);
		
		
		p1.revalidate();
	//	mw.revalidate();
		
	           
        ButtonAction.Button4 a4 = new ButtonAction.Button4();
	    b4.addActionListener(a4);
        
        ButtonAction.Button3 a3 = new ButtonAction.Button3();
	    b3.addActionListener(a3);
        
	    ButtonAction.Button2 a2 = new ButtonAction.Button2();
	    b2.addActionListener(a2);
	    
	    ButtonAction a1 = new ButtonAction();
	    b1.addActionListener(a1);
	    
//   ButtonAction.Button6 a6 = new ButtonAction.Button6();
//   b6.addActionListener(a6);
	    
	
	
	    mw.add(p1);
	    mw.revalidate();
	    
	   // PANEL -2 ======================================================================================
	    JPanel p2 = new JPanel();   
	    p2.setSize(1300, 800);
	    p2.setBounds(1, 1, 1300, 800);
	    p2.setLayout(null);
	    p2.setBackground(Color.BLACK);
	    
	    //panel 2 offffff ===============================================================================
	    
	    b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			p1.setVisible(false);
			mw.add(p2);
			p2.setVisible(true);
			mw.revalidate();
	
				
			}
		});
	    
	    p2.add(f2ilb2); 
	    f2ilb2.setBounds(605, 300, 280, 280);
	    
	    p2.add(f2b2);
	    f2b2.setBounds(300, 300, 290, 80);
	   	   	    
	    p2.add(f2b3);
	    f2b3.setBounds(300, 400, 290, 80);
	    
        p2.add(f2b4);
	    f2b4.setBounds(300, 500, 290, 80);
	    
	// back to 1 FR =================================================================================   
	    f2b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				p2.setVisible(false);
				p1.setVisible(true);
				mw.revalidate();
				
			}
		});
	    
   //===================================================================================================
	   
	     
	     
	    
	
	
		
	
	}
 
	
}


