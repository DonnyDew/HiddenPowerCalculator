import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Listener implements ChangeListener {
	// These variables are global so they can be apart of the frame and change listener
	int hp;int atk; int def; int spAtk; int spDef; int spd;
	MySlider hpSlider;
	MySlider atkSlider;
	MySlider defSlider;
	MySlider spAtkSlider;
	MySlider spdSlider;
	MySlider spDefSlider;
	JLabel hpLabel;
	JLabel atkLabel;
	JLabel defLabel;
	JLabel spAtkLabel;
	JLabel spDefLabel;
	JLabel spdLabel;
	JLabel resultLabel;
	
	Listener(){  // Order from largest to smallest part is :
				// Frame -> Panel -> MiniPanel -> Slider & Label
		MyFrame frame = new MyFrame(); //create frame
		// Create two initial panels that make up whole frame
		JPanel statPanel = new JPanel();
		JPanel resultPanel = new JPanel();
		// Laying out panels how I want them to be
		statPanel.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		resultPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,50,0));
		
		statPanel.setBounds(0,0,750,300);
		resultPanel.setBounds(0,300,750,200);
		
		resultPanel.setBackground(Color.decode("#C0C0C0")); //light gray color
		// Panel's added to frame
		frame.add(statPanel);
		frame.add(resultPanel);
		// Keeping track of color codes to use multiple times
		String lightRed = "#FF9999";
		String lightOrange = "#FFCC99";
		String lightYellow = "#FFFF99";
		String lightGreen = "#99FF99";
		String lightBlue = "#99CCFF";
		String lightPurple = "#CC99FF";
		// Create 6 panels with the color set
		MiniPanel hpPanel = new MiniPanel(lightRed);
		MiniPanel atkPanel = new MiniPanel(lightOrange);
		MiniPanel defPanel = new MiniPanel(lightYellow);
		MiniPanel spAtkPanel = new MiniPanel(lightGreen);
		MiniPanel spDefPanel = new MiniPanel(lightBlue);
		MiniPanel spdPanel = new MiniPanel(lightPurple);
		// Adding new panels to statPanel
		statPanel.add(hpPanel);
		statPanel.add(atkPanel);
		statPanel.add(defPanel);
		statPanel.add(spAtkPanel);
		statPanel.add(spDefPanel);
		statPanel.add(spdPanel);
		// Create 6 sliders and adding state change to each one
		hpSlider = new MySlider(lightRed);
		hpSlider.addChangeListener(this);
		atkSlider = new MySlider(lightOrange);
		atkSlider.addChangeListener(this);
		defSlider = new MySlider(lightYellow);
		defSlider.addChangeListener(this);
		spAtkSlider = new MySlider(lightGreen);
		spAtkSlider.addChangeListener(this);
		spDefSlider = new MySlider(lightBlue);
		spDefSlider.addChangeListener(this);
		spdSlider = new MySlider(lightPurple);
		spdSlider.addChangeListener(this);
		// Add sliders to the proper panel
		hpPanel.add(hpSlider);
		atkPanel.add(atkSlider);
		defPanel.add(defSlider);
		spAtkPanel.add(spAtkSlider);
		spDefPanel.add(spDefSlider);
		spdPanel.add(spdSlider);
		// Creating labels for the 6 mini panels
		hpLabel = new JLabel("Hp : " + String.valueOf(hp));
		atkLabel = new JLabel("Atk : " + String.valueOf(atk));
		defLabel = new JLabel("Def : " + String.valueOf(def));
		spAtkLabel = new JLabel("SpAtk : " + String.valueOf(spAtk));
		spDefLabel = new JLabel("SpDef : " + String.valueOf(spDef));
		spdLabel = new JLabel("Spd : " + String.valueOf(spd));
		
		JLabel resultTitle = new JLabel("Hidden Power Ability: ");
		resultTitle.setFont(new Font("MV Boli",Font.PLAIN,30));
		
		resultLabel = new JLabel();
		resultLabel.setFont(new Font("MV Boli",Font.BOLD,30));
		
		// Adding labels to proper panels
		hpPanel.add(hpLabel);
		atkPanel.add(atkLabel);
		defPanel.add(defLabel);
		spAtkPanel.add(spAtkLabel);
		spDefPanel.add(spDefLabel);
		spdPanel.add(spdLabel);
		
		resultPanel.add(resultTitle);
		resultPanel.add(resultLabel);
		
		frame.setVisible(true);
		
	}
	@Override
	public void stateChanged(ChangeEvent e) { // Stores number from slider into attribute and changes label
		if (e.getSource() == hpSlider) {
			hp = hpSlider.getValue();
			hpLabel.setText("Hp : " + String.valueOf(hp));
		}
		if (e.getSource() == atkSlider) {
			atk = atkSlider.getValue();
			atkLabel.setText("Atk : " + String.valueOf(atk));
		}
		if (e.getSource() == defSlider) {
			def = defSlider.getValue();
			defLabel.setText("Def : " + String.valueOf(def));
		}
		if (e.getSource() == spAtkSlider) {
			spAtk = spAtkSlider.getValue();
			spAtkLabel.setText("SpAtk : " + String.valueOf(spAtk));
		}
		if (e.getSource() == spDefSlider) {
			spDef = spDefSlider.getValue();
			spDefLabel.setText("SpDef : " + String.valueOf(spDef));
		}
		if (e.getSource() == spdSlider) {
			spd = spdSlider.getValue();
			spdLabel.setText("Spd : " + String.valueOf(spd));
		}
		// Setting result label to the type (final result)
		String type = getType(hp,atk,def,spAtk,spDef,spd); // getType is a function written below
		resultLabel.setText(type);
	}
	public String getType(int hp, int atk, int def, int spAtk, int spDef, int spd) {
		// Gathering images that are downloaded in file
		ImageIcon fireIcon = new ImageIcon("fire.png");
		ImageIcon darkIcon = new ImageIcon("Dark.png");
		ImageIcon fightingIcon = new ImageIcon("Fighting.png");
		ImageIcon ghostIcon = new ImageIcon("ghost.png");
		ImageIcon groundIcon = new ImageIcon("ground.png");
		ImageIcon psychicIcon = new ImageIcon("psychic.png");
		ImageIcon waterIcon = new ImageIcon("water.png");
		ImageIcon iceIcon = new ImageIcon("ice.png");
		ImageIcon posionIcon = new ImageIcon("poision.png");
		ImageIcon flyingIcon = new ImageIcon("flying.png");
		ImageIcon dragonIcon = new ImageIcon("dragon.png");
		ImageIcon steelIcon = new ImageIcon("steel.png");
		ImageIcon bugIcon = new ImageIcon("bug.png");
		ImageIcon electricIcon = new ImageIcon("electric.png");
		ImageIcon grassIcon = new ImageIcon("grass.png");
		ImageIcon rockIcon = new ImageIcon("rock.png");
		
		// Hidden Power formula
		double numDouble = (((hp%2) + 2*(atk%2) + 4*(def%2) + 8*(spd%2) + 16*(spAtk%2)+ 32*(spDef%2)) * 15) / 63;
		int numResult = (int) Math.floor(numDouble);
		
		String TYPE;
		// Sets "TYPE" for result label and sets Icon
		// There will only be 1 type and Icon in the same moment
		if (numResult == 0) {
		    TYPE = "fighting";
		    resultLabel.setIcon(fightingIcon);
		    }
		else if (numResult == 1) {
		    TYPE = "Flying";
		    resultLabel.setIcon(flyingIcon);
		    }
		else if (numResult == 2) {
		    TYPE = "Poision";
		    resultLabel.setIcon(posionIcon);}
		else if (numResult == 3) {
		    TYPE = "Ground";
		    resultLabel.setIcon(groundIcon);}
		else if (numResult == 4) {
		    TYPE = "Rock";
		    resultLabel.setIcon(rockIcon);}
		else if (numResult == 5) {
		    TYPE = "Bug";
		    resultLabel.setIcon(bugIcon);}
		else if (numResult == 6){
		    TYPE = "Ghost";
		    resultLabel.setIcon(ghostIcon);}
		else if (numResult == 7){
		    TYPE = "Steel";
		    resultLabel.setIcon(steelIcon);}
		else if (numResult == 8){
		    TYPE = "Fire";
		    resultLabel.setIcon(fireIcon);}
		else if (numResult == 9){
		    TYPE = "Water";
		    resultLabel.setIcon(waterIcon);}
		else if (numResult == 10){
		    TYPE = "Grass";
		    resultLabel.setIcon(grassIcon);}
		else if (numResult == 11){
		    TYPE = "Electric";
		    resultLabel.setIcon(electricIcon);}
		else if (numResult == 12){
		    TYPE = "Psychic";
		    resultLabel.setIcon(psychicIcon);}
		else if (numResult == 13){
		    TYPE = "Ice";
		    resultLabel.setIcon(iceIcon);}
		else if (numResult == 14){
		    TYPE = "Dragon";
		    resultLabel.setIcon(dragonIcon);}
		else if (numResult == 15){
		    TYPE = "Dark";
		    resultLabel.setIcon(darkIcon);}
		else { //This case should never happen
		    TYPE = "None";}
		
		return TYPE;
				
	}
}
