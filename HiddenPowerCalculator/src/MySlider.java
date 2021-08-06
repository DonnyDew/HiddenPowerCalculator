
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class MySlider extends JSlider{
	MySlider(String color){
		this.setValue(0);
		this.setMinimum(0);
		this.setMaximum(31);
		this.setMajorTickSpacing(10);
		this.setMinorTickSpacing(2);
		this.setPaintTicks(true);
		this.setPaintLabels(true);
		this.setPreferredSize(new Dimension(125,225));
		this.setBackground(Color.decode(color));
		
		this.setFont(new Font("MV Boli",Font.PLAIN,15));
		this.setOrientation(SwingConstants.VERTICAL);
	}		
}


