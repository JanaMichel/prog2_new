package Uebung10;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.*;

public class Zeichnen extends JFrame
{
	public Zeichnen()
    {
		super();
        this.setTitle("�bung 10");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Titel, Verhalten beim Schlie�en ...
        
        //neue Leinwand (Canvas) anlegen und dem Fenster hinzuf�gen     
        Canvas content = new Canvas();
        //Gr��e, Location, Sichtbarkeit
        this.getContentPane().add(content, BorderLayout.CENTER);
        this.setSize(500, 500);
        this.setLocation(200, 100);
        this.setVisible(true);

    }

    private class Canvas extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g)
        {
        	super.paintComponent(g); //Wenn wir zeichnen wollen IMMER implementieren
			Graphics2D g2 = (Graphics2D)g; //Wenn wir zeichnen wollen IMMER implementieren

            //Zuf�llige Werte f�r Rot, Gr�n und Blau erzeugen
            //Kleine Hilfe:
            //https://www.tutorialspoint.com/java/util/random_nextint_inc_exc.htm
            //public Color(int r, int g, int b)
			
			//L�nge der Seiten an H�he anpassen
            
			int abstand = this.getHeight()/20;
			int hoehe = this.getHeight()- 2 * abstand;
			int breite = this.getWidth()- 2 * abstand;
			
			
			//zuf�llige Farberzeugung
			Random r = new Random();
			int rot = r.nextInt(256);
			int gruen = r.nextInt(256);
			int blau = r.nextInt(256);
			Color c = new Color(rot, gruen, blau);
			g2.setColor(c);
			
            
            
			//falls die H�he des Fensters kleiner ist, als die Breite
            //Quadrat ausgef�llt
			if(hoehe<breite)
			{
				int abstandlinks = (this.getWidth() - hoehe)/2;
				g2.fillRect(abstandlinks, abstand, hoehe, hoehe); //L�nge der Seiten an H�he anpassen

			}
			else
			{
				//sonst 
	            //L�nge der Seiten an Breite anpassen
	            //Quadrat nicht ausgef�llt, 
				int abstandOben = (this.getHeight() - breite)/2; 
				//ermittle breite des fenster, ziehe den wert der breite ab teile Rest durch 2
				g2.setStroke(new BasicStroke(5.0f)); //Linienst�rke 5.0f 
				g2.drawRect(abstand, abstandOben, breite, breite);
				
			}
            
        }           

    }

    public static void main(String[] args) 
    {
        new Zeichnen();
    }
}
