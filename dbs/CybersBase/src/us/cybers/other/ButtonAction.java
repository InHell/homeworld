package us.cybers.other;
import ua.cybers.graph.*;
import us.cybers.other.Read;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ButtonAction implements ActionListener{
	
	
	
	// public static String tex1 = "Количество записей =   ";
	
	public void actionPerformed(ActionEvent e) {
			
		        Read.rd();
		//        Display.ta1.setText(String.valueOf(Read.id + Read.nf));
		        
		//		System.out.println(tex1 + Read.id + Read.nf);
				
	//	        JOptionPane.showMessageDialog(null, " Тут могла бы быть ваша реклама ");
			
		}
		
	
	// info for Jpanel
	//p2
//		p2.setLayout(null);
//		p2.setSize(1440, 902);
//		p2.setBackground(Color.GREEN);
//		JButton b2 = new JButton(" Biatch 2!! ");
//		b2.setBackground(Color.BLUE);
//		p2.add(b2);
//		b2.setBounds(300, 150, 200, 25);
//	b2.addActionListener(new ActionListener() {
			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				p2.setVisible(false);
//				p3.setVisible(true);
//				x.validate();
//				
///			}
//		});
	
//	table = new JTable();
//	table.setBounds(133, 62, 433, 263);
//	frame.getContentPane().add(table);
	
	//end
	
	public static class Button2 implements ActionListener{

		
		public void actionPerformed(ActionEvent c) {
			
		
		
			Read.rd2();
		}
		
	}
	
public static class Button3 implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			Read.rd3();
			
		}
		
	}
public static class Button4 implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
		Read.rd4();
	}
	
}
public static class Button5 implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, "sss");
		
	}
	
}
public static class Button6 implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
		JOptionPane.showMessageDialog(null, "under working");
	}
	
}
	
	}