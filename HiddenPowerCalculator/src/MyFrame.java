
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		ImageIcon image = new ImageIcon("pokeball.png");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Hidden Power Calculator");
		this.setIconImage(image.getImage());
		this.setSize(750,500);
		this.setLayout(null);
		this.setResizable(false);
	}
}
