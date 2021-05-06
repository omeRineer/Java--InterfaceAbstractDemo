package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class PersonCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return false;
	}

}
