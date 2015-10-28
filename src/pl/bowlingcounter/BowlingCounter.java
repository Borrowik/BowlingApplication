package pl.bowlingcounter;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class BowlingCounter {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new MainFrame();
				frame.setTitle("BowlingCounter");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

/**
 * A frame that contains a message panel
 */
class MainFrame extends JFrame {
	public MainFrame() {
		add(new HeadTitle());
		pack();
	}
}

/**
 * A component that displays a message.
 */
class HeadTitle extends JComponent {
	public static final int MESSAGE_X = 10;
	public static final int MESSAGE_Y = 15;

	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 300;

	public void paintComponent(Graphics g) {
		g.drawString("This is pleace to play or simulate bowling.", MESSAGE_X, MESSAGE_Y);
	}

	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}