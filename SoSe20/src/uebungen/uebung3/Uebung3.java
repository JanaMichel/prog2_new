package uebungen.uebung3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uebung3 {

	//Eingabe zahl1 - ist zahl?
	//catch keine zahl
	//Eingabe zahl2 - ist zahl? ist 0 ?
	//catch division durch null
	//catch keine zahl
	public static int inputInt(int min, int max, String message)
    {
        boolean eingabeOk = false;
        int zahl = 0;
        // String message = "Geben Sie eine Zahl ein : ";
        while(!eingabeOk)
        {
            String eingabe1 = JOptionPane.showInputDialog(message);

            try {
                zahl = Integer.valueOf(eingabe1);
                if(zahl>=min && zahl<=max)
                {
                    eingabeOk = true;
                }
                else
                {
                    message = "Zahl muss zwischen " + min + " und " + max + " liegen!";
                }
            } 
            catch (NumberFormatException e) 
            {
                message = "Eingabe war keine Zahl! Bitte Zahl eingeben";
            }
        }
        return zahl;
    }

    public static int inputInt(String message)
    {
        return inputInt(Integer.MIN_VALUE,Integer.MAX_VALUE, message);
    }

    public static int division(int divident, int divisor) throws ArithmeticException
    {
        int quotient = divident / divisor;
        return quotient;
    }

    public static void printDivision()
    {
        int zahl1 = inputInt("Geben Sie eine Zahl1 ein : ");
        boolean zahl2NotZero = false;
        String message = "Geben Sie eine Zahl2 ein : ";
        while(!zahl2NotZero)
        {
            int zahl2 = inputInt(message);
            int result = 0;
            try {
                result = division(zahl1, zahl2);
                zahl2NotZero = true;
            } catch (ArithmeticException e) {
                message = "Zahl2 darf nicht 0 sein!";
            }
            System.out.println(zahl1 + " / " + zahl2 + " = " + result);
        }
    }

    public static int quersumme(int zahl)
    {
        int ganz = zahl;
        int quersumme = 0;
        while(ganz>0)
        {
            int rest = ganz % 10;
            quersumme += rest;
            ganz = ganz / 10;
        }
        return quersumme;
    }

    public static void printUmrechnungSek()
    {
        int sek = inputInt("Anzahl Sekunden : ");
        int tage     = sek/(24*60*60);
        int stunden  = sek/(60*60)  - (tage*24);
        int minuten  = sek/(60)     - (tage*24*60)      - (stunden*60);
        int sekunden = sek          - (tage*24*60*60)   - (stunden*60*60) - (minuten*60);

        String s = sek + " Sekunden sind ";
        if(tage>1)  s += tage +" Tage, ";
        else if(tage==1) s+= "1 Tag, ";
        if(stunden>1) s += stunden +" Stunden, ";
        else if(stunden==1) s += "1 Stunden, ";
        if(minuten>1) s += minuten + " Minuten, ";
        else if(minuten==1) s += "1 Minute, ";
        if(sekunden>1) s += sekunden +" Sekunden.";
        else if(sekunden==1) s += "1 Sekunde.";
        System.out.println(s);
    }

    public static void main(String[] args) 
    {
        printDivision();
        int zahl = inputInt("Geben Sie eine Zahl ein");
        // System.out.println("Quersumme von " + zahl + " ist " + quersumme(zahl));
        JOptionPane.showMessageDialog(null, "Quersumme von " + zahl + " ist " + quersumme(zahl));

        printUmrechnungSek();
    }

}
