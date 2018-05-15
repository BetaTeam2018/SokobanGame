package graphics;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;

public class JGame extends JFrame {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel mainPanel = new JPanel();
	private final GamePanel gameBoardPanel = new GamePanel();	
	private final ScorePanel scorePanel = new ScorePanel();
	
	
	//TODO input fájl a menüben lévő comobox alapján
	private Controller cnt;
	
	public JGame() {
		////
		this.setTitle("Soko");
		this.setSize(655, 850);
		//this.setLayout(experimentLayout);
		this.setLocation(425 + 50, 100 + 50);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		////
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		gameBoardPanel.setPreferredSize(new Dimension(655, 650));
		scorePanel.setPreferredSize(new Dimension(655, 150));
		
		mainPanel.add(gameBoardPanel);
		mainPanel.add(scorePanel);
		
		this.add(mainPanel);
		
		cnt = new Controller("bin\\maps\\test.txt", gameBoardPanel);
		gameBoardPanel.setView(cnt.getView());
		//gameBoardPanel.addKeyListener(cnt);
		this.addKeyListener(cnt);
		
		pack();
		
	}
	
}
