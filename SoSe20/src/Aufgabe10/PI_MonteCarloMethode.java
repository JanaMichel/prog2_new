package Aufgabe10;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PI_MonteCarloMethode extends JFrame
{
	//Konstruktor
	
	public PI_MonteCarloMethode()
	{
		super();
		this.setTitle("Wir zeichnen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Canvas content = new Canvas(); //quasi JPanel = new JPanel, da Canvas auch ein Objekt von JPanel erzeugt
		this.getContentPane().add(content, BorderLayout.CENTER);
		this.setSize(500, 500);
		this.setLocation(200, 100);
		this.setVisible(true);
	}

	public class Canvas extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g); //Wenn wir zeichnen wollen IMMER implementieren
			Graphics2D g2 = (Graphics2D)g; //Wenn wir zeichnen wollen IMMER implementieren
			int abstand = this.getHeight()/20;
			int hoehe = this.getHeight()- 2 * abstand;
			int breite = this.getWidth()- 2 * abstand;
			g2.setStroke(new BasicStroke(4.0f)); //Linienstärke 5.0f 
			
			Random r = new Random(); //ein kleiner zusatz weil es schöner ist
			int rot = r.nextInt(256);
			int gruen = r.nextInt(256);
			int blau = r.nextInt(256);
			Color c = new Color(rot, gruen, blau);
			g2.setColor(c);
			
			int abstandlinks = (this.getWidth() - hoehe)/2;
			g2.drawRect(abstandlinks, abstand, hoehe, hoehe); //ausgefülltes grünes Rechteck
			g2.drawArc(abstandlinks, abstand, hoehe*2, hoehe*2, 180, -90);
			
			//kleine weitere kreise
			Graphics2D g3 = (Graphics2D)g; //Wenn wir zeichnen wollen IMMER implementieren
			Random b = new Random();
			int xRandom = b.nextInt(hoehe)+abstandlinks;
			int yRandom = b.nextInt(hoehe)+abstandlinks+abstand;
			g3.setColor(new Color(30, 30, 30));
			for(int i = 0; i<100; i++)
			{
				g3.drawOval(xRandom, yRandom, 2, 2);
			}
		}
	}


	public static void main(String[] args) 
	{
		new PI_MonteCarloMethode();
	}
}
