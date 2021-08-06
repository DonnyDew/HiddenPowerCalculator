import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MiniPanel extends JPanel {   // There is 6 "mini" panels created 1 for each of the stats
		MiniPanel(String color){
			this.setBackground(Color.decode(color));
			this.setPreferredSize(new Dimension(125,300));
		}
}
