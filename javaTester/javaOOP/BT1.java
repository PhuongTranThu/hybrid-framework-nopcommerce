package javaOOP;

public class BT1 {

	public static void main(String[] args) {
		Student sv1 = new Student(1, "Phan Văn Tùng", 5.0f, 4.5f);
		Student sv2 = new Student(2, "Trần Thu Phương", 9.0f, 8.5f);
		Student sv3 = new Student(3, "Phạm Trọng Tâm", 6.0f, 6.5f);

		sv1.showInfo();
		sv2.showInfo();
		sv3.showInfo();
	}

}
