class Park
{
	String parkName;
	String location;
	int noOfVisitors;
	String owner;
	int noOfTrees;
	int noOfRoom;
	Boolean foodAvailabilty;
    int noOfCCTV;
	Boolean droneAllowed;
	
	Park()
	{
		System.out.println("Invoking no-arg constructor of Park");
	}
	Park(String parkName)
	{
		this();
		this.parkName=parkName;
		System.out.println("Invoking String  constructor of Park");
	}
	
	Park(String parkName,String location,int noOfVisitors)
	{
		this(parkName);
		this.location=location;
		this.noOfVisitors=noOfVisitors;
		System.out.println("Invoking String , int constructor of Park");
	}
	Park(String parkName,String location,int noOfVisitors,String owner)
	{
		this(parkName,location,noOfVisitors);
		this.owner=owner;
		System.out.println("Invoking String ,String, int constructor of Park");
	}
	Park(String parkName,String location,int noOfVisitors,String owner,int noOfRoom,	int noOfTrees)
	{
		this(parkName,location,noOfVisitors,owner);
		this.noOfRoom=noOfRoom;
		this.noOfTrees=noOfTrees;
		System.out.println("Invoking String , int , String, int constructor of Park");
	}
	Park(String parkName,String location,int noOfVisitors,String owner,int noOfRoom,Boolean foodAvailabilty)
	{
		this(parkName);
		this.foodAvailabilty=foodAvailabilty;
		System.out.println("Invoking String , int, String, int  constructor of Park");
	}
	Park(String parkName,String location,int noOfVisitors,String owner,int noOfRoom,Boolean foodAvailabilty,int noOfCCTV)
	{
		this(parkName,location,noOfVisitors,owner,noOfRoom,foodAvailabilty);
		this.noOfCCTV=noOfCCTV;
		System.out.println("Invoking String , int, String,Boolean, int constructor of Park");
	}
	Park(String parkName,String location,int noOfVisitors,String owner,int noOfRoom,Boolean foodAvailabilty,int noOfCCTV,boolean droneAllowed)
	{
		this(parkName,location,noOfVisitors,owner,noOfRoom,foodAvailabilty,noOfCCTV);
		this.droneAllowed=droneAllowed;
		System.out.println("Invoking String , int, String,Boolean, int constructor of Park");
	}
	Park(String location,int noOfVisitors,String owner,int noOfTrees,int noOfRoom,int noOfCCTV)
	{
		this();

		System.out.println("Invoking String , int, String,Boolean, int ,Boolean, int constructor of Park");
	}
	
	
	
}