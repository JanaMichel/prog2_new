package Uebung9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Uebung9 extends JFrame implements ActionListener
{

	//Objektvariablen: 
    //1. Textfeld, zwei Buttons (add und remove)
	JTextField input;
	JButton add;
	JButton remove;
    //2. unteres Panel
	JPanel unten;	
    //4. Liste mit Labeln
	List <JLabel> l1;

    public Uebung9()
    {       
        super("Element hinzufügen");
        //Verhalten beim Schließen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Größe         
        this.setSize(500, 200);
        //Sichtbarkeit     
       
        //...

        //2. main-JPanel in JPanels unten und oben unterteilen
        
    	JPanel oben = new JPanel();
        //oben: Hintergrundfarbe ist YELLOW
    	oben.setBackground(Color.YELLOW);
    	this.getContentPane().add(oben, BorderLayout.NORTH); 
    	//getContentPane (Hauptfenster) ist das gleiche 
    	//wie JPanel mainPanel, mainPanel.add(oben, ..)
    	this.unten = new JPanel();
    	//unten: Hintergrundfarbe ist CYAN
    	unten.setBackground(Color.CYAN);
    	this.getContentPane().add(unten, BorderLayout.CENTER);
    	
    	//Dem Panel oben werden das Textfeld und die beiden Buttons hinzugefügt,
    	this.input = new JTextField(10);
    	this.add = new JButton("add");
    	this.remove = new JButton("remove");
    	oben.add(input);
    	oben.add(add);
    	oben.add(remove);
        //das lagern wir in die Methode createOben() aus
    	remove.addActionListener(ActionListener(this));
    	add.addActionListener(ActionListener(this));
        //Das Panel unten soll ebenfalls eine Objektvariable sein.

        //4. neue ArrayList für die Label anlegen 
    	this.l1 = new ArrayList<>();
    	
    	this.setVisible(true);
    }

    private ActionListener ActionListener(Uebung9 uebung9) {
		// TODO Auto-generated method stub
		return null;
	}

/*	private JPanel createOben()
    {
        //

        return panel;
    }*/


    @Override
    public void actionPerformed(ActionEvent e) 
    {
    	Object quelle = e.getSource();
        //Quelle des Events ermitteln
    	if(quelle instanceof JButton)
    	{
    		JButton button = (JButton)quelle; //konvertieren von Objekt zu JButton
			if(button.equals(this.add))  //Falls es der "add"-Button ist
			{
				String inputText = this.input.getText(); // - Text aus dem Textfeld übernehmen
		    	JLabel text = new JLabel(inputText);     // - neues Label mit dem Text anlegen
		    	text.setOpaque(true);//setOpaque(true) aufrufen. Nur dadurch werden für dieses JLabel alle Pixel 
		        //   gezeichnet, die in dessen Grenzen sind,
		    	text.setBackground(Color.RED);     // - das Label formatieren (Hintergrundfarbe RED)
		    	this.l1.add(text);    // - das Label in Label-Liste einfügen 
		    	this.unten.add(text);      // - das Label dem unten Panel hinzufügen
			}
			else if(button.equals(this.remove))  //Falls es der "remove"-Button ist
			{
				Iterator<JLabel> it = l1.iterator();
				
				while(it.hasNext())
		        { 
					JLabel aktuellLabel = it.next();
					String inputText = this.input.getText(); // - Text aus dem Textfeld übernehmen
					if(aktuellLabel.getText().equals(inputText))
		            {
						
						 // das Label muss sowohl aus der Liste als auch 
						it.remove();
						// 	aus dem Panel entfernt werden 
		            	this.unten.remove(aktuellLabel);
		            }
		        } 
			}
			
			 //Text im Textfeld löschen     
			this.input.setText("");
			this.input.requestFocus();
			this.input.revalidate(); 
			this.input.repaint();
    	}
       
       
    
        //   Tipp: wenn Sie einem JLabel eine Hintergrundfarbe mit setBackground(Color c) 
        //   setzen, dann sieht man diese nur, wenn Sie für dieses JLabel die Methode 
        //    d.h. das komplette Rechteck, 
        //   das das JLabel ausfüllt. Ansonsten würde nur der Text "gezeichnet" und 
        //   die Hintergrundfarbe wäre hinter dem Text versteckt.
     
   

       
        // - Text aus dem Textfeld übernehmen
       
        //   Tipp: Iterator nehmen
        //   
       

        
        //weitere nötige Schritte requestFocus(),

    }

    public static void main(String[] args) 
    {
        new Uebung9();
    }
	


}
