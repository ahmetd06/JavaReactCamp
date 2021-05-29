
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();

		student.setId(1);
		student.setFirstName("Ahmet");
		student.setFirstName("Dündar");
		student.setEmail("ahmet@dundar.com");
		student.setStudentNumber("1126222606");

		Instructor instructor = new Instructor();

		instructor.setId(2);
		instructor.setFirstName("Ahmet");
		instructor.setLastName("Dündar");
		instructor.setEmail("ahmet@dundar.com");
		instructor.setInstructorNumber("111111");
		instructor.setHourlyWage(300);
		instructor.setTotalCourseHours(20);
		
		Corporate corporate = new Corporate();
		corporate.setId(3);
		corporate.setEmail("test@testbilisim.com");
		corporate.setCompanyName("Test Bilişim");

		UserManager userManager = new UserManager();
		userManager.add(instructor);
		userManager.add(student);
		userManager.add(corporate);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getSalary(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		CorporateManager corporateManager = new CorporateManager();
		corporateManager.getTotalStudentCount();

	}

}
