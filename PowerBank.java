package ProjectAssociation;

public class PowerBank {
	public String name;
	public Battery Battery;
	
	public void backup()
	{
		System.out.println("Invoking Battery in PowerBank");
		if(Battery!=null)
		{
		this.Battery.charge();
		}
		else
		{
			System.out.println("Battery is null, not to operate charge() method");
		}
	}
	public void owner()
	{
		System.out.println("Invoking owner in Battery");
		if(Battery!=null)
		{
		this.Battery.name();
		}
		else
		{
			System.out.println("Battery is null, not to operate name() method");
		}
	}
}
