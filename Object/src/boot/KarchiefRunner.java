package boot;

import app.Karchief;

public class KarchiefRunner {
	public static void main(String[] args) {
		Karchief karchief = new Karchief();
		System.out.println(karchief);
		Karchief karchief1 = new Karchief("NF","Red",10,6,8,"Jeevitha","bangalore");
		System.out.println(karchief1);
		Karchief karchief2 = new Karchief("mukund","Pinck",20,5,6,"Handson","Mysore");
		System.out.println(karchief2);

	}


}
