package uebungen.uebung6;

import java.util.*;

public class StadtTest 
{
	public static Stadt[] staedte()
    {
        Stadt[] staedte = new Stadt[6];
        List<Integer> berlinBevoelkerung = new ArrayList<>();
        berlinBevoelkerung.add(3382169);    
        berlinBevoelkerung.add(3460725);    
        berlinBevoelkerung.add(3574830);
        staedte[0] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

        List<Integer> hamburgBevoelkerung = new ArrayList<>();
        hamburgBevoelkerung.add(1715392);   
        hamburgBevoelkerung.add(1786448);   
        hamburgBevoelkerung.add(1810438);   
        staedte[1] = new Stadt("Hamburg", hamburgBevoelkerung, 755.22f);

        List<Integer> muenchenBevoelkerung = new ArrayList<>();
        muenchenBevoelkerung.add(1210223);  
        muenchenBevoelkerung.add(1353186);  
        muenchenBevoelkerung.add(1464301);
        staedte[2] = new Stadt("Muenchen", muenchenBevoelkerung, 310.70f);

        List<Integer> koelnBevoelkerung = new ArrayList<>();
        koelnBevoelkerung.add(962884);  
        koelnBevoelkerung.add(1007119); 
        koelnBevoelkerung.add(1075935); 
        staedte[3] = new Stadt("Koeln", koelnBevoelkerung, 405.02f);

        List<Integer> frankfurtBevoelkerung = new ArrayList<>();
        frankfurtBevoelkerung.add(648550);  
        frankfurtBevoelkerung.add(679664);  
        frankfurtBevoelkerung.add(736414);
        staedte[4] = new Stadt("Frankfurt/Main", frankfurtBevoelkerung, 248.31f);

        berlinBevoelkerung = new ArrayList<>();
        berlinBevoelkerung.add(3382169);    
        berlinBevoelkerung.add(3460725);    
        berlinBevoelkerung.add(3574830);
        staedte[5] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

        return staedte;
    }

    public static void main(String[] args)
    {   
        System.out.printf("%n------------ Liste --------------%n");

        //1. Erstellen Sie in der main()-Methode eine List<Stadt> staedteListe = new ArrayList<>();. 
        //Fügen Sie der staedteListe alle Städte aus dem durch Aufruf der staedte()-Methode erzeugtem Array zu.
        List<Stadt> staedteListe = new ArrayList<>();
        for(Stadt s : staedte())
        {
        	staedteListe.add(s);
        }
        
        //durch staedte iterieren und die Städte zur staedteListe hinzufügen

        //2. Geben Sie alle Informationen über alle Städte aus der Liste unter Verwendung 
        //der print()-Methode aus der Klasse Stadt aus.
        for(Stadt s : staedteListe)
        {
        	s.print();
        }
        //durch staedteListe iterieren und für jeden Eintrag die print()-Methode aufrufen
        
       
        
        System.out.printf("%n------------ Menge --------------%n");

        //1. Erstellen Sie in der main()-Methode eine Set<Stadt> staedteMenge = new HashSet<>();. 
        Set<Stadt> staedteMenge = new HashSet<>();
        for(Stadt s : staedte())
        {
        	staedteMenge.add(s);
        }
        //Fügen Sie der staedteMenge alle Städte aus dem durch Aufruf der staedte()-Methode erzeugtem Array zu.
        
        //analog zur gleichen Aufgabe mit der Liste oben

        for(Stadt s : staedteMenge)
        {
        	s.print();
        }
            //Geben Sie alle Informationen über alle Städte aus der Liste unter Verwendung der 
            //print()-Methode aus der Klasse Stadt aus.
            //analog zur gleichen Aufgabe mit der Liste oben

        //Berlin erscheint doppelt, obwohl eine Menge keine doppelten Elemente enthalten darf. Warum?


        System.out.printf("%n------------ Maps --------------%n");

        //1. Erstellen Sie in der main()-Methode eine Map<Integer, Stadt> staedteMap = new HashMap<>();. 
        Map<Integer, Stadt> staedteMap = new HashMap<>();
        
        //Fügen Sie der staedteMap einen fortlaufenden, eindeutigen Integer-Wert beginnend mit 1 als Key 
        Integer i = 1;
        for(Stadt s: staedte())
        {
        	staedteMap.put(i++, s);
        }
        //sowie alle alle Städte aus dem durch Aufruf der staedte()-Methode erzeugtem Array als Value hinzu.

            //Geben Sie alle Informationen über alle Städte aus der Liste unter Verwendung der print()-Methode aus der Klasse Stadt aus. 
            //Beginnen Sie die Zeile jeweils mit der Ausgabe des Keys.
        for(Map.Entry<Integer, Stadt> eintrag : staedteMap.entrySet())
        {
        	System.out.println(eintrag.getKey() + " : " + eintrag.getValue());
        }

        //Beispiel, wie man eine Map durchgeht: https://freiheit.f4.htw-berlin.de/prog2/maps/#durch-eine-map-laufen
        //erst den key ausgeben
        //dann die Werte

        
    }
}
