package flappyBird;

import java.awt.Graphics;

import javax.swing.JFrame;

public class FlappyBird {

	public static FlappyBird flappyBird;
	 public final int WIDTH = 800, HEIGHT = 800;
	
	
	public FlappyBird(){
		
		JFrame jframe = new JFrame(); 
		
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH,HEIGHT);
		jframe.setVisible(true);
	}//end Constructor
	
	public void repaint(Graphics g) {
		
	}
	
	public static void main(String[]args){
		
		flappyBird =new FlappyBird();
		
	}



}

