public class Main {

	public static void main(String[] args) {
		
		User zafer=new User();
		zafer.setId(123);
		zafer.setFirstName("Zafer");
		zafer.setLastName("Çalışkan");
		
		User berat=new User();
		berat.setId(124);
		berat.setFirstName("Berat");
		berat.setLastName("Çelik");
		
		User[] users= { zafer, berat };
		
		UserManager userManager=new UserManager();
		userManager.addMultiple(users);		
		
		Student student= new Student();
		student.setId(125);
		student.setFirstName("Görkem");
		student.setLastName("Bilim");
		student.setOkulNumarasi(502);
		student.setOkulAdi("İstanbul Üniversite");
		
		Student[] students= { student };		
		
		StudentManager studentManager = new StudentManager();
		studentManager.addMultiple(users);
		
		
		Instructor instructor= new Instructor();
		instructor.setId(125);
		instructor.setFirstName("Ayhan");
		instructor.setLastName("Karaman");
		instructor.setEgitmenId(502);
		instructor.setBrans("Yazılım");
		
		Instructor[] instructors= { instructor };		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addMultiple(instructors);	

	}
}