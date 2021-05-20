package Maps;

	import java.util.*;

public class Maps {

	public static void main(String[] args) 
	{
		Map<String,Double> m = new HashMap<>();
        m.put("s0512345", 1.7);     // neues Schluessel-Werte-Paar hinzugefuegt
        m.put("s0587654", 2.3);     // neues Schluessel-Werte-Paar hinzugefuegt
        m.put("s0512345", 2.7);     // Schluessel existiert bereits --> Wert geaendert
        m.put("s0555555", 3.0);     // neues Schluessel-Werte-Paar hinzugefuegt
        
        Set<String> keys = m.keySet();  // Menge aller Schluessel, keine doppelten Elemente
        Collection<Double> values = m.values();         // Collection aller Werte
        Set<Map.Entry<String, Double>> entries = m.entrySet();  // Menge aller Schluessel-Werte-Paare
        
        for(Map.Entry<String, Double> eintrag : m.entrySet())
        {
            System.out.println( eintrag.getKey() + "  :  " + eintrag.getValue());
        }
        
        System.out.println();
        
        for(String schluessel : m.keySet())
        {
            System.out.println("key : " + schluessel);
        }
        System.out.println();
        for(Double wert : m.values())
        {
            System.out.println("value : " + wert.toString());  // toString() wuerde auch implizit aufgerufen
        }
        
        //Beispiel
        Map<String, String> accounts = new HashMap<>();
        Map<String, String> accounts2 = new TreeMap<>();
        
        accounts.put("Anton", "anton@email.de");
        accounts.put("Berta", "berta@email.de");
        accounts.put("Dora", "dora@email.de");
        accounts.put("Caesar", "caesar@email.de");
        accounts.put("Anton", "antonius@email.de");
        
        accounts2.putAll(accounts);
        
        // Iteration ueber alle Eintraege (Map.Entry) der Map
        System.out.printf("%n%n----------HashMap---------%n%n");
        for(Map.Entry<String, String> entry : accounts.entrySet()) 
        {
            System.out.println("Account : " + entry.getKey() + " E-Mail : " + entry.getValue());
        }
        System.out.printf("%n%n----------TreeMap---------%n%n");
        for(Map.Entry<String, String> entry : accounts2.entrySet()) 
        {
            System.out.println("Account : " + entry.getKey() + " E-Mail : " + entry.getValue());
        }

	}

}
