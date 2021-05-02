package odev4;

public abstract class CustomerManager {
	public void save(Customer customer) {
		System.out.println("Musteri kaydedildi: " + customer.getFirstName());
	}
}
