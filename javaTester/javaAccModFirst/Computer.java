package javaAccModFirst;

public class Computer {

	private int ssdSize;
	String rameProductName;

	private void setSsdSize(int ssdSize) {
		this.ssdSize = ssdSize;
	}

	void setRamProduct(String ramProduct) {
		rameProductName = ramProduct;
	}

	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.ssdSize = 500;

		System.out.println(comp.ssdSize);

		comp.setSsdSize(600);
		System.out.println(comp.ssdSize);
	}
}
