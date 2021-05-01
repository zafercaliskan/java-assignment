public class InstructorManager {
	public void add(Instructor instructor) {				
		System.out.println(instructor.getFullName() + " eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFullName() + " silindi.");
	}
	
	public void addMultiple(Instructor[] instructors) {		
		for(Instructor instructor:instructors) {
			add(instructor);
		}		
	}

}