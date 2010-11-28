package org.ut.sm.mancala;

/*
 * MancalaClientView.java
 */

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

import org.ut.sm.mancala.client.Cup;
import org.ut.sm.mancala.client.Game;
import org.ut.sm.mancala.client.Kahala;
import org.ut.sm.mancala.client.Player;

/**
 * The application's main frame.
 */
public class MancalaClientView extends JFrame implements ActionListener {

	Game game = new Game();
	Player p1 = new Player("Naved");
	Player p2 = new Player("Naid");

	public MancalaClientView() {
		super("Mancala Client!");
		initComponents();
	}

	private void initComponents() {

		P1 = new javax.swing.JLabel();
		P1.setText(p1.getName());
		P2 = new javax.swing.JLabel();
		P2.setText(p2.getName());

		game.addToPlayer(p1);
		game.addToPlayer(p2);
		cups = new Cup[12];
		kahalas = new Kahala[2];

		for (int i = 0; i < 12; i++) {
			cups[i] = new Cup("4");
			if (i < 6) {
				cups[i].setPlayer(p1);
			} else {
				cups[i].setPlayer(p2);
			}
//			System.out.println("cups[" + i + "]"
//					+ cups[i].getPlayer().getName());
		}

//		cups[4].setStones(0);
//		cups[10].setStones(0);
		
		int randomVal = (int) (Math.random() * 10.0) + 1;

		if (randomVal % 2 == 0) {
			game.setIsActive(p1);
			P1.setText(p1.getName() + " - YOUR TURN");
			P2.setText(p2.getName());
			for (int i = 0; i < 6; i++) {
				cups[i].setEnabled(true);
			}
			for (int i = 6; i < 12; i++) {
				cups[i].setEnabled(false);
			}
		} else {
			game.setIsActive(p2);
			P2.setText(p2.getName() + " - YOUR TURN");
			P1.setText(p1.getName());
			for (int i = 0; i < 6; i++) {
				cups[i].setEnabled(false);
			}
			for (int i = 6; i < 12; i++) {
				cups[i].setEnabled(true);
			}

		}
		System.out.println("Acive turn: " + game.getIsActive().getName());

		mainPanel = new javax.swing.JPanel();

		kahalas[0] = new Kahala("0");
		kahalas[0].setPlayer(p1);
		kahalas[1] = new Kahala("0");
		kahalas[1].setPlayer(p2);

		for (int i = 0; i < 12; i++) {
			if (i < 12 - 1) {
				cups[i].setRightCup(cups[i + 1]);
			} else {
				cups[i].setRightCup(cups[0]);
			}
			if (i == 5) {
				cups[i].setKahala(kahalas[0]);
				kahalas[0].setPlayer(p1);
			} else if (i == 11)
				cups[i].setKahala(kahalas[1]);
			kahalas[1].setPlayer(p2);
		}

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

		for (int i = 0; i < 12; i++) {
			// cups[i].setText(""+i);
			// cups[i].setLeftCup(cups[i++]);
			// mainPanel.add(cups[i]);
			// cups[i].setVisible(true);
			cups[i].addActionListener(this);
		}

		getContentPane().add(mainPanel);
		setSize(550, 300);
		setResizable(false);
		setVisible(true);
	}

	public boolean isGameFinished() {
		int player1Stones = 0, player2Stones = 0;

		for (int j = 0; j < 6; j++) {
			player1Stones += cups[j].getStones();
		}
		for (int j = 6; j < 12; j++) {
			player2Stones += cups[j].getStones();
		}

		if (player1Stones == 0 || player2Stones == 0) {
			System.out.println("Game over.....");
			return true;
		}
		return false;
	}

	public Player winner() {

		Player winner = null;
		int p1Kahala = kahalas[0].getStones();
		int p2Kahala = kahalas[1].getStones();

		if (p1Kahala > p2Kahala) {
			winner = p1;
		} else if ((p1Kahala < p2Kahala)) {
			winner = p2;
		} else if (p1Kahala == p2Kahala) {
			winner = null;
		}
		System.out.println(winner.getName() + " Won!- \n P1 Score = "
				+ p1Kahala + ", P2 Score = " + p2Kahala);
		return winner;
	}

	public void actionPerformed(java.awt.event.ActionEvent evt) {

		int numOfStones;

		for (int i = 0; i < 12; i++) {

			if (evt.getSource() == cups[i]) {
				if (cups[i].getStones() == 0)
					break;

				numOfStones = cups[i].getStones();
				cups[i].setStones(0);
				int index = 0;
				int tempJ = 0;
				boolean addtionalTurn = false;
				boolean captureStones = false;

				for (int j = 0; j < numOfStones; j++) {

					Kahala kahala = null;
					boolean isKahala = false;

					if (i + j > 11) {
						i = 0;
						tempJ = 0;
						index = i + tempJ;
					} else {
						index = i + tempJ;
					}//end else of if (i + j > 11) 

					Cup rightCup = cups[index].getRightCup();

					if (cups[index].getKahala() != null
							        && game.getIsActive().equals(cups[index].getPlayer())) {
						isKahala = true;
						kahala = cups[index].getKahala();
					}// end if (cups[index].getKahala() != null .......

					if (isKahala) {
						System.out.println("i=" + i + ", j=" + j + ", tempJ="+ tempJ + ", index=" + index + "=K");
						kahala.setStones(kahala.getStones() + 1);
						j = j + 1; // restrict player to number of stones only
						if (j == numOfStones) {
							addtionalTurn = true;
						}//end if (j == numOfStones) 
					}//end if (isKahala) 

					if (j < numOfStones) {
						int st = rightCup.getStones();
						System.out.println("stones in parallel cup: " + st);

						if (j == (numOfStones - 1) && st == 0
								&& game.getIsActive().equals(rightCup.getPlayer())
								&& cups[(cups.length - 1) - (index - 1) - 1-1].getStones() > 0) {

							int parallelCupStones = cups[(cups.length - 1) - (index - 1) - 1-1].getStones();
//							System.out.println("parallelCupStones:"
//									+ parallelCupStones);
							Kahala activePlayerKahala = game.getIsActive().getKahala();
							int activePlayerKahalaStones = activePlayerKahala.getStones();
							activePlayerKahala.setStones(parallelCupStones + activePlayerKahalaStones + 1);

							if (index == 11)
								cups[(cups.length - 1) - index].setStones(0);
							else
								cups[(cups.length - 1) - index - 1].setStones(0); // Capture the opponent's cup stones
							captureStones = true;
						}//end if (j == (numOfStones - 1) && st == 0 ........
						if (captureStones) {
							rightCup.setStones(0);
							captureStones = false;
						} else {
							rightCup.setStones(st + 1);
						} //end else if (captureStones)
						System.out.println("i=" + i + ", j=" + j + ", tempJ="
								+ tempJ + ", index=" + index + ", numOfStones:"
								+ numOfStones);
					}//end if (j < numOfStones) {
					tempJ++;

				}//end loop for (int j = 0; j < numOfStones; j++) 


				if (isGameFinished()) {
					Player winner = winner();
					JOptionPane.showMessageDialog(null, winner.getName()
							+ " WON. Socer=" + winner.getKahala().getStones());
					System.exit(0);
				}// end if (isGameFinished())

				if (!addtionalTurn)
					if (game.getIsActive().equals(p1)) {
						game.setIsActive(p2);
						P2.setText(p2.getName() + "- YOUR TURN");
						P1.setText(p1.getName());
						for (int k = 0; k < 6; k++) {
							cups[k].setEnabled(false);
						}
						for (int k = 6; k < 12; k++) {
							cups[k].setEnabled(true);
						}
					} else {
						game.setIsActive(p1);
						P1.setText(p1.getName() + "- YOUR TURN");
						P2.setText(p2.getName());
						for (int k = 6; k < 12; k++) {
							cups[k].setEnabled(false);
						}
						for (int k = 0; k < 6; k++) {
							cups[k].setEnabled(true);
						}
					}//end of else for condition if (game.getIsActive().equals(p1)) 
				addtionalTurn = false;

//				System.out.println("Whose Turn is : "
//						+ game.getIsActive().getName());
				break;
			}
			System.out.println("-");
		}
	}

	// Variables declaration - do not modify
	private Cup cups[];
	private Kahala kahalas[];
	private javax.swing.JLabel P1;
	private javax.swing.JLabel P2;
	private javax.swing.JLabel turn;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel mainPanel;
	private javax.swing.JProgressBar progressBar;
	private javax.swing.JLabel statusAnimationLabel;
	private javax.swing.JLabel statusMessageLabel;
	private javax.swing.JPanel statusPanel;

	public static void main(String[] as) {
		new MancalaClientView();
	}

}
