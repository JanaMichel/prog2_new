package Uebung9;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Uebung9 extends JFrame implements ActionListener
{
	//Objektvariablen hier erstellen, damit die für alle Methoden verfügbar sind, also in der initContent(), auch ActionEvent()
    JTextField textfeld;
    JButton b1;
    JButton b2;
    List<JLabel> labels = new ArrayList<>(); //Collection, Liste voll mit labels
    JPanel unten;

    public Uebung9()
    {       
    	super();
        this.setTitle("Elemente hinzufügen");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Steuerelemente : Buttons, Label, ...
        //Container: JPanel

        JPanel panel = this.initContent();
        this.getContentPane().add(panel); //Steuerelemente dem Container hinzufügen

        this.setSize(400, 100);
        this.setLocation(200, 300);     
        this.setVisible(true);


    }
    public JPanel initContent()
    {
        JPanel main = new JPanel();
        main.setLayout(new GridLayout(2,1));


        //Bei grid + flowLayout spielt die Reihenfolge eine Rolle!
        JPanel oben = new JPanel();
        this.textfeld = new JTextField(10);
        this.b1 = new JButton("add");
        this.b1.setActionCommand("add"); //doppelmoppel, aber falls Text kryptisch, dann wird setAytionCommans benutzt!!
        this.b2 = new JButton("remove");
        oben.setBackground(Color.YELLOW);
        oben.add(this.textfeld);
        oben.add(this.b1);
        oben.add(this.b2);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        main.add(oben);


        this.unten = new JPanel();
        unten.setBackground(Color.CYAN);

        main.add(unten);
        return main;
    }

    @Override
    public void actionPerformed(ActionEvent e) //HINZUFÜGEN ZUM PANEL!!!!
    {
        //System.out.println("Test.."); IMMER TESTEN ZUERST!!!!
        Object quelle = e.getSource();
        if(quelle instanceof JButton) //Ist es ein JBUTTON?
        {
            JButton button = (JButton)quelle; //überprüfen, ob JButton und was für ein Button geklickt wird
            if(button.getActionCommand().equals("add"))
            {   
                JLabel neu = new JLabel(this.textfeld.getText());
                neu.setOpaque(true);
                neu.setBackground(Color.RED);
                neu.setForeground(Color.WHITE);
                this.labels.add(neu); //Liste hinzugefügt
                //Textfeld auslesen, dannJLabel erzeugen -> Liste hinzufügen
                //Textfeld mit "Hallo" befüülen, dann add-Button -> Ausgabe erscheint

                this.unten.add(neu);//JPanel hinzugefügt

            System.out.println(this.textfeld.getText()); //Text aus Textfeld erscheint auf konsole

                System.out.println("Add - Button geklickt..."); //Ist es ein add-Button?
            }
            else if(button.getActionCommand().equals("remove"))
            {
                String inputText = this.textfeld.getText(); //Text aus Textfeld wird zwischen gespeichert


                  Iterator<JLabel> it = this.labels.iterator(); //laufen durch Liste
                  while(it.hasNext()) //Element in der Liste?
                      { JLabel aktLabel = it.next(); //wir holen das ELement aus der Liste, wir betrachten es

                  if(aktLabel.getText().equals(inputText)) //Was für einen text in diesem label? + vergleichen den Text mit dem Text im Textfeld

                     {
                      it.remove(); //wenn gleich/schon vorhanden, dann löschen
                      this.unten.remove(aktLabel);//wird auch ausJPanel gelöscht
                     }
             }

                System.out.println("Remove - Button geklickt..");//ist es ein remove Button?
            }
            this.unten.revalidate(); //zeichnet Fenster nochmal neu
            this.unten.repaint();
        }
    }

    public static void main(String[] args) 
    {
        new Uebung9();
    }
	


}
