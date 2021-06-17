package Vorlesung8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ergebnisbehandlung extends JFrame
{
	/*
	 * GUIS
	 */
	Integer anzahlKlicks = 0;
	JLabel unten;
	//Konstruktor
	
	public Ergebnisbehandlung()
	{
		super();
		this.setTitle("Ereignisbehandlung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.setSize(200, 150);
		this.setVisible(true);
		this.setLocation(200, 150);
		
		
	}
	
	public JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		//Layout Norden ost west, süd
		mainPanel.setLayout(new BorderLayout());
				
		//neues JPanel
		JPanel oben = new JPanel();
		
		//Button erstellen
		JButton plus= new JButton("+");
		JButton minus = new JButton("-");
		
		oben.add(minus);
		oben.add(plus);
		
		//button anmelden
		plus.addActionListener(new ActionListener() //wir haben kein ActionListener in der Hauptklasse implementiert , 
													// können sie aber als anonyme Klasse ohne Namen implementieren mit 
													// { "enter" } + implement methoden
		{
			@Override
			public void actionPerformed(ActionEvent e) //diese actionPerformed methode ist NUR für den Plus button
			{
				// TODO Auto-generated method stub
				Ergebnisbehandlung.this.anzahlKlicks++; //Klicks werden erhöht von dem Button plus
				Ergebnisbehandlung.this.unten.setText(Ergebnisbehandlung.this.anzahlKlicks.toString()); 
				//wenn button plus button geklickt, dann wird
				//das Label "unten" mit der aktuellen Anzahl der Klicks gefüllt
				System.out.println("Plus button geklickt... " + Ergebnisbehandlung.this.anzahlKlicks);
			}
			
		});
		
		minus.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Ergebnisbehandlung.this.anzahlKlicks--;
				Ergebnisbehandlung.this.unten.setText(Ergebnisbehandlung.this.anzahlKlicks.toString());
				System.out.println("Minus button geklickt... " + Ergebnisbehandlung.this.anzahlKlicks);
			}
			
		});
		
		
		
		/*
		 * wenn wir auf ereignisse reagieren wollen
		 * müssen wir listener implementieren
		 * einzelne elemente müssen einzeln angemeldet werden
		 */
		
		//Label erstellen, also ein Text
		unten = new JLabel(this.anzahlKlicks.toString());
		
		//andere Schriftart und größe
		unten.setFont(new Font("Verdana", Font.BOLD, 24));
		
		//setzt es in die Mitte, in dem bereich den wir unten zugewiesen haben
		unten.setHorizontalAlignment(JLabel.CENTER);
		
		//Button hinzufügen, weist oben dem bereich Norden zu
		mainPanel.add(oben, BorderLayout.NORTH);
		//Label hinzufügen, weist unten dem bereich center zu
		mainPanel.add(unten, BorderLayout.CENTER);
		
		return mainPanel;
	}
	
	/*
	public class ActionHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Object quelle = e.getSource(); //hat ActionEvent ausgeloest
			if(quelle instanceof JButton)
			{
				JButton button = (JButton)quelle; //konvertieren von Objekt zu JButton
				if(button.getText().equals("-"))
				{
					Ergebnisbehandlung.this.anzahlKlicks--; 
					//da man mit this. auf eine variable der inneren Klasse
					//zugreift muss in der inneren Klasse der name der Hauptklasse vor dem this. geschrieben werden
					//um Java mitzuteilen das wir die variable der äußeren Klasse meinen
					System.out.println("Minus Button geklickt ..." + Ergebnisbehandlung.this.anzahlKlicks);
				}
				else if(button.getText().equals("+"))
				{
					Ergebnisbehandlung.this.anzahlKlicks++;
					System.out.println("Plus Button geklickt ..." + Ergebnisbehandlung.this.anzahlKlicks);
				}
				Ergebnisbehandlung.this.unten.setText(Ergebnisbehandlung.this.anzahlKlicks.toString());
			}
			
		}
		
	}*/

	
	public static void main(String[] args) {
		new Ergebnisbehandlung();
	}
	
}
