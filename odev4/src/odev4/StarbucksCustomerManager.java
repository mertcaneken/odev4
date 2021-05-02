package odev4;

public class StarbucksCustomerManager extends CustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
		
			System.out.println("Starbucks musterisi kaydedildi: " + customer.getFirstName());
		}else {
			System.out.println("HATA! Lütfen geçerli bir kişi kaydediniz.");
		}
	}

}
