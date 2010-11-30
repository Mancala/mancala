package org.ut.sm.mancala;

import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JOptionPane;

import org.ut.sm.mancala.client.Cup;
import org.ut.sm.mancala.client.CurrentGameRecord;
import org.ut.sm.mancala.client.Game;
import org.ut.sm.mancala.client.Kahala;
import org.ut.sm.mancala.client.Player;

public class MancalaController implements ActionListener {
	
	MancalaGUI mGUI;
	Game game = new Game();
	Player p1;
	Player p2;
	int player1Stones = 0, player2Stones = 0;
	
	void start() {
		
		mGUI = new MancalaGUI("Mancala Game!");
		p1 = new Player("");
		p2 = new Player("");
		// mGUI.restartGame.addActionListener(new ToolbarMenuListener());

		CurrentGameRecord gameRecord = new CurrentGameRecord();
		game.setGameRecord(gameRecord);
		mGUI.mainPanel.setVisible(true);
		mGUI.getPlayers();
		
		p1.setName(mGUI.player1);
		p2.setName(mGUI.player2);

		game.getGameRecord().setPlayer1(mGUI.player1);
		game.getGameRecord().setPlayer2(mGUI.player2);
		// to save the players in game record

		mGUI.P1.setText(p1.getName());
		mGUI.P2.setText(p2.getName());
		mGUI.kahalas[0].setPlayer(p1);
		mGUI.kahalas[1].setPlayer(p2);

		game.addToPlayer(p1);
		game.addToPlayer(p2);

		// cups[3].setStones(0);
		// cups[4].setStones(0);
		// cups[8].setStones(0);
		// cups[10].setStones(0);

		int randomVal = (int) (Math.random() * 10.0) + 1;

		if (randomVal % 2 == 0) {
			game.setIsActive(p1);
			mGUI.P1.setText(p1.getName() + " - YOUR TURN");
			mGUI.P2.setText(p2.getName());
			for (int i = 0; i < 6; i++) {
				mGUI.cups[i].setEnabled(true);
			}
			for (int i = 6; i < 12; i++) {
				mGUI.cups[i].setEnabled(false);
			}
		} else {
			game.setIsActive(p2);
			mGUI.P2.setText(p2.getName() + " - YOUR TURN");
			mGUI.P1.setText(p1.getName());
			for (int i = 0; i < 6; i++) {
				mGUI.cups[i].setEnabled(false);
			}
			for (int i = 6; i < 12; i++) {
				mGUI.cups[i].setEnabled(true);
			}
		}
		//System.out.println("Acive turn: " + mGUI.game.getIsActive().getName());
		for (int i = 0; i < 12; i++) {
			if (i < 6) {
				mGUI.cups[i].setPlayer(p1);
			} else {
				mGUI.cups[i].setPlayer(p2);
			}
			// System.out.println("cups[" + i + "]"
			// + cups[i].getPlayer().getName());
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
			mGUI.cups[i].addActionListener(this);
		}
		
		mGUI.newGame.addActionListener(this);
		mGUI.restart.addActionListener(this);
		mGUI.filequit.addActionListener(this);
		mGUI.instruction.addActionListener(this);
		mGUI.fileinstructions.addActionListener(this);
		mGUI.filewelcome.addActionListener(this);
		mGUI.quitb.addActionListener(this);
		mGUI.showHistory.addActionListener(this);
		mGUI.filestartNewGame.addActionListener(this);
		mGUI.filequit.addActionListener(this);
		mGUI.filerestartGame.addActionListener(this);

		
	}

	public void actionPerformed(java.awt.event.ActionEvent evt) {

		int numOfStones;

		if (evt.getSource() == mGUI.showHistory) {
			String records = null;
			records =" Game History \n\n"+ " Game : Player 1( points ) | Player 2( points ) | Winner --> Date/time, \n ";

			for (int rec = 0; rec < game.getGameHistory().size(); rec++) {
				CurrentGameRecord obj = (CurrentGameRecord) game
						.getGameHistory().get(rec);
				records = records + (rec+1) + ":" + obj.getPlayer1() +"("+ obj.getP1_score() + ") | "
						+ obj.getPlayer2()  +"("+ obj.getP2_score() + ") | " + obj.getWinner()+ " - "+ obj.getTime() +",\n ";
			}
			JOptionPane.showMessageDialog(null, records);

		} else 	if (evt.getSource() == mGUI.newGame || evt.getSource() == mGUI.filestartNewGame) {
			mGUI.setVisible(false);
			start();
			
		} else 	if (evt.getSource() == mGUI.restart || evt.getSource() == mGUI. filerestartGame ) {
			mGUI.setVisible(false);
			start();
			
		}else if(evt.getSource() == mGUI.instruction || evt.getSource() == mGUI.fileinstructions){
			JOptionPane.showMessageDialog(null,"Instructions \n\n"+ "The object of this game is to collect as many stones to your Mancala as you can"+"\n\n"+
					"1. You can only move stones from your own side"+"\n\n"+
							"2. Each Time you move, You pick all the stones from the cup and distribute"+"\n"+" them in a counter clockwise direction to the next cup"+"\n\n" +
									"3. If the last stone of a move landed in your mancala, then you will get an additional turn"+"\n\n" +
											"4. If the last stone of the move landed on an empty cup on your mancala sideand there are"+"\n"+" some stones in opposite side, then stonse in both cups will be captured in your mancala. ");

			
			
		}else if(evt.getSource() == mGUI.filewelcome){
				
			JOptionPane.showMessageDialog(null, "Welcome to Mancala! the game of logic"+"\n" +
			"Version 1.0");
		}else if(evt.getSource() == mGUI.quitb || evt.getSource() == mGUI.filequit ){
				
			System.exit(0);
		}
		//loop will capture the cup(button event)
		for (int i = 0; i < 12; i++) {
			//based on captured event, the logic will work accordingly......
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
					}// end else of if (i + j > 11)

					Cup rightCup = mGUI.cups[index].getRightCup();

					if (mGUI.cups[index].getKahala() != null
							&& game.getIsActive().equals(
									mGUI.cups[index].getPlayer())
							&& game.getIsActive().equals(
									mGUI.cups[index].getKahala().getPlayer())) {
						isKahala = true;
						kahala = mGUI.cups[index].getKahala();
					}// end if (cups[index].getKahala() != null .......

					if (isKahala) {
//						System.out.println("i=" + i + ", j=" + j + ", tempJ="
//								+ tempJ + ", index=" + index + "=K");
						kahala.setStones(kahala.getStones() + 1);
						j = j + 1; // restrict player to number of stones only
						if (j == numOfStones) {
							addtionalTurn = true;
						}// end if (j == numOfStones)
					}// end if (isKahala)

					if (j < numOfStones) {
						int st = rightCup.getStones();
						//System.out.println("stones in parallel cup: " + st);

						if (j == (numOfStones - 1)
								&& st == 0
								&& game.getIsActive().equals(
										rightCup.getPlayer())
								&& mGUI.cups[(mGUI.cups.length - 1)
										- (index - 1) - 1 - 1].getStones() > 0) {

							int parallelCupStones = mGUI.cups[(mGUI.cups.length - 1)
									- (index - 1) - 1 - 1].getStones();
							// System.out.println("parallelCupStones:"
							// + parallelCupStones);
							Kahala activePlayerKahala = game.getIsActive()
									.getKahala();
							int activePlayerKahalaStones = activePlayerKahala
									.getStones();
							activePlayerKahala.setStones(parallelCupStones
									+ activePlayerKahalaStones + 1);

							if (index == 11)
								mGUI.cups[(mGUI.cups.length - 1) - index]
										.setStones(0);
							else
								mGUI.cups[(mGUI.cups.length - 1) - index - 1]
										.setStones(0); // Capture the opponent's
														// cup stones
							captureStones = true;
						}// end if (j == (numOfStones - 1) && st == 0 ........
						if (captureStones) {
							rightCup.setStones(0);
							captureStones = false;
						} else {
							rightCup.setStones(st + 1);
						} // end else if (captureStones)
//						System.out.println("i=" + i + ", j=" + j + ", tempJ="
//								+ tempJ + ", index=" + index + ", numOfStones:"
//								+ numOfStones);
					}// end if (j < numOfStones) {
					tempJ++;

				}// end loop for (int j = 0; j < numOfStones; j++)

				if (isGameFinished()) {
					Player winner = winner();
					if(winner != null){
					JOptionPane.showMessageDialog(null, winner.getName()
							+ " wins!- \n " +p1.getName()+ "'s score = " + player1Stones
							+ "\n" +p2.getName()+ "'s score = " + player2Stones);
					}else{
						JOptionPane.showMessageDialog(null, " Match Drawn!- \n " +p1.getName()+ "'s score = " + player1Stones
								+ "\n" +p2.getName()+ "'s score = " + player2Stones);
							
						
					}
					// System.exit(0);
				}// end if (isGameFinished())

				if (!addtionalTurn)
					if (game.getIsActive().equals(p1)) {
						game.setIsActive(p2);
						mGUI.P2.setText(p2.getName() + "- YOUR TURN");
						mGUI.P1.setText(p1.getName());
						for (int k = 0; k < 6; k++) {
							mGUI.cups[k].setEnabled(false);
						}
						for (int k = 6; k < 12; k++) {
							mGUI.cups[k].setEnabled(true);
						}
					} else {
						game.setIsActive(p1);
						mGUI.P1.setText(p1.getName() + "- YOUR TURN");
						mGUI.P2.setText(p2.getName());
						for (int k = 6; k < 12; k++) {
							mGUI.cups[k].setEnabled(false);
						}
						for (int k = 0; k < 6; k++) {
							mGUI.cups[k].setEnabled(true);
						}
					}// end of else for condition if
						// (game.getIsActive().equals(p1))
				addtionalTurn = false;

				// System.out.println("Whose Turn is : "
				// + game.getIsActive().getName());
				break;
			}
			//System.out.println("-");
		}

	}

	public boolean isGameFinished() {

		player1Stones = 0;
		player2Stones = 0;

		for (int j = 0; j < 6; j++) {
			player1Stones += mGUI.cups[j].getStones();
		}
		for (int j = 6; j < 12; j++) {
			player2Stones += mGUI.cups[j].getStones();
		}

		if (player1Stones == 0 || player2Stones == 0) {
			System.out.println("Game over.....");
			mGUI.mainPanel.setVisible(false);
			//mGUI = null;
			return true;
		}
		return false;
	}

	public Player winner() {

		Player winner = null;
		// History history = new History();
		// ArrayList score = new ArrayList();
		int p1Kahala = mGUI.kahalas[0].getStones();
		int p2Kahala = mGUI.kahalas[1].getStones();

		player1Stones = player1Stones + p1Kahala;
		player2Stones = player2Stones + p2Kahala;

		if (player1Stones > player2Stones) {
			winner = p1;
		} else if ((player1Stones < player2Stones)) {
			winner = p2;
		} else if (player1Stones == player2Stones) {
			winner = null;
		}

		game.getGameRecord().setP1_score(player1Stones);
		game.getGameRecord().setP2_score(player2Stones);
		game.getGameRecord().setTime(Calendar.getInstance().getTime().toString());
		game.getGameRecord().setWinner(winner.getName());

		boolean add = game.getGameHistory().add(game.getGameRecord());

		if (add)
			System.out.println("Game record is added");

		game.setGameRecord(null);

		System.out.println(winner.getName() + " Won!- \n P1ayer 1 Score = "
				+ player1Stones + ", P2 Score = " + player2Stones);
		return winner;
	}
}
