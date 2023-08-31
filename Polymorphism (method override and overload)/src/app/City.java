package app;

public class City {
public void city()
{
	System.out.println("city method in superclass");
	
}
public void city(String name)
{
	System.out.println("invoke city name in superclass:"+name);
}
public void city(String name, boolean population)
{
	System.out.println("invoke city name in superclass:"+name);
	System.out.println("invoking citu population in superclass:"+population);
	
}
public void city(String name, boolean population, String district)
{
	System.out.println("invoke city name in superclass:"+name);
	System.out.println("invoking citu population i superclass:"+population);
	System.out.println("city district in superclass:"+district);
}
public void city(String name, boolean population,String district,String state)
{
	System.out.println("invoke city name in superclass:"+name);
	System.out.println("invoking city population in superclass:"+population);
	System.out.println("city district in superclass:"+district);
	System.out.println("city state in superclass:"+state);
	
}
public void city(String name, boolean population,String district,String state,boolean houses)
{
	System.out.println("invoke city name in superclass:"+name);
	System.out.println("invoking city population in superclass:"+population);
	System.out.println("city district in superclass:"+district);
	System.out.println("city state in superclass:"+state);
	System.out.println("city houses in superclass:"+houses);
	
}

}
