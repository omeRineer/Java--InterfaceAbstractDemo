import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.PersonCheckManager;
import Concrete.StarbucksCustomerManager;

public class main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
		baseCustomerManager.Add(null);

	}

}
