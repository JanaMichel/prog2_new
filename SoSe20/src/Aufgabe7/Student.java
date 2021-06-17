package Aufgabe7;


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
		String msg = this.publisher.getUpdate(this); //ursprünglich Listener a1 = new Student(this.name)
		System.out.println(this.name + " received " + msg); //this.publisher.getUpdate(a1)
	}

	@Override
	public void setPublisher(Publisher publisher) 
	{
		this.publisher = publisher; //Ursprünglich publisher = this.publisher
		if(this.publisher.register(this)) //grund für nullpointer exception
		{
			System.out.println(this.name + " registered");
		}
	}

	@Override
	public void removePublisher(Publisher publisher) 
	{
		this.publisher = publisher;
		if(this.publisher.unregister(this))
		{
			System.out.println(this.name + " deregistered");
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
