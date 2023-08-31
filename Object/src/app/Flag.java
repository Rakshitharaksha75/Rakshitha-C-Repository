package app;

public class Flag {
	private String color;
	private int height;
	private boolean isIndianFlag;

	public Flag() {

	}

	public Flag(String color, int height, boolean isIndianFlag) {
		super();
		this.color = color;
		this.height = height;
		this.isIndianFlag = isIndianFlag;
	}
@Override
	public String toString() {
		System.out.println("invoking toString() in Flag");
		return "Color:" + color + " Height:" + height + " Indian Flag:" + isIndianFlag;
	}
}
