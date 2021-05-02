public class Main {
	public static void main(String[] args) {
		
		User gorkem = new User(125, "gorkem@gmail.com", "123456");		
		UserManager userManager=new UserManager();
		userManager.Register(gorkem); 
		
		Student ayjan= new Student();
		ayjan.setId(126);
		ayjan.setFirstName("Ayjan");
		ayjan.setLastName("Jamanakova");
		
		StudentManager studentManager= new StudentManager();
		studentManager.add(ayjan);				
	
		Student zafer=new Student(1,123,"zafer","çalışkan");
		
		Student sadik=new Student();
		sadik.setId(2);
		sadik.setUserId(124);
		sadik.setFirstName("Sadık");
		sadik.setLastName("Ortaoglan");
		
		studentManager.add(sadik);
		studentManager.add(zafer);
		
		Instructor engin = new Instructor(127,1222,"Engin","Demirog");
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.update(engin);
		
		Corporate asus=new Corporate(12321,12312,"Asus");		
		
		CorporateManager corporateManager =new CorporateManager();
		corporateManager.delete(asus);	
	}
}