package boot;

import app.Flag;

public class FlagRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in FlagRunner ");

		Flag flag = new Flag("Orange White Green", 5, true);
		System.out.println(flag);

		Flag flag1 = new Flag("White", 10, false);
		System.out.println(flag1);

		Flag flag2 = new Flag("Green", 3, false);
		System.out.println(flag2);

	}
	}
