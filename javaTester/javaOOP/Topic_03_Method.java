package javaOOP;

public class Topic_03_Method {

	void showCarName() {
		System.out.println("Hyundai Tucson");
	}

	static void showCarColor() {
		System.out.println("White");
	}

	public static void main(String[] args) {
		showCarColor();

		Topic_03_Method obj = new Topic_03_Method();

		obj.showCarName();

		Topic_03_Method.showCarColor();

	}

}
