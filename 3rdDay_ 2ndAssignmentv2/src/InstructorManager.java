public class InstructorManager extends UserManager {
	public void update(Instructor instructor) {
		System.out.println(instructor.getFullName()+ " güncellendi.");
	}
}