package app;

public class Logo {
	private String companyName;
	private String designer;
	private String color;
	private boolean lookingGood;
	private String logoImage;

	public Logo() {

	}

	public Logo(String companyName, String designer, String color, boolean lookingGood, String logoImage) {
		super();
		this.companyName = companyName;
		this.designer = designer;
		this.color = color;
		this.lookingGood = lookingGood;
		this.logoImage = logoImage;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() from Logo");
		return "Company Name:" + companyName + " Designer:" + designer + " Color:" + color + " Looking Good:"
				+ lookingGood + " Logo Image:" + logoImage;
	}
}
