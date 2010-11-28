package org.ut.sm.mancala;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import org.ut.sm.mancala.client.Cup;
import org.ut.sm.mancala.client.Kahala;
import org.ut.sm.mancala.client.Player;

public class MancalaController implements ActionListener{
	MancalaGUI mGUI;
	Player p1 = new Player("");
	Player p2 = new Player("");
	
	public void start(){

		mGUI = new MancalaGUI("Mancala Client!");
		mGUI.welcome.addActionListener(new ToolbarListener());
		mGUI.startNewGame.addActionListener(new ToolbarListener());
		mGUI.restartGame.addActionListener(new ToolbarListener());
		mGUI.quit.addActionListener(new ToolbarListener());
		mGUI.instructions.addActionListener(new ToolbarListener());
		
		mGUI.quitb.addActionListener(new ToolbarListener());
		mGUI.newGame.addActionListener(new ToolbarListener());
		mGUI.restart.addActionListener(new ToolbarListener());
		mGUI.instruction.addActionListener(new ToolbarListener());
		mGUI.player1 = JOptionPane.showInputDialog(this, "Enter first player Name ");
		mGUI.player2 = JOptionPane.showInputDialog(this, "Enter second player Name ");
		
		p1.setName(mGUI.player1);
		p2.setName(mGUI.player2);
		mGUI.P1.setText(p1.getName());
		mGUI.P2.setText(p2.getName());
		mGUI.kahalas[0].setPlayer(p1);
		mGUI.kahalas[1].setPlayer(p2);

		mGUI.game.addToPlayer(p1);
		mGUI.game.addToPlayer(p2);

//		cups[4].setStones(0);
//		cups[10].setStones(0);
		
		int randomVal = (int) (Math.random() * 10.0) + 1;
        
		if (randomVal % 2 == 0) {
			mGUI.game.setIsActive(p1);
			mGUI.P1.setText(p1.getName()+"'s Turn");
			mGUI.P2.setText(p2.getName());
			for (int i = 0; i < 6; i++) {
				mGUI.cups[i].setEnabled(true);
			}
			for (int i = 6; i < 12; i++) {
				mGUI.cups[i].setEnabled(false);
			}
		} else {
			mGUI.game.setIsActive(p2);
			mGUI.P2.setText(p2.getName()+"'s Turn");
			mGUI.P1.setText(p1.getName());
			for (int i = 0; i < 6; i++) {
				mGUI.cups[i].setEnabled(false);
			}
			for (int i = 6; i < 12; i++) {
				mGUI.cups[i].setEnabled(true);
			}

		}
		System.out.println("Acive turn: " + mGUI.game.getIsActive().getName());
		for (int i = 0; i < 12; i++) {
			if (i < 6) {
				mGUI.cups[i].setPlayer(p1);
			} else {
				mGUI.cups[i].setPlayer(p2);
			}
//			System.out.println("cups[" + i + "]"
//					+ cups[i].getPlayer().getName());
		}
		mGUI.kahalas[0].setPlayer(p1);
		
		mGUI.kahalas[1].setPlayer(p2);
	
		for (int i = 0; i < 12; i++) {
			if (i < 12 - 1) {
				mGUI.cups[i].setRightCup(mGUI.cups[i + 1]);
			} else {
				mGUI.cups[i].setRightCup(mGUI.cups[0]);
			}
			if (i == 5) {
				mGUI.cups[i].setKahala(mGUI.kahalas[0]);
				mGUI.kahalas[0].setPlayer(p1);
			} else if (i == 11)
				mGUI.cups[i].setKahala(mGUI.kahalas[1]);
			mGUI.kahalas[1].setPlayer(p2);
		}
		for (int i = 0; i < 12; i++) {
			// cups[i].setText(""+i);
			// cups[i].setLeftCup(cups[i++]);
			// mainPanel.add(cups[i]);
			// cups[i].setVisible(true);
			mGUI.cups[i].addActionListener(this);
		}
	}

	
	public void actionPerformed(java.awt.event.ActionEvent evt) {
		
		int numOfStones;
		for (int i = 0; i < 12; i++) {

			if (evt.getSource() == mGUI.cups[i]) {
				if (mGUI.cups[i].getStones() == 0)
					break;

				numOfStones = mGUI.cups[i].getStones();
				mGUI.cups[i].setStones(0);
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

					Cup rightCup = mGUI.cups[index].getRightCup();

					if (mGUI.cups[index].getKahala() != null
							        && mGUI.game.getIsActive().equals(mGUI.cups[index].getPlayer())) {
						isKahala = true;
						kahala = mGUI.cups[index].getKahala();
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
								&& mGUI.game.getIsActive().equals(rightCup.getPlayer())
								&& mGUI.cups[(mGUI.cups.length - 1) - (index - 1) - 1-1].getStones() > 0) {

							int parallelCupStones = mGUI.cups[(mGUI.cups.length - 1) - (index - 1) - 1-1].getStones();
//							System.out.println("parallelCupStones:"
//									+ parallelCupStones);
							Kahala activePlayerKahala = mGUI.game.getIsActive().getKahala();
							int activePlayerKahalaStones = activePlayerKahala.getStones();
							activePlayerKahala.setStones(parallelCupStones + activePlayerKahalaStones + 1);

							if (index == 11)
								mGUI.cups[(mGUI.cups.length - 1) - index].setStones(0);
							else
								mGUI.cups[(mGUI.cups.length - 1) - index - 1].setStones(0); // Capture the opponent's cup stones
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
					if(winner ==  null)
						JOptionPane.showMessageDialog(null,"Match Drawn");
					else
					JOptionPane.showMessageDialog(null, winner.getName()
							+ " WON. Socer=" + winner.getKahala().getStones());
					System.exit(0);
				}// end if (isGameFinished())

				if (!addtionalTurn)
					if (mGUI.game.getIsActive().equals(p1)) {
						mGUI.game.setIsActive(p2);
						mGUI.P2.setText(p2.getName() + "- YOUR TURN");
						mGUI.P1.setText(p1.getName());
						for (int k = 0; k < 6; k++) {
							mGUI.cups[k].setEnabled(false);
						}
						for (int k = 6; k < 12; k++) {
							mGUI.cups[k].setEnabled(true);
						}
					} else {
						mGUI.game.setIsActive(p1);
						mGUI.P1.setText(p1.getName() + "- YOUR TURN");
						mGUI.P2.setText(p2.getName());
						for (int k = 6; k < 12; k++) {
							mGUI.cups[k].setEnabled(false);
						}
						for (int k = 0; k < 6; k++) {
							mGUI.cups[k].setEnabled(true);
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
	public boolean isGameFinished() {
		int player1Stones = 0, player2Stones = 0;

		for (int j = 0; j < 6; j++) {
			player1Stones += mGUI.cups[j].getStones();
		}
		for (int j = 6; j < 12; j++) {
			player2Stones += mGUI.cups[j].getStones();
		}

		if (player1Stones == 0 || player2Stones == 0) {
			System.out.println("Game over.....");
			return true;
		}
		return false;
	}

	public Player winner() {

		Player winner = null;
		int p1Kahala = mGUI.kahalas[0].getStones();
		int p2Kahala = mGUI.kahalas[1].getStones();

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
	
	public void showInstructions(){
		
		mGUI.showInstructions();
		
	}


	
}
