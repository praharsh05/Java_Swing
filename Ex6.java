import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.border.Border;
public class Ex6 extends JFrame{
	private JLabel labelN,labelS,labelE,labelW;
	private JPanel topPanel, rightPanel, bottomPanel, leftPanel;
	
	public Ex6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400,400);
		setLocation(100,100);
		setTitle("Border Layout for JFrame");
		Font f = new Font("TimesRoman", Font.PLAIN, 24);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		labelN=new JLabel("North");
		labelS=new JLabel("South");
		labelE=new JLabel("<html> &nbsp E &nbsp <br> &nbsp A " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
		labelW= new JLabel("<html> &nbsp W &nbsp <br> &nbsp E " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
//		JLabel leftLabel = new JLabel("<html> W <br> E <br> S <br> T </html>");
		labelN.setFont(f);
		labelS.setFont(f);
		labelE.setFont(f);
		labelW.setFont(f);
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
		topPanel.setBorder(blackline);
		bottomPanel.setBorder(blackline);
		rightPanel.setBorder(blackline);	
		leftPanel.setBorder(blackline);	
		this.add(topPanel,BorderLayout.NORTH);
		this.add(bottomPanel,BorderLayout.SOUTH);
		this.add(rightPanel,BorderLayout.EAST);
		this.add(leftPanel,BorderLayout.WEST);
		}
		public static void main(String [] args) {
			Ex6 frame = new Ex6();
		    frame.setVisible(true);
		   }
}
