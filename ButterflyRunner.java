class ButterflyRunner{

 public static void main(String[] args)
 {
  Butterfly butterfly = new Butterfly(2, 4, 6, "yellow");
  Butterfly.printstatic();
  butterfly.printInstance();
  
  Butterfly butterfly1 = new Butterfly(2, 4, 8, "red");
  Butterfly.printstatic();
  butterfly1.printInstance();
  }
 }