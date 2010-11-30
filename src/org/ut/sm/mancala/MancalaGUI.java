package org.ut.sm.mancala;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import org.ut.sm.mancala.client.Cup;
import org.ut.sm.mancala.client.Game;
import org.ut.sm.mancala.client.Kahala;
import org.ut.sm.mancala.client.Player;

public class MancalaGUI extends JFrame {
	String player1;
	String player2;

	//Game game = new Game();
	// Player p1,p2;
	public javax.swing.JLabel P1;
	public javax.swing.JLabel P2;
	public javax.swing.JLabel turn;
	public javax.swing.JPanel jPanel1;
	public javax.swing.JPanel mainPanel;
	public javax.swing.JProgressBar progressBar;
	public javax.swing.JLabel statusAnimationLabel;
	public javax.swing.JLabel statusMessageLabel;
	public javax.swing.JPanel statusPanel;

	public Cup cups[];
	public Kahala kahalas[];

	public MancalaGUI(String title) {
		super(title);

		cups = new Cup[12];
		kahalas = new Kahala[2];

		for (int i = 0; i < 12; i++) {
			cups[i] = new Cup("4");
		}

		kahalas[0] = new Kahala("0");
		kahalas[1] = new Kahala("0");

		// for (int i = 0; i < 12; i++) {
		// if (i < 12 - 1) {
		// cups[i].setRightCup(cups[i + 1]);
		// } else {
		// cups[i].setRightCup(cups[0]);
		// }
		// if (i == 5) {
		// cups[i].setKahala(kahalas[0]);
		// kahalas[0].setPlayer(p1);
		// } else if (i == 11)
		// cups[i].setKahala(kahalas[1]);
		// kahalas[1].setPlayer(p2);
		// }

		initComponents();
	}

	public void initComponents() {

		P1 = new javax.swing.JLabel();
		P2 = new javax.swing.JLabel();
		mainPanel = new javax.swing.JPanel();

		javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(
				mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout
				.setHorizontalGroup(mainPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								mainPanelLayout.createSequentialGroup()
										.addGap(192, 192, 192).addComponent(P2)
										.addContainerGap(320, Short.MAX_VALUE))
						.addGroup(
								mainPanelLayout.createSequentialGroup()
										.addGap(194, 194, 194).addComponent(P1)
										.addContainerGap(318, Short.MAX_VALUE))
						.addGroup(
								mainPanelLayout
										.createSequentialGroup()
										.addGap(25, 25, 25)
										.addComponent(
												kahalas[1],
												javax.swing.GroupLayout.PREFERRED_SIZE,
												61,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												mainPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																mainPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				cups[0],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cups[1],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cups[2],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cups[3],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cups[4],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				cups[5],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																mainPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				cups[11],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				cups[10],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cups[9],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cups[8],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(6,
																				6,
																				6)
																		.addComponent(
																				cups[7],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cups[6],
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												kahalas[0],
												javax.swing.GroupLayout.PREFERRED_SIZE,
												61,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(31, 31, 31)));
		mainPanelLayout
				.setVerticalGroup(mainPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								mainPanelLayout
										.createSequentialGroup()
										.addGroup(
												mainPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																mainPanelLayout
																		.createSequentialGroup()
																		.addGap(32,
																				32,
																				32)
																		.addComponent(
																				P2))
														.addGroup(
																mainPanelLayout
																		.createSequentialGroup()
																		.addGap(72,
																				72,
																				72)
																		.addGroup(
																				mainPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								mainPanelLayout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												29,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												kahalas[0],
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												64,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(26,
																												26,
																												26))
																						.addGroup(
																								mainPanelLayout
																										.createSequentialGroup()
																										.addGroup(
																												mainPanelLayout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																cups[9],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[8],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[7],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[6],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[10],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[11],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGap(31,
																												31,
																												31)
																										.addGroup(
																												mainPanelLayout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																cups[0],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[1],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[2],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[3],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[4],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cups[5],
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																44,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								mainPanelLayout
																										.createSequentialGroup()
																										.addGap(29,
																												29,
																												29)
																										.addComponent(
																												kahalas[1],
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												64,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(26,
																												26,
																												26)))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
												29, Short.MAX_VALUE)
										.addComponent(P1)
										.addContainerGap(75, Short.MAX_VALUE)));

		// setComponent(mainPanel);

		getContentPane().add(mainPanel);
		this.setJMenuBar(this.createJMenuBar());
		this.add(getToolBar(),BorderLayout.NORTH);
		setSize(550, 330);
		setResizable(false);
		setVisible(true);
	}

	public void getPlayers() {

		do {
			player1 = JOptionPane.showInputDialog(null,
					"Enter first player name: ", "Welcome to Mancala", 1);
		} while (player1.equals(""));

		do {
			player2 = JOptionPane.showInputDialog(null,
					"Enter second player name: ", "Welcome to Mancala", 1);
		} while (player2.equals(""));
		
		JOptionPane.showMessageDialog(null,"Instructions \n\n"+ "The object of this game is to collect as many stones to your Mancala as you can"+"\n\n"+
				"1. You can only move stones from your own side"+"\n\n"+
						"2. Each Time you move, You pick all the stones from the cup and distribute"+"\n"+" them in a counter clockwise direction to the next cup"+"\n\n" +
								"3. If the last stone of a move landed in your mancala, then you will get an additional turn"+"\n\n" +
										"4. If the last stone of the move landed on an empty cup on your mancala sideand there are"+"\n"+" some stones in opposite side, then stonse in both cups will be captured in your mancala. ");
	}
	
	JMenuBar mainMenuBar;
	JMenu file, help;
	JMenuItem filestartNewGame, filerestartGame, filequit, filewelcome, fileinstructions ;


public JMenuBar createJMenuBar() {
		mainMenuBar = new JMenuBar();
		file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_M);
		mainMenuBar.add(file);
		help = new JMenu("Help");
		mainMenuBar.add(help);
		// Creating the MenuItems
		filestartNewGame = new JMenuItem("Play New Game",KeyEvent.VK_T);
		filestartNewGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		//startNewGame.addActionListener(this);
		file.add(filestartNewGame);
		
		filerestartGame = new JMenuItem("Reset");
		filerestartGame.setMnemonic(KeyEvent.VK_B);
		//restartGame.addActionListener(this);
		file.add(filerestartGame);
		// Menu Item with just an Image
		filequit = new JMenuItem("Quit");
		filequit.setMnemonic(KeyEvent.VK_D);
		//quit.addActionListener(this);
		file.add(filequit);
		
		filewelcome = new JMenuItem("Welcome");
		filewelcome.setMnemonic(KeyEvent.VK_D);
		//welcome.addActionListener(this);
		help.add(filewelcome);
		
		fileinstructions = new JMenuItem("Instructions");
		filewelcome.setMnemonic(KeyEvent.VK_D);
		//welcome.addActionListener(this);
		help.add(fileinstructions);
		
		return mainMenuBar;
	}
	
	
	
		JToolBar toolbar;
		JButton newGame;
		JButton restart;
		JButton quitb;
		JButton instruction ;
		JButton showHistory;
		
		public JToolBar getToolBar(){ 
		
			JToolBar toolbar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
			newGame = new JButton("Play New Game");
		    toolbar.add(newGame);
		    restart = new JButton("Reset");
		    toolbar.add(restart);
		    quitb = new JButton("Quit");
		    toolbar.add(quitb);
		    instruction = new JButton("Instructions");
		    toolbar.add(instruction);
		    showHistory = new JButton("Show History");
		    toolbar.add(showHistory);
	
		
		return toolbar;
	}
		
	
	
	


}
