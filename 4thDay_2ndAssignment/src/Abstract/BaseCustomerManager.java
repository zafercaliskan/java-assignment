package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    public void Save(Customer customer) throws Exception
    {
      System.out.println("Saved to db : " + customer.getFirstName());
    }	
}