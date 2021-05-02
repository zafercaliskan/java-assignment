package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

    public void Save(Customer customer) throws Exception
    {
        if (customerCheckService.CheckIfRealPerson(customer))
        {
            super.Save(customer);
        }
        else
        {
            throw new Exception("Not a valid person");
        }        
    }	
}