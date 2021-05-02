package odev4;

public class NeroCustomerManager extends CustomerManager  {
	CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Nero musterisi kaydedildi: " + customer.getFirstName());
			super.save(customer);
		}else {
			System.out.println("HATA! Lütfen geçerli bir kişi kaydediniz.");
		}
	}
}
