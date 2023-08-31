package boot;

import app2.CaremalChocolate;
import app2.Chocolate;
import app2.DarkChocolate;
import util.ChocolateUtil;

public class ChocolateMain {

	public static void main(String[] args) {
			System.out.println("Running Main ...............");
			
			Chocolate chocolate=new Chocolate();
			
			DarkChocolate darkChocolate=new DarkChocolate();
			
			CaremalChocolate caremalChocolate=new CaremalChocolate();
			
			ChocolateUtil chocolateUtil=new ChocolateUtil();
			System.out.println("Calling run methos using chocolate ref");
			chocolateUtil.run(chocolate);	
			System.out.println("------------------------------------");
			
			ChocolateUtil chocolateUtil2=new ChocolateUtil();
			System.out.println("Calling run methos using DARK chocolate ref");
			chocolateUtil2.run(darkChocolate);	
			System.out.println("------------------------------------");
			
			ChocolateUtil chocolateUtil3=new ChocolateUtil();
			System.out.println("Calling run methos using CARAMEL chocolate ref");
			chocolateUtil3.run(caremalChocolate);	
			System.out.println("------------------------------------");
			
			
		}
}
