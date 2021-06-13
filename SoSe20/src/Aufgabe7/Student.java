package Aufgabe7;

import Uebung7.Stadt;

public class Student implements Listener
{
	
	private String name;
	private Publisher publisher; //Speichert publisher, wo sich student anmeldet
	
	public Student(String name)
	{
		this.name = name;
	}

	@Override
	public void update() 
	{
		Listener s = new Student(this.name);
		this.publisher.getUpdate(s);
	}

	@Override
	public void setPublisher(Publisher publisher) 
	{
		publisher = this.publisher;
		if(publisher.register(this))
		{
			System.out.println(this.name + "registered");
		}
	}

	@Override
	public void removePublisher(Publisher publisher) 
	{
		publisher = this.publisher;
		if(publisher.unregister(this))
		{
			System.out.println(this.name + "unregistered");
		}
	}
	
	@Override
    public boolean equals(Object o)
    {
        if(o==null) return false;
        if(o==this) return true;
        if(this.getClass()!=o.getClass()) return false;

        Student other = (Student)o;
        return (this.name.equals(other.name));
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }
	
}
