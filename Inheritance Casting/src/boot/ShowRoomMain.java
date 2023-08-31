package boot;

import app.MobileShowRoom;
import app.ShowRoom;
import app.WatchShowRoom;
import util.ShowRoomUtil;

public class ShowRoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom room=new ShowRoom();
		
		WatchShowRoom room2=new WatchShowRoom();
		
		MobileShowRoom room3 =new MobileShowRoom();
		
		ShowRoomUtil roomUtil=new ShowRoomUtil();
		System.out.println("Calling run method with showroom ref");
		roomUtil.run(room);
		System.out.println("----------------------------------------");
		System.out.println("Calling run method with Watch Showroom ref");
		roomUtil.run(room2);
		System.out.println("----------------------------------------");
		System.out.println("Calling run method with Mobile showroom ref");
		roomUtil.run(room3);
		System.out.println("----------------------------------------");




	}

}
