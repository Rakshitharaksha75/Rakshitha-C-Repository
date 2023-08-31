class Wood{
 int tree;
 String personName;
 double price;
 int noOfPieces;
 String nameOfTree;
 
 Wood()
 {
	 System.out.println("invoking no-arg in wood");
 }
 Wood(int tree)
 {
	 super();
	 System.out.println("invoking no-arg in tree");
	 this.tree=tree;
 }
 Wood(int tree,String personName)
 {
	 this(tree);
	 System.out.println("invoking no-arg in wood");
	 this.personName=personName;
	 this.tree=tree;
 }
  Wood(int tree,String personName,double price)
 {
	 this(tree,personName);
	 System.out.println("invoking no-arg in wood");
	 this.personName=personName;
	 this.tree=tree;
	 this.price=price;
 }
  Wood(int tree,String personName,double price,int noOfPieces)
 {
	 this(tree,personName,price);
	 System.out.println("invoking no-arg in wood");
	 this.personName=personName;
	 this.tree=tree;
	 this.price=price;
	 this.noOfPieces=noOfPieces;
	 
 }
  Wood(int tree,String personName,double price,int noOfPieces,String nameOfTree)
 {
	 this(tree,personName,price,noOfPieces);
	 System.out.println("invoking no-arg in wood");
	 this.personName=personName;
	 this.tree=tree;
	 this.price=price;
	 this.noOfPieces=noOfPieces;
	 this.nameOfTree=nameOfTree;
	 
 }
 
 }