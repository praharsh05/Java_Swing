import javax.swing.*;

// Ex7
public class Ex7 extends JFrame {
	public Ex7() {
		// add title, size and close information
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400,400);
		setLocation(100,100);
		setTitle("Border Layout for JFrame");
		BorderPanel myPanel = new BorderPanel(); 
		this.add(myPanel);
	}
	// add main method similar to that for Ex1 - Ex6
	public static void main(String [] args) {
		Ex7 frame = new Ex7();
	    frame.setVisible(true);
	   }
}