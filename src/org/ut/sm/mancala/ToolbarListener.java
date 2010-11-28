package org.ut.sm.mancala;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarListener implements ActionListener {

	@Override //actionPerformed for toolbar
	public void actionPerformed(ActionEvent event) {
		MancalaController c = new MancalaController();
		
		if(event.getActionCommand()== "Play New Game"){
			
			//c.start();
			
			
			
		}
		else if(event.getActionCommand()== "Restart game"){
			//c.restartGame();
			
			
		}else if(event.getActionCommand()== "Quit"){
			System.exit(0);
			
			
			
		}else if(event.getActionCommand()== "Instruction"){
			c.showInstructions();
			
		}
		else if(event.getActionCommand()== "show History"){
			//c.showHistory();
			
		}

	}

}
