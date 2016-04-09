import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class s2 extends JFrame {
  JButton b1,b2;
  JLabel l1, l2, l3, l4;
  JTextField t1, t2;
  int i, k;
  String a, b;
  s3 handler = new s3();
  
	public s2 (String s){
	super(s);
	setLayout(new FlowLayout());
	b1 = new JButton(" CLEAN ");
	b2 = new JButton(" COUNT ");
	l1 = new JLabel(" Enter 1st nubber");
	l2 = new JLabel(" Enter 2st nubber");
	l3 = new JLabel(" ");
	l4 = new JLabel(" ");
	t1 = new JTextField(10);
	t2 = new JTextField(10);
	b2.addActionListener(handler);
	b1.addActionListener(handler);
	
	add(t2);
	add(l2);
	add(t1);
	add(l1);
	add(l3);
	add(l4);
	add(b1);
	add(b2);
}
	public class s3 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			try{
			
	if(e.getSource()==b2){
		i = Integer.parseInt(t1.getText());
		k = Integer.parseInt(t2.getText());
		i++;
		k++;
		a = "ur 1 4islo teepr ravno " + i;
		b = "ur 2 4islo  ravno " + k;
		l3.setText(a);
		l4.setText(b);
	}		
	
		
		if(e.getSource()==b1){
			t1.setText(null);
			t2.setText(null);
			l3.setText(null);
			l4.setText(null);
		}

		}catch (Exception ex){ JOptionPane.showMessageDialog(null,"vvedite 4islo suka"); } 
}
}
}