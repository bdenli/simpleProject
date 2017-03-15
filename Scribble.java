package simplePackage;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is a simple sketching canvas where you can only scribble black lines.  
 */
public class Scribble extends JPanel {

	private Point lastPoint;
    
    public Scribble() {
        // set the current point to the location at which the mouse was pressed
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastPoint = new Point(e.getX(), e.getY());
            }
        });

        // draw a line from the old point to the new point and update the value of lastPoint
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.drawLine(lastPoint.x, lastPoint.y, e.getX(), e.getY());
                lastPoint = new Point(e.getX(), e.getY());
                g.dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Scribble Program");
        frame.getContentPane().add(new Scribble(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
