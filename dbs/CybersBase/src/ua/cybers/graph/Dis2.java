package ua.cybers.graph;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dis2 {

	JLabel my2 = new JLabel();
	
	public static void  Dis2(String[] args) throws IOException{
		
		BufferedImage mp1 = ImageIO.read(new File("/res/zdr1.jpg"));
		JLabel my1 = new JLabel(new ImageIcon(mp1));
		
		
	}
	
	
	
	
	
}
