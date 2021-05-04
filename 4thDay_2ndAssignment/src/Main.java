import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisCheckManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisCheckManager()); 
		Customer sadik=new Customer();
		sadik.setId(1);
		sadik.setFirstName("Zafer");
		sadik.setLastName("Çalışkan");
		sadik.setDateOfBirth(LocalDate.of(1996,05,17));
		sadik.setNationalityId("10252702256");	
		baseCustomerManager.Save(sadik);
	}
}