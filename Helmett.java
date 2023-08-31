class Helmett{

 static String name;
 static String brand;
        String color;
        float price;

Helmett()
{
 super();
 System.out.println("Invoking const of Helmett");
}

Helmett(String name, String brand)
{
 System.out.println("Invoking String, String const of Helmett");
 this.name=name;
 this.brand=brand;
}

Helmett(String name, String brand, String color, float price)
{
 System.out.println("Invoking string, float const of Helmett");
 this.name=name;
 this.brand=brand;
 this.color=color;
 this.price=price;
}		 

static void printstatic()
{
 System.out.println("Invoking main in helmett");
 System.out.println(name);
 System.out.println(brand);
}

void printInstance()
{
 System.out.println("Invoking main in helmett");
 System.out.println(color);
 System.out.println(price);
 }
 }