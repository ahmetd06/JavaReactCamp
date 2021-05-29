
public class Instructor extends User {

	private String firstName;
	private String lastName;
	private String instructorNumber;
	private double hourlyWage;
	private int totalCourseHours;

	public Instructor() {
		super();
	}

	public Instructor(int id, String email, String firstName, String lastName, String instructorNumber,
			double hourlyWage, int totalCourseHours) {
		super(id, email);

		this.firstName = firstName;
		this.lastName = lastName;
		this.instructorNumber = instructorNumber;
		this.hourlyWage = hourlyWage;
		this.totalCourseHours = totalCourseHours;
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

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getTotalCourseHours() {
		return totalCourseHours;
	}

	public void setTotalCourseHours(int totalCourseHours) {
		this.totalCourseHours = totalCourseHours;
	}

}
