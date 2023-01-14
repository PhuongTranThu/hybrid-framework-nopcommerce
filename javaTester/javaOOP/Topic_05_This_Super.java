package javaOOP;

public class Topic_05_This_Super {
	private int firstNumber;
	private int secondNumber;

	public Topic_05_This_Super() {
		this(10, 15);

	}

	public Topic_05_This_Super(int fNumber, int sNumber) {
		this.firstNumber = fNumber;
		this.secondNumber = sNumber;

	}

	public Topic_05_This_Super get() {
		return this;
	}

	public void sumNumber() {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public void showNumber() {
		this.sumNumber();
	}

	public static void main(String[] args) {
		Topic_05_This_Super topic = new Topic_05_This_Super(15, 17);
		topic.sumNumber();

		Topic_05_This_Super topic2 = topic.get();
		topic2.sumNumber();

	}

}
