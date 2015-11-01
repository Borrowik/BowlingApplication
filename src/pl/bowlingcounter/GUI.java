package pl.bowlingcounter;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI {

	/**
	 * A frame that contains Main Game
	 */

	public void GUIforBowling() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new MainFrame();
				frame.setTitle("BowlingCounter");
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent we) {
						new Terminator();
					}
				});

				frame.setVisible(true);
			}
		});
	}
}

class MainFrame extends JFrame implements ActionListener {
	public MainFrame() {

		Image img = new ImageIcon("images/Ball.png").getImage();
		setIconImage(img);

		JButton addPlayerButton = new JButton("Add \n player");
		addPlayerButton.setBounds(350, 40, 160, 30);
		add(addPlayerButton);
		addPlayerButton.addActionListener(this);
		addPlayerButton.setActionCommand("AddPlayer");

		JButton StartButton = new JButton("Start game");
		StartButton.setBounds(350, 75, 160, 30);
		add(StartButton);
		StartButton.addActionListener(this);
		StartButton.setActionCommand("StartGame");

		JButton restetGameButton = new JButton("Reset game");
		restetGameButton.setBounds(350, 110, 160, 30);
		add(restetGameButton);
		restetGameButton.addActionListener(this);
		restetGameButton.setActionCommand("ResetGame");

		JButton exitButton = new JButton("Exit game");
		exitButton.setBounds(350, 145, 160, 30);
		add(exitButton);
		exitButton.addActionListener(this);
		exitButton.setActionCommand("ExitGame");

		JButton BallButton = new JButton("HIT");
		BallButton.setBounds(135, 390, 70, 70);
		add(BallButton);
		BallButton.addActionListener(this);
		BallButton.setActionCommand("RandomThrow");

		add(new GUIStaticMainFrame());

		pack();
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getActionCommand().equals("AddPlayer")) {

		}

		if (event.getActionCommand().equals("StartGame")) {

		}

		if (event.getActionCommand().equals("ResetGame")) {

		}

		if (event.getActionCommand().equals("RandomThrow")) {

			int trow = 0;

			String ObjButtons[] = { "OK" };
			int PromptResult = JOptionPane.showOptionDialog(null, "You hited " + trow + " pins", "Score",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[0]);
		}

		if (event.getActionCommand().equals("ExitGame")) {
			new Terminator();
		}

	}
}

class Terminator {
	public Terminator() {
		String ObjButtons[] = { "Yes", "No" };
		int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Exit confirmation",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
		if (PromptResult == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
