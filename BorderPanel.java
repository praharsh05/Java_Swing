import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BorderPanel extends JPanel{
	private JLabel labelN,labelS,labelE,labelW;
	private JPanel topPanel, rightPanel, bottomPanel, leftPanel;
	public BorderPanel() {
		Font f = new Font("TimesRoman", Font.PLAIN, 24);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		labelN=new JLabel("North");
		labelS=new JLabel("South");
		labelE=new JLabel("<html> &nbsp E &nbsp <br> &nbsp A " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
		labelW= new JLabel("<html> &nbsp W &nbsp <br> &nbsp E " + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
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
}
