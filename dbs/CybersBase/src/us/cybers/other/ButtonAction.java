package us.cybers.other;
import ua.cybers.graph.*;
import us.cybers.other.Read;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonAction implements ActionListener{
	
	
	public static String tex1 = "���������� ������� =   ";
	
	public void actionPerformed(ActionEvent e) {
			
		        Read.rd();
		        Display.t1.setText(tex1 + tex1.valueOf(Read.BKS));
		        
				System.out.println(tex1 + Read.BKS);
				
				
			
		}
		
	
	
	public class Button2 implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
		
		
			JOptionPane.showMessageDialog(null, " ��� ����� �� ���� ���� ������� ");
		}
		
	}
	
public class Button3 implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
			JOptionPane.showMessageDialog(null, " � ��� ����� �� ���� ���� ������� ");
		}
		
	}
public class Button4 implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
		JOptionPane.showMessageDialog(null, " �� ����!, ���� ��� ����� �� ���� ���� ������� ");
	}
	
}
	
	}