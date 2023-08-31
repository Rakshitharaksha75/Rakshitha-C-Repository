class Helmet{
	static String brand="Vega";
	static String quality;
	int price;
	String color;  
	
	Helmet()
	{
		super();
		System.out.println("invoking no-arg in helmet");
	}
	
	Helmet(String brand,String quality){
		this.brand=brand;
		this.quality=quality;
		System.out.println("invoking String,String in const helmet");
	}
	
	Helmet(String brand,String quality,int price,String color){
		this.brand="vega";
		this.quality="strong";
		this.price=800;
		this.color="black";
	}
	
	static void Printstatic()
	{
		System.out.println("invoking main in helmet");
		System.out.println("brand");
		System.out.println("quality");
	}
	
	void PrintInstance()
	{
		System.out.println("invoking main in helmet");
		System.out.println("price");
		System.out.println("color");
	}
	
	
	
}