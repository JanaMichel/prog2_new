package Übung12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KlicksZaehlen extends JFrame
{
	JPanel content;
	MyPanel[][] panels;
	int meistenClicks;

	KlicksZaehlen(int hoehe, int breite)
	{
		super("Klicks zaehlen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.content = this.initCenter(hoehe, breite);
		this.getContentPane().add(this.content, BorderLayout.CENTER);

		this.getContentPane().add(this.initSouth(), BorderLayout.SOUTH);

		this.setSize(400, 400);
		this.setVisible(true);
		this.meistenClicks=0;
	}
	
	JPanel initCenter(int hoehe, int breite)
	{
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(hoehe, breite, 2, 2));
		center.setBackground(Color.DARK_GRAY);
		this.panels = new MyPanel[hoehe][breite];
		for(int zeile=0; zeile<this.panels.length; zeile++)
		{
			for(int spalte=0; spalte<this.panels[zeile].length; spalte++)
			{
				this.panels[zeile][spalte] = new MyPanel(zeile, spalte);
				center.add(this.panels[zeile][spalte]);
			}
		}
		return center;
	}
	private JPanel initSouth() 
	{
		JPanel south = new JPanel();
		JButton resetBtn = new JButton("reset");
		//https://freiheit.f4.htw-berlin.de/prog2/ereignisse/#ereignisbehandlung-mit-anonymer-klasse
		resetBtn.addActionListener(new ActionListener() { 

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				for(int zeile=0; zeile<KlicksZaehlen.this.panels.length; zeile++)
				{
					for(int spalte=0; spalte<KlicksZaehlen.this.panels[zeile].length; spalte++)
					{
						KlicksZaehlen.this.panels[zeile][spalte].nrClicks = 0;
						KlicksZaehlen.this.panels[zeile][spalte].label.setText("0"); 
						KlicksZaehlen.this.panels[zeile][spalte].setBackground(Color.LIGHT_GRAY);
					}
				}
				KlicksZaehlen.this.meistenClicks=0;				
			}

		});
		south.add(resetBtn);
		return south;
	}



	class MyPanel extends JPanel implements MouseListener
	{
		int zeile;
		int spalte;
		int nrClicks;
		JLabel label;

		MyPanel(int zeile, int spalte)
		{
			this.zeile = zeile;
			this.spalte = spalte;
			this.nrClicks = 0;
			this.label = new JLabel(String.valueOf(nrClicks));
			this.setLayout(new GridLayout());
			this.label.setFont(new Font("Verdana", Font.BOLD, 48));
			this.label.setHorizontalAlignment(JLabel.CENTER);
			this.label.setForeground(Color.WHITE);
			this.add(label);
			this.setBackground(Color.LIGHT_GRAY);
			this.addMouseListener(this);
		}
		@Override
		public void mouseClicked(MouseEvent e)
		{
			MyPanel mp = (MyPanel)e.getSource();
			mp.nrClicks++;
			mp.label.setText(String.valueOf(nrClicks));
			if(mp.nrClicks>KlicksZaehlen.this.meistenClicks) KlicksZaehlen.this.meistenClicks=mp.nrClicks;
			for(int zeile=0; zeile<KlicksZaehlen.this.panels.length; zeile++)
			{
				for(int spalte=0; spalte<KlicksZaehlen.this.panels[zeile].length; spalte++)
				{
					if(KlicksZaehlen.this.panels[zeile][spalte].nrClicks == KlicksZaehlen.this.meistenClicks)
					{
						KlicksZaehlen.this.panels[zeile][spalte].setBackground(Color.RED);
					}
					else
					{
						KlicksZaehlen.this.panels[zeile][spalte].setBackground(Color.LIGHT_GRAY);
					}					

				}
			}

		}

		@Override public void mousePressed(MouseEvent e) {}
		@Override public void mouseReleased(MouseEvent e) {}
		@Override public void mouseEntered(MouseEvent e) {}
		@Override public void mouseExited(MouseEvent e) {}

	}


		public static void main(String[] args) 
		{
			new KlicksZaehlen(4, 3);

		}



	}
