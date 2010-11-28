package org.ut.sm.mancala;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class MainFrame implements ActionListener{
	
		public JMenuBar createJMenuBar() {
			JMenuBar mainMenuBar;
			JMenu file, help;
			JMenuItem startNewGame, restartGame, quit, welcome, instructions ;
			mainMenuBar = new JMenuBar();
			file = new JMenu("File");
			file.setMnemonic(KeyEvent.VK_M);
			mainMenuBar.add(file);
			help = new JMenu("Help");
			mainMenuBar.add(help);
			// Creating the MenuItems
			startNewGame = new JMenuItem("Start New Game",KeyEvent.VK_T);
			startNewGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
			startNewGame.addActionListener(this);
			file.add(startNewGame);
			
			restartGame = new JMenuItem("Restart Game");
			restartGame.setMnemonic(KeyEvent.VK_B);
			restartGame.addActionListener(this);
			file.add(restartGame);
			// Menu Item with just an Image
			quit = new JMenuItem("Quit");
			quit.setMnemonic(KeyEvent.VK_D);
			quit.addActionListener(this);
			file.add(quit);
			
			welcome = new JMenuItem("Welcome");
			welcome.setMnemonic(KeyEvent.VK_D);
			welcome.addActionListener(this);
			help.add(welcome);
			
			instructions = new JMenuItem("Instructions");
			welcome.setMnemonic(KeyEvent.VK_D);
			welcome.addActionListener(this);
			help.add(instructions);
			
			return mainMenuBar;
		}
		
		public Container createContentPane() {
			// Create the content-pane-to-be.
			JPanel jplContentPane = new JPanel(new BorderLayout());
			jplContentPane.setLayout(new BorderLayout());// Can do it either way
			// to set layout
			jplContentPane.setOpaque(true);
			// Create a scrolled text area.
			// Add the text area to the content pane.
			return jplContentPane;
		}
		/** Returns an ImageIcon, or null if the path was invalid. */
		protected static void getImage() {
		}
		private static void createGUI() {
			JFrame.setDefaultLookAndFeelDecorated(true);
			
			// Create and set up the window.
			JFrame frame = new JFrame("Mancala Game");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MainFrame app = new MainFrame();
			frame.setJMenuBar(app.createJMenuBar());
			frame.setContentPane(app.createContentPane());
			frame.setBackground(Color.WHITE);
			frame.setSize(800, 600);
			frame.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			JMenuItem source = (JMenuItem) (e.getSource());
			if(source.getActionCommand() == "Start New Game"){
				MancalaController controller = new MancalaController();
				controller.start();
			}else if(source.getActionCommand()=="Restart Game"){
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to restart the game?") == 0)
					new MancalaController().start();
				}else if(source.getActionCommand() == "Quit"){
					if(JOptionPane.showConfirmDialog(null, "Are you sure you want to quit the game?") == 0)
						System.exit(0);
				
			}
			
			
		}
		public void itemStateChanged(ItemEvent e) {
			JMenuItem source = (JMenuItem) (e.getSource());
			JOptionPane.showMessageDialog(null, ""+source.getAction());
		}
		// Returns the class name, no package info
		protected String getClassName(Object o) {
			String classString = o.getClass().getName();
			int dotIndex = classString.lastIndexOf(".");
			return classString.substring(dotIndex + 1); // Returns only Class name
		}
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {

				public void run() {
					createGUI();
				}
			});
		}
	}
	
	
	
	/********************/
	
	


