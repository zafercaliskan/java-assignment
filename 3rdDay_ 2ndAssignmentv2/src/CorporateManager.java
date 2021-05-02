public class CorporateManager extends UserManager {
	public void delete (Corporate corporate) {
		System.out.println(corporate.getCompanyName() + " silindi.");
	}
}