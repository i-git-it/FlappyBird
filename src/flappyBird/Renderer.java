package flappyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// this comment is here just to see if i can pull it to eclipse

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		FlappyBird.flappyBird.repaint(g);
	}
	
}
