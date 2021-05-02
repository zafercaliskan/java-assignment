import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new CustomerCheckManager()); 
		Customer sadik=new Customer();
		sadik.setId(1);
		sadik.setFirstName("Sadık");
		sadik.setLastName("Ortaoglan");
		sadik.setDateOfBirth(LocalDate.of(1996,05,17));
		sadik.setNationalityId("123456789101");	
		baseCustomerManager.Save(sadik);
	}
}