package pl.bowlingcounter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 * A component that displays a messages and rectagles in backrownd.
 */
class GUIStaticMainFrame extends JComponent {
	public static final int MESSAGE_X_TXT0 = 10;
	public static final int MESSAGE_Y_TXT0 = 15;
	public static final int MESSAGE_X_TXT1 = 410;
	public static final int MESSAGE_Y_TXT1 = 25;

	private static final int DEFAULT_WIDTH = 900;
	private static final int DEFAULT_HEIGHT = 600;

	public void paintComponent(Graphics g) {

		Font font = new Font(Font.MONOSPACED, Font.BOLD, 12);
		g.setFont(font);

		g.drawString("This is pleace to play or simulate bowling.", MESSAGE_X_TXT0, MESSAGE_Y_TXT0);

		g.drawString("PLAYERS:", MESSAGE_X_TXT0 + 520, MESSAGE_Y_TXT0);

		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(new Line2D.Double(MESSAGE_X_TXT0, MESSAGE_Y_TXT0 + 2, MESSAGE_X_TXT0 + 300, MESSAGE_Y_TXT0 + 2));

		g.drawString("Throw!", MESSAGE_X_TXT0 + 140, MESSAGE_Y_TXT0 + 360);

		g.drawRect(MESSAGE_X_TXT0 + 135, MESSAGE_Y_TXT0 + 345, 50, 20);

		g.drawString("or enter score", MESSAGE_X_TXT0 + 112, MESSAGE_Y_TXT0 + 475);

		g2d.setColor(java.awt.Color.WHITE);
		g2d.fillRect(MESSAGE_X_TXT0, MESSAGE_Y_TXT0 + 12, MESSAGE_X_TXT0 + 306, MESSAGE_Y_TXT0 + 312);

		g2d.fillRect(MESSAGE_X_TXT0 + 520, MESSAGE_Y_TXT0 + 12, MESSAGE_X_TXT0 + 350, MESSAGE_Y_TXT0 + 250);

		g2d.setPaint(new Color(190, 0, 20));
		g2d.fillRect(MESSAGE_X_TXT0 + 120, MESSAGE_Y_TXT0 + 370, 80, 80);

		Font fontMenu = new Font(Font.MONOSPACED, Font.BOLD, 20);
		g.setFont(fontMenu);
		g.drawString("MENU", MESSAGE_X_TXT1, MESSAGE_Y_TXT1);

		Image ballImage = new ImageIcon("images/Bowling.jpg").getImage();

		g.drawImage(ballImage, 330, 400, 200, 200, null);

	}

	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
