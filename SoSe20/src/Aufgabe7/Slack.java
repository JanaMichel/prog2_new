package Aufgabe7;

import java.util.*;


public class Slack implements Publisher
{

	private Set<Listener>listeners; //Speichert alle Abonnenten, liste möglich
	private int nrOfMessages; //speichert nummer, fortlaufend nummeriert
	
	public Slack()
	{
		 this.listeners = new HashSet<>();
		 this.nrOfMessages = 0;
	}
	
	@Override
	public boolean register(Listener listener) 
	{
		if(this.listeners.contains(listener))
		{
			return false;
		}
		this.listeners.add(listener);
		return true;
	}

	@Override
	public boolean unregister(Listener listener) 
	{
		if(this.listeners.contains(listener))
		{
			this.listeners.remove(listener);
			return true;
		}
		return false;

	}

	@Override
	public void notifyListeners() 
	{
		for(Listener listens : this.listeners)
		{
			listens.update();
		}
	}

	@Override
	public String getUpdate(Listener listener) 
	{
		return "Breaking news: " + this.nrOfMessages;
	}
	
	public void publishNews()
	{
		this.nrOfMessages++;
		notifyListeners();
	}
	
}
