import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.*;
public class Ex3 extends JFrame{
	private JLabel labelN,labelS,labelE,labelW;
	private JPanel topPanel, rightPanel, bottomPanel, leftPanel;
	
	public Ex3() {
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
		leftPanel.setLayout(new GridBagLayout());
		rightPanel.setLayout(new GridBagLayout());
		this.add(topPanel,BorderLayout.NORTH);
		this.add(bottomPanel,BorderLayout.SOUTH);
		this.add(rightPanel,BorderLayout.EAST);
		this.add(leftPanel,BorderLayout.WEST);
		}
		public static void main(String [] args) {
			Ex3 frame = new Ex3();
		    frame.setVisible(true);
		   }
}
