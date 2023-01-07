package javaOOP;

public class Topic_01_Class_Object_Student {
	private int studentID;
	private String studentName;
	private Float knowledgePoint, practicePoint;

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
		return (this.knowledgePoint + this.practicePoint * 2) / 3;
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

	}

}
