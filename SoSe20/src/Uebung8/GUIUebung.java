package Uebung8;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class GUIUebung extends JFrame
{
	
	    public GUIUebung()
	    {
	        super();
	        this.setTitle("GUI Übung");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(400, 300);
	        this.setLocation(200, 100);
	        this.setVisible(true);

	        JPanel content = this.initContent();
	        this.getContentPane().add(content);
	        // this.getContentPane().setBackground(Color.CYAN);
	        
	        //Titel     
	        //Verhalten beim Schließen      
	        //Größe         
	        //Sichtbarkeit      
	        //...
	        //gute Vorlage:
	        //https://freiheit.f4.htw-berlin.de/prog2/gui/#erweitern-des-fensters-um-ein-jpanel

	    }

	    private JPanel initContent()
	    {
	        //Ein paar Tipps:       
	        //mehrere Panels verwenden
	        //JTextField hat verschiedene Konstruktoren, nicht nur JTextField(int columns)
	        //Rahmen können mit BorderFactory erzeugt werden
	        //Beim FlowLayout ändert sich die Größe der Steuerelemente nicht,
	        //bei GridLayout passt sich die Größe an den Container an
	    	JPanel mainPanel = new JPanel();
	        mainPanel.setLayout(new BorderLayout());

	        Border redline = BorderFactory.createLineBorder(Color.RED);
	        JPanel oben = new JPanel();
	        oben.setLayout(new FlowLayout());
	        JLabel text1 = new JLabel("Text");
	        text1.setForeground(Color.WHITE); 
	        oben.add(text1);        
	        oben.setBackground(Color.BLUE);
	        oben.setBorder(redline);

	        JPanel links = new JPanel();
	        links.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
	        JLabel text2 = new JLabel("Weiterer Text");
	        links.add(text2);
	        // JTextField input = new JTextField("Feld",10);
	        //links.add(input);       
	        links.setBackground(Color.LIGHT_GRAY);


	        JPanel rechts = new JPanel();
	        rechts.setLayout(new GridLayout(2,1,20,20));
	        rechts.add(new JButton("Button 1"));
	        rechts.add(new JButton("Button 2"));
	        rechts.setBackground(Color.LIGHT_GRAY);

	        mainPanel.add(oben, BorderLayout.NORTH);
	        mainPanel.add(links, BorderLayout.CENTER);
	        mainPanel.add(rechts, BorderLayout.EAST);

	        return mainPanel;
	    

	    }

	    public static void main(String[] args) 
	    {
	        new GUIUebung();
	    }

	}
