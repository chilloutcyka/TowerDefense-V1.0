import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	public static String title = "Tower Defence Xtreme";
	public static Dimension size = new Dimension(700, 550);
	
	public Frame () {
		setTitle(title);
		setSize(size);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
	}
	
	public void init() {
		setLayout(new GridLayout (1, 1, 0, 0));
		Screen screen = new Screen();
		add(screen);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
			Frame frame = new Frame();
	}
}
