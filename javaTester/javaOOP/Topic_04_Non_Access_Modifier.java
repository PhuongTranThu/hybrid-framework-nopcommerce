package javaOOP;

public class Topic_04_Non_Access_Modifier {

	static String browserName = "Chrome";

	public static void sendkeyToElement(String elementName) {
		System.out.println(elementName);
	}

	public void clickToElement() {

	}

	public final void setCarName() {

	}

	public static void main(String[] args) {

		System.out.println("Chrome");

		final String colorCar = "Red";

		Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();

	}

}
