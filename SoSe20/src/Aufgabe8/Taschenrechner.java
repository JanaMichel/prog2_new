package Aufgabe8;

import javax.swing.*;

import Vorlesung8.Ergebnisbehandlung;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * erst muss eine Summe dem ergebnis (durch plus) hinzugefügt werden, sonst rechnet er mit null weiter
 */


public class Taschenrechner extends JFrame
{
	JTextField textfeld;
	JButton eins;
	JButton zwei;
	JButton drei;
	JButton vier;
	JButton fünf;
	JButton sechs;
	JButton sieben;
	JButton acht;
	JButton neun;
	JButton nulll;
	
	JButton plus;
	JButton minus;
	JButton mal;
	JButton geteilt;
	JButton auf;
	JButton zu;
	JButton gleich;
	JButton komma;
	int ergebnis;
	
	public Taschenrechner()
	{
		super();
        this.setTitle("Taschenrechner");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Steuerelemente : Buttons, Label, ...
        //Container: JPanel

        JPanel panel = this.initContent();
        this.getContentPane().add(panel); //Steuerelemente dem Container hinzufügen

        this.setSize(200, 200);
        this.setLocation(500, 500);     
        this.setVisible(true);


    }
	
    public JPanel initContent()
    {
      
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());

        //Bei grid + flowLayout spielt die Reihenfolge eine Rolle!
        JPanel oben = new JPanel();
        oben.setLayout(new BorderLayout());
        this.textfeld = new JTextField(10);
        JPanel unten = new JPanel();
        unten.setLayout(new GridLayout(6, 3));
        
        this.eins = new JButton("1");
        this.zwei = new JButton("2");
        this.drei = new JButton("3");
        this.vier = new JButton("4");
        this.fünf = new JButton("5");
        this.sechs = new JButton("6");
        this.sieben = new JButton("7");
        this.acht = new JButton("8");
        this.neun = new JButton("9");
        this.auf = new JButton("(");
        this.nulll = new JButton("0");
        this.zu = new JButton(")");
       
        this.plus = new JButton("+");
        this.minus = new JButton("-");
        this.mal = new JButton("*");
        this.geteilt = new JButton("/");
        this.gleich = new JButton("=");
        this.komma = new JButton(",");
        
        this.ergebnis = 1;
        
        
        oben.add(this.textfeld);
        unten.add(this.eins);
        unten.add(this.zwei);
        unten.add(this.drei);
        unten.add(this.vier);
        unten.add(this.fünf);
        unten.add(this.sechs);
        unten.add(this.sieben);
        unten.add(this.acht);
        unten.add(this.neun);        
        unten.add(this.auf);
        unten.add(this.nulll);
        unten.add(this.zu);
        unten.add(this.plus);
        unten.add(this.minus);
        unten.add(this.mal);
        unten.add(this.geteilt);
        unten.add(this.komma);
        unten.add(this.gleich);
        
        eins.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"1");
			}
        	
        });
        
        zwei.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"2");
			}
        	
        });
        drei.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"3");   
			}
        	
        });
        vier.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"4");		        
			}
        	
        });
        fünf.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"5");
			}
        	
        });
        sechs.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"6");		        
			}
        	
        });
        sieben.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"7");
			}
        	
        });
        acht.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"8"); 
			}
        	
        });
        neun.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"9");
			}
        	
        });
        nulll.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"0");		        
			}
        	
        });
        
        
        plus.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String s = Taschenrechner.this.textfeld.getText().toString();
				Taschenrechner.this.ergebnis += Integer.parseInt(s);
		        System.out.println(Taschenrechner.this.ergebnis);
		        Taschenrechner.this.textfeld.setText("");
			}
        	
        });
        
        minus.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String s = Taschenrechner.this.textfeld.getText().toString();
				Taschenrechner.this.ergebnis -= Integer.parseInt(s);
		        System.out.println(Taschenrechner.this.ergebnis);
		        Taschenrechner.this.textfeld.setText("");
			}
        	
        });
        
        mal.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String s = Taschenrechner.this.textfeld.getText().toString();
				Taschenrechner.this.ergebnis *= Integer.parseInt(s);
		        System.out.println(Taschenrechner.this.ergebnis);
		        Taschenrechner.this.textfeld.setText("");
			}
        	
        });
        
        geteilt.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"/");
		        
			}
        	
        });
        
        auf.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"(");
		        
			}
        	
        });
        
        zu.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+")");
		        
			}
        	
        });
        
        komma.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+",");
				
			}
        	
        });
        
        gleich.addActionListener(new ActionListener() 
        {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				 
				Taschenrechner.this.textfeld.setText(Taschenrechner.this.textfeld.getText()+"= " + Taschenrechner.this.ergebnis);
		        
			}
        	
        });
              
       
		main.add(oben, BorderLayout.NORTH);
        main.add(unten, BorderLayout.CENTER);
        return main;
    	
	     
	}
	
	public static void main(String[] args) 
    {
        new Taschenrechner();
    }
}
