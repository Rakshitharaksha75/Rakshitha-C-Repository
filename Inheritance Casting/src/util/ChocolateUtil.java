package util;

import app2.CaremalChocolate;
import app2.Chocolate;
import app2.DarkChocolate;

public class ChocolateUtil {
	public void run(Chocolate chocolate) {

		Chocolate chocolate2 = new Chocolate();
		chocolate2.taste();

		if (chocolate instanceof DarkChocolate) {
			Chocolate dark = new DarkChocolate();
			dark.taste();

			DarkChocolate dark2 = (DarkChocolate) dark;
			dark2.getCost();
		}

		if (chocolate instanceof CaremalChocolate) {
			Chocolate caremal = new CaremalChocolate();
			caremal.taste();

			CaremalChocolate caremal2 = (CaremalChocolate) caremal;
			caremal2.getNoOfPieces();
		}
	}
}

