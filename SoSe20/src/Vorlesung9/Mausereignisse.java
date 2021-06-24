package Vorlesung9;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mausereignisse extends JFrame implements MouseListener
{
	public Mausereignisse()
	{
		super();
		this.setTitle("Wir zeichnen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new Canvas());
		this.setSize(500, 500);
		this.setLocation(1000, 100);
		this.setVisible(true);
	}
	
	public class Canvas extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g); //Wenn wir zeichnen wollen IMMER implementieren
			Graphics2D g2 = (Graphics2D)g; //Wenn wir zeichnen wollen IMMER implementieren
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
