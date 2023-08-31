class HelmetRunner{
	public static void main(String[] args){
		System.out.println("invoking helmet");
		
		Helmet helmet=new Helmet();
		System.out.println(helmet.brand);
		System.out.println(helmet.quality);
		System.out.println(helmet.price);
		System.out.println(helmet.color);
		
		
		
		Helmet helmet1=new Helmet();
		System.out.println("vega");
		System.out.println("Strong");
		System.out.println(800);
		System.out.println("black");
		
		
		Helmet helmet2=new Helmet("studs","blue");
		
		
		Helmet.Printstatic();
		helmet.PrintInstance();
	}
}