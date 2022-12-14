import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.GridLayout;


public class Wallpaper1 extends JFrame {
	public Wallpaper1(){
		// the usual JFrame stuff
		final int UNIT = 20;
		this.setLocation(20,20);
		this.setTitle("Wallpaper1");
		this.setSize(30*UNIT, 30*UNIT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3,2));
		// add FilledPanels to each position in the grid
//		this.add(new FilledPanel(UNIT,UNIT,UNIT,UNIT, Color.red,Color.white));
//		this.add(new FilledPanel(UNIT,UNIT,UNIT,UNIT, Color.white,Color.green));
//		this.add(new FilledPanel(UNIT,UNIT,UNIT,UNIT, Color.green,Color.blue));
//		this.add(new FilledPanel(UNIT,UNIT,UNIT,UNIT, Color.blue,Color.yellow));
//		this.add(new FilledPanel(UNIT,UNIT,UNIT,UNIT, Color.yellow,Color.cyan));
//		this.add(new FilledPanel(UNIT,UNIT,UNIT,UNIT, Color.cyan,Color.red));
		//add FilledPanelWithLines to each position in the grid
		this.add(new FilledPanelWithLine(UNIT,UNIT,UNIT,UNIT, Color.red,Color.white));
		this.add(new FilledPanelWithLine(UNIT,UNIT,UNIT,UNIT, Color.white,Color.green));
		this.add(new FilledPanelWithLine(UNIT,UNIT,UNIT,UNIT, Color.green,Color.blue));
		this.add(new FilledPanelWithLine(UNIT,UNIT,UNIT,UNIT, Color.blue,Color.yellow));
		this.add(new FilledPanelWithLine(UNIT,UNIT,UNIT,UNIT, Color.yellow,Color.cyan));
		this.add(new FilledPanelWithLine(UNIT,UNIT,UNIT,UNIT, Color.cyan,Color.red));
	}

public static void main(String[] args){ 
	Wallpaper1 gui = new Wallpaper1(); gui.setVisible(true);
}
}
