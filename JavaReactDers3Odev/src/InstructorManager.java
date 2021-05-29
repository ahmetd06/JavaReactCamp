
public class InstructorManager extends UserManager {

	public void getSalary(Instructor instructor) {

		double salary = instructor.getHourlyWage() * instructor.getTotalCourseHours();
		System.out.println(instructor.getInstructorNumber() + " nolu Eğitmenin Maaşı :" + salary);
	}

}
