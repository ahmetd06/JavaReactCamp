
public class Student extends User {

	private String firstName;
	private String lastName;
	private String studentNumber;
	private int grade;

	public Student() {
		super();

	}

	public Student(int id, String email, String firstName, String lastName, String studentNumber, int grade) {
		super(id, email);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setStudentNumber(studentNumber);
		this.setGrade(grade);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
