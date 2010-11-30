/**
 * 
 */
package org.ut.sm.mancala;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * @author Naved
 *
 */
public class ToolbarMenuListener implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand() == "Instructions"){
		JOptionPane.showMessageDialog(null,"Instructions \n"+ "The object of this game is to collect as many stones to your Mancala as you can"+"\n"+
				"1. You can only move stones from your own side"+"\n"+
						"2. Each Time you move, You pick all the stones from the cup and distribute"+"\n"+" them in a counter clockwise direction to the next cup"+"\n+" +
								"3. If the last stone of a move landed in your mancala, then you will get an additional turn"+"\n" +
										"4. If the last stone of the move landed on an empty cup on your mancala side and there are"+"\n"+" some stones in opposite side, then stonse in both cups will be captured in your mancala. ");
		}
		
		if(e.getActionCommand()=="Quit"){
			System.exit(0);
		}
		if(e.getActionCommand() == "Show History"){
			
			JOptionPane.showMessageDialog(null, "No History Available....");
		}
		if(e.getActionCommand()=="Welcome"){
			
			JOptionPane.showMessageDialog(null, "Welcome to Mancala! the game of logic"+"" +
					"Version 1.0");
		}
	if(e.getActionCommand()=="Restart game"){
			//MancalaGUI gui = new MancalaGUI("");
			//gui.restart();
			//JOptionPane.showMessageDialog(null, "Restarting.....");
		}
	if(e.getActionCommand()=="Play New Game"){
		
		JOptionPane.showMessageDialog(null, "starting.....");
	}

	}

}
