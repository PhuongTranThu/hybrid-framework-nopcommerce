package javaOOP;

public class Student {
	private int studentNumber;
	private String studentname;
	private Float theoreticalPoint, practicePoint;

	public Student(int studentNumber, String studentname, Float theoreticalPoint, Float practicePoint) {
		super();
		this.studentNumber = studentNumber;
		this.studentname = studentname;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the studentname
	 */
	public String getStudentname() {
		return studentname;
	}

	/**
	 * @param studentname the studentname to set
	 */
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	/**
	 * @return the theoreticalPoint
	 */
	public Float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	/**
	 * @param theoreticalPoint the theoreticalPoint to set
	 */
	public void setTheoreticalPoint(Float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	/**
	 * @return the practicePoint
	 */
	public Float getPracticePoint() {
		return practicePoint;
	}

	/**
	 * @param practicePoint the practicePoint to set
	 */
	public void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public Float calculateAveragePoint() {
		return (this.theoreticalPoint + this.practicePoint * 2) / 3;
	}

	public void showInfo() {
		System.out.println(this.studentNumber + "/" + this.studentname + "/" + this.calculateAveragePoint());
	}

}
