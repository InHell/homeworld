package us.cybers.other;
import ua.cybers.graph.*;
import us.cybers.other.Read;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonAction implements ActionListener{
	
	
	
	// public static String tex1 = "Количество записей =   ";
	
	public void actionPerformed(ActionEvent e) {
			
		        Read.rd();
		//        Display.ta1.setText(String.valueOf(Read.id + Read.nf));
		        
		//		System.out.println(tex1 + Read.id + Read.nf);
				
	//	        JOptionPane.showMessageDialog(null, " Тут могла бы быть ваша реклама ");
			
		}
		
	
	
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
	
	}