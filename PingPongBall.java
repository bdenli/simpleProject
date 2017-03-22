package simplePackage;

import java.awt.*;   
import javax.swing.*;  

class PinPongBall extends JPanel implements Runnable   
{   
	private boolean xUp, yUp, bouncing;
	private int x, y, xDx, yDy;
	private final int MAX_X = 400, MAX_Y = 400;

	public PinPongBall()   
	{ 
		xUp = false;
		yUp = false;
		xDx = 1;
		yDy = 1;
		bouncing = true;
		setOpaque(false);   
		setPreferredSize(new Dimension( MAX_X, MAX_Y));   
	}   
	public void run()   
	{   
		while ( true ) {
			try {
				Thread.sleep( 20 );
			}
			catch ( InterruptedException exception ) {
				System.err.println( exception.toString() );
			}

			if ( xUp == true )
				x += xDx;
			else
				x -= xDx;

			if ( yUp == true )
				y += yDy;
			else
				y -= yDy;

			if ( y <= 0 ) {
				yUp = true;
				yDy = ( int ) ( Math.random() * 5 + 2 );
			}
			else if ( y >= MAX_Y - 30 ) {
				yDy = ( int ) ( Math.random() * 5 + 2 );
				yUp = false;
			}

			if ( x <= 0 ) {
				xUp = true;
				xDx = ( int ) ( Math.random() * 5 + 2 );
			}
			else if ( x >= MAX_X - 30 ) {
				xUp = false;
				xDx = ( int ) ( Math.random() * 5 + 2 );
			}
			
			repaint();
		}
	}

	public void paintComponent(Graphics g)   
	{   

		super.paintComponent(g);   
		if ( bouncing ) {
			g.setColor( Color.blue );
			g.fillOval( x, y, 30, 30 );
		}

	}   
}
