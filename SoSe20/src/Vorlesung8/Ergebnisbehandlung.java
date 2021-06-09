package Vorlesung8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ergebnisbehandlung extends JFrame implements ActionListener
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
		plus.addActionListener(this);
		minus.addActionListener(this);
		
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
	
	public static void main(String[] args) {
		new Ergebnisbehandlung();
	}

	//Methode die benutzt wird, um ein Ereignis auszuführen
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//Als allererstes eine Ausgabe machen um zu schauen ob es funktioniert
		Object quelle = e.getSource(); //hat ActionEvent ausgeloest
		if(quelle instanceof JButton)
		{
			JButton button = (JButton)quelle; //konvertieren von Objekt zu JButton
			if(button.getText().equals("-"))
			{
				this.anzahlKlicks--;
				System.out.println("Minus Button geklickt ..." + this.anzahlKlicks);
			}
			else if(button.getText().equals("+"))
			{
				this.anzahlKlicks++;
				System.out.println("Plus Button geklickt ..." + this.anzahlKlicks);
			}
			this.unten.setText(this.anzahlKlicks.toString());
		}
		
	}
	
}
