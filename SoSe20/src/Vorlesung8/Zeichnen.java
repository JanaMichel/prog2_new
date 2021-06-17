package Vorlesung8;

import java.awt.*;
import java.awt.geom.Arc2D;

import javax.swing.*;

public class Zeichnen extends JFrame
{
		
		//Konstruktor
		
		public Zeichnen()
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
				//g2.drawOval(40, 30, 200, 200); //x, y = linker obere Punkt, breite, höhe
				//g2.drawRect(40, 30, 200, 200);
				//g2.fillOval() füllt den kreis mit schwarzer farbe
				g2.setColor(new Color(20, 126, 33)); //0- 255
				g2.fillRect(190, 80, 110, 200); //ausgefülltes grünes Rechteck
				g2.fillArc(40, 30, 300, 300, 90, -180);
				//Shape arc = new Arc2D.Double(40, 30, 300, 300, 90, -180, Arc2D.PIE); //0 = "3 Uhr" also 90 grad, 
				//oder g2.drawArc()
				//g2.draw(arc);
			}
		}

		
		public static void main(String[] args) 
		{
			new Zeichnen();
		}
		
}