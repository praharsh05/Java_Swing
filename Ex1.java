import java.awt.BorderLayout;

import javax.swing.*;

public class Ex1 extends JFrame{
	private JLabel labelN,labelS,labelE,labelW;
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400,400);
		setLocation(100,100);
		setTitle("Border Layout for JFrame");
		labelN=new JLabel("North");
		labelS=new JLabel("South");
		labelE=new JLabel("East");
		labelW=new JLabel("West");
		this.add(labelN,BorderLayout.NORTH);
		this.add(labelS,BorderLayout.SOUTH);
		this.add(labelE,BorderLayout.EAST);
		this.add(labelW,BorderLayout.WEST);
		}
		public static void main(String [] args) {
			Ex1 frame = new Ex1();
		    frame.setVisible(true);
		   }
}

