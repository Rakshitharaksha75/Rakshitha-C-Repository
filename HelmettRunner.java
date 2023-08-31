class HelmettRunner{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in HelmettRunner");
  
  Helmett helmett = new Helmett("Helmett" ,"Hero", "Yellow", 2200);
  Helmett.printstatic();
  helmett.printInstance();
  
  Helmett helmett1 = new Helmett("Helmet", "Honda", "pink", 1888);
  Helmett.printstatic();
  helmett1.printInstance();
  
 }
 }