package Main;

import java.awt.event.ActionEvent;
import javax.swing.*;

import javax.swing.AbstractAction;

import display.Display;

public class Main {

	public static void main(String[] args) {
		
		Display.create(800, 600, "Megodrom", 0xff00ff00);
	Timer t = new Timer(1000 / 60, new AbstractAction(){

		
		public void actionPerformed(ActionEvent e) {
		 Display.clear();
		 Display.render();
		 
		 Display.swapBuffers();
			
		}
	

		
	});
		

		t.setRepeats(true);
		t.start();
		
		
	}
}
