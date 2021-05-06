package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService checkService;
	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		
		this.checkService = checkService;
	}
	@Override
	public void Add(Customer customer) {
		if (checkService.CheckIfRealPerson(customer)) {
			super.Add(customer);
		}
		else {
			System.out.println("Müþteri doðrulanmadý");
		}
		
	}

}
