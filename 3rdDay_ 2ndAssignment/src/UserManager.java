public class UserManager {
	public void add(User user) {				
		System.out.println(user.getFullName() + " eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFullName() + " silindi.");
	}
	
	public void addMultiple(User[] users) {		
		for(User user:users) {
			add(user);
		}		
	}	
}