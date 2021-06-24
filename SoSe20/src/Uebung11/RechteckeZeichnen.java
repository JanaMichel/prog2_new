package Uebung11;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.*;

public class RechteckeZeichnen extends JFrame implements MouseListener, MouseMotionListener
{
	Canvas canvas;
	Rechteck aktRechteck;
	Color aktFarbe;
	
	//sammlung (map) mit rechtecken
	
	Map<Rechteck, Color> rechtecke;
	
	public RechteckeZeichnen()
    {
		super();
        this.setTitle("Rechtecke zeichnen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Sammlung (Collection)
        this.rechtecke = new HashMap();
        
		//Titel, Verhalten beim Schließen ...
        
        //neue Leinwand (Canvas) anlegen und dem Fenster hinzufügen     
        this.canvas = new Canvas();
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        
        //Größe, Location, Sichtbarkeit
        this.getContentPane().add(this.canvas, BorderLayout.CENTER);
        this.setSize(400, 300);
        this.setLocation(300, 200);
        this.setVisible(true);

    }

	private class Canvas extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);        
			Graphics2D g2 = (Graphics2D)g;  

			//aktuelles Rechteck zeichnen (falls es aktuell eins gibt)            
			if(RechteckeZeichnen.this.aktRechteck != null)
			{
				g2.setColor(aktFarbe);
				int x = RechteckeZeichnen.this.aktRechteck.getX();
				int y = RechteckeZeichnen.this.aktRechteck.getY();
				int width = RechteckeZeichnen.this.aktRechteck.getWidth();
				int height = RechteckeZeichnen.this.aktRechteck.getHeight();

				g2.fillRect(x, y, width, height);
			}

			//gespeicherte Rechtecke aus der Collection zeichnen
			for(Map.Entry<Rechteck, Color> entry : rechtecke.entrySet()) 
			{
				Rechteck r = entry.getKey();
			    Color c = entry.getValue();
			    g2.setColor(c);
			    
			    int x = r.getX();
			    int y = r.getY();
			    int width = r.getWidth();
			    int height = r.getHeight();
			    
			    g2.fillRect(x, y, width, height);
			}
		}

    }
	
	@Override
	public void mousePressed(MouseEvent e)
	{
	//neues Rechteck erzeugen	
			Point p = e.getPoint();
			this.aktRechteck = new Rechteck(p.x, p.y, 0, 0);
			
			//zufällige Farbe erzeugen - hatten wir letzte Woche
			Random r = new Random();
			int red = r.nextInt(256);
			int green = r.nextInt(256);
			int blue = r.nextInt(256);
			
			this.aktFarbe = new Color(red, green, blue);	
	}
	
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		//Höhe und Breite des aktuellen Rechtecks setzen
		//je nachdem ob die Maus gerade nach rechts, links, oben oder unten gezogen wird	
		Point p = e.getPoint();
		if (p.x > this.aktRechteck.getX()) 
		{ 
			//Maus rechts
			//int width = p.x - this.aktRechteck.getX();
			this.aktRechteck.setWidth(p.x - this.aktRechteck.getX());
		}
		else 
		{ 
			//Maus nach links
			int width = (this.aktRechteck.getX()- p.x) + aktRechteck.getWidth();
			this.aktRechteck.setWidth(width);
			this.aktRechteck.setX(p.x);
		}

		if (p.y > this.aktRechteck.getY()) 
		{ 
			//Maus unten			
			this.aktRechteck.setHeight(p.y - this.aktRechteck.getY());
		}
		else 
		{ 
			//Maus nach unten
			this.aktRechteck.setHeight(this.aktRechteck.getY()- p.y);
			this.aktRechteck.setY(p.y);
		}

		//Leinwand neu zeichnen
		this.canvas.repaint();

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		this.rechtecke.put(aktRechteck, aktFarbe);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	 public static void main(String[] args) 
	    {
	        new RechteckeZeichnen();
	    }
}
