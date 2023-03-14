package javaOOP;

public class Topic_01_Class_Object_Student {
	static int numberStudent = 0;

	private int studentID;
	private String studentName;
	private Float knowledgePoint, practicePoint;

	public Topic_01_Class_Object_Student() {
		Topic_01_Class_Object_Student.numberStudent++;
	}

	public Topic_01_Class_Object_Student(int studentID, String studentName, Float knowledgePoint, Float practicePoint) {
		Topic_01_Class_Object_Student.numberStudent++;
		this.studentID = studentID;
		this.studentName = studentName;
		this.knowledgePoint = knowledgePoint;
		this.practicePoint = practicePoint;
	}

	public Topic_01_Class_Object_Student(int studentID, String studentName) {
		Topic_01_Class_Object_Student.numberStudent++;
		this.studentID = studentID;
		this.studentName = studentName;
	}

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	private String getStudentName() {
		return studentName;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private Float getKnowledgePoint() {
		return knowledgePoint;
	}

	private void setKnowledgePoint(Float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	private Float getPracticePoint() {
		return practicePoint;
	}

	private void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	private Float getAveragePoint() {
		float averagePoint = (this.knowledgePoint + this.practicePoint * 2) / 3;
		return averagePoint;
	}

	public void showStudentInfor() {
		System.out.println("******************************************");
		System.out.println("Student ID = " + getStudentID());
		System.out.println("Student Name = " + getStudentName());
		System.out.println("Student knowledgePoint = " + getKnowledgePoint());
		System.out.println("Student practicePoint = " + getPracticePoint());
		System.out.println("Student average Point = " + getAveragePoint());
		System.out.println("******************************************");
	}

	public static void main(String[] args) {
		Topic_01_Class_Object_Student firstStudent = new Topic_01_Class_Object_Student();
		firstStudent.setStudentID(2005206);
		firstStudent.setStudentName("A");
		firstStudent.setKnowledgePoint(7.5f);
		firstStudent.setPracticePoint(8.5f);
		firstStudent.showStudentInfor();

		Topic_01_Class_Object_Student secondStudent = new Topic_01_Class_Object_Student();
		secondStudent.setStudentID(2005207);
		secondStudent.setStudentName("B");
		secondStudent.setKnowledgePoint(7f);
		secondStudent.setPracticePoint(9.5f);
		secondStudent.showStudentInfor();

		Topic_01_Class_Object_Student thirdStudent = new Topic_01_Class_Object_Student(2005207, "C", 8.5f, 9.0f);
		thirdStudent.showStudentInfor();

		Topic_01_Class_Object_Student fourStudent = new Topic_01_Class_Object_Student(2005208, "D");
		fourStudent.setKnowledgePoint(7f);
		fourStudent.setPracticePoint(9.5f);
		fourStudent.showStudentInfor();

		int n = Topic_01_Class_Object_Student.numberStudent;
		System.out.println(n);

	}

}
