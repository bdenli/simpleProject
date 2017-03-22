package simplePackage;

import javax.swing.*;   
import java.awt.*;   

class BouncingPingPong extends JFrame   {   

	public BouncingPingPong() {
		setResizable(false);   
		setSize(400,400);   

		PinPongBall ball1 = new PinPongBall();   
		PinPongBall ball2 = new PinPongBall();   
		PinPongBall ball3 = new PinPongBall();   

		ball1.add(ball2);  
		ball2.add(ball3);
		getContentPane().add(ball1);     
		setVisible(true);   
		Thread x = new Thread(ball1);
		Thread y = new Thread(ball2);
		Thread z = new Thread(ball3);

		x.start();
		y.start();
		z.start();
	}
	public static void main(String[] args) {   

		new BouncingPingPong();   

	}   
}
