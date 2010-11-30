package org.ut.sm.mancala;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MancalaDialog extends JFrame {
	private JPanel jContentPane = null;
	//private JTextField inputField = null;
	//private JLabel resultLabel = null;
	private JPanel jPanel = null;
	private JButton start = null;
	private JButton toCelsiusButton = null;

	/**
	 * This is the default constructor
	 */
	public MancalaDialog() {
		super();
		initialize();
		setVisible(true);
        setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	

	
	public JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setSize(400, 400);
			jPanel.setLayout(new BorderLayout());
			jPanel.setPreferredSize(new Dimension(20, 20));
			jPanel.add(getStartButton(), BorderLayout.CENTER);
			
		}
		return jPanel;
	}

	/**
	 * This method initializes toFahrenheitButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getStartButton() {
		if (start == null) {
			start = new JButton();
			start.setText("Start Game");
		}
		return start;
	}
	
	

}
