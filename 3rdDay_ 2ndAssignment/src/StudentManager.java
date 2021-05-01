public class StudentManager {
	
	public void add(Student student) {				
		System.out.println(student.getFullName() + " eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFullName() + " silindi.");
	}
	
	public void addMultiple(Student[] students) {		
		for(Student student:students) {
			add(student);
		}		
	}	
	
}