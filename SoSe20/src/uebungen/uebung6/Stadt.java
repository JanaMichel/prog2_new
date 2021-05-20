package uebungen.uebung6;

import java.util.*;

public class Stadt {

	String name;
	List<Integer> bevoelkerung;
	float flaeche;
	
	public Stadt(String name, List<Integer> bevoelkerung, float flaeche)
	{
		this.name = name;
		this.bevoelkerung = bevoelkerung;
		this.flaeche = flaeche;
	}
	
	
	
	 //3. Erstellen Sie f�r die Klasse Stadt eine print()-Methode, 
    //so dass eine Ausgabe auf der Konsole in folgender Form erscheint (Bsp.): 
    //Berlin     891,68 km2    3.382.169   3.460.725   3.574.830
    void print()
    {
        //Namen der Stadt, ihre Fl�che und "km2" ausgeben
    	System.out.println(this.name + "   " + this.flaeche + " km2   " + this.bevoelkerung);
        //mithilfe einer Schleife oder Iterator Eintr�ge der Bev�lkerungs-Liste ausgeben
        //Beispiel f�r Schleife: 
        //https://freiheit.f4.htw-berlin.de/prog2/collections/#die-for-each-schleife
        //Beispiel f�r Iterator:
        //https://freiheit.f4.htw-berlin.de/prog2/collections/#listen
    	/*Iterator<Integer>it = bevoelkerung.iterator();
    	while(it.hasNext())
    	{
    		System.out.print(it.next());
    	}*/
    }
    
    @Override
    public boolean equals(Object o)
    {
        //Es soll getestet werden, ob der Name des �bergebenen Stadt-Objekts o gleich dem Namen des aktuellen Stadt-Objekts ist
        //Vorher m�ssen erst ein paar F�lle abgekl�rt werden:       
        // wenn �bergebenes Objekt o null ist, gib false zur�ck
    	if(o== null) return false;
        // wenn �bergebenes Objekt o gleich dem aktuellen Objekt der Klasse ist, gib true zur�ck
        if (o==this) return true;
    	// wenn die Laufzeitklasse des �bergebenen Objekts o nicht gleich der Laufzeitklasse des aktuellen Objekts ist,
        // gib false zur�ck
        if(o.getClass()!=this.getClass()) return false;
        
        //Wenn diese drei F�lle nicht eingetreten sind:
        //Stadt-Objekt anlegen vom �bergebenen Objekt o
        Stadt other = (Stadt)o;
       
        //testen ob der Name des �bergebenen Stadt-Objekts gleich dem Namen des aktuellen Stadt-Objekts ist
        return (this.name.equals(other.name));
        //Ergebnis zur�ckgeben      
    	
    }
    
    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }

}
