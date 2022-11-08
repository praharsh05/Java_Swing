import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.*;
public class Ex2 extends JFrame{
	private JLabel labelN,labelS,labelE,labelW;
	private JPanel topPanel, rightPanel, bottomPanel, leftPanel;
	
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400,400);
		setLocation(100,100);
		setTitle("Border Layout for JFrame");
		labelN=new JLabel("North");
		labelS=new JLabel("South");
		labelE=new JLabel("East");
		labelW=new JLabel("West");
		topPanel=new JPanel();
		bottomPanel=new JPanel();
		rightPanel=new JPanel();
		leftPanel=new JPanel();
		topPanel.add(labelN);
		bottomPanel.add(labelS);
		rightPanel.add(labelE);
		leftPanel.add(labelW);
		this.add(topPanel,BorderLayout.NORTH);
		this.add(bottomPanel,BorderLayout.SOUTH);
		this.add(rightPanel,BorderLayout.EAST);
		this.add(leftPanel,BorderLayout.WEST);
		}
		public static void main(String [] args) {
			Ex2 frame = new Ex2();
		    frame.setVisible(true);
		   }
}
