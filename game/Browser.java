package ProjectAssociation.game;

import ProjectAssociation.Battery;

public class Browser {
		public String name;
		public Internet internet;
		
		public void task()
		{
			System.out.println("Invoking Internet in Browserr");
         if(internet!=null)
{
			this.internet.charge();
			}
			else
			{
				System.out.println("Internet is null, not to operate charge() method");
			}
		}
		public void cost()
		{
			System.out.println("Invoking owner in Internet");
			if(internet!=null)
			{
			this.internet.name();
			}
			else
			{
				System.out.println("Internet is null, not to operate name() method");
			}
		}
	}


