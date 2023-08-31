package app;

public class bakery {
public void bake() {
	System.out.println("calling parent class method from no arg");
}
public void bake(String item) {
	System.out.println("calling parent class method with string-arg");
	System.out.println("Item:"+item);
}
public void bake(double cost) {
	System.out.println("calling parent class method with string-arg");
	System.out.println("Cost:"+cost);
}
public void bake(int noOfItem) {
	System.out.println("calling parent class method with string-arg");
	System.out.println("NoOfItem:"+noOfItem);
}
public void bake(String item,double cost) {
	System.out.println("calling parent class method with string-arg");
	System.out.println("Item:"+item);
	System.out.println("Cost:"+cost);
	
}
public void bake(String item,double cost,int noOfItem) {
	System.out.println("calling parent class method with string-arg");
	System.out.println("Item:"+item);
	System.out.println("Cost:"+cost);
	System.out.println("NoOfItem:"+noOfItem);
	
}
}
