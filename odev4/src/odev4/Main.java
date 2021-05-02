package odev4;


public class Main {

	public static void main(String[] args) {
		
		Customer musteri1 = new Customer(1, "Mertcan", "Eken","23492342933","21.10.2000");
		Customer musteri2 = new Customer(2, "Ergün", "Çamur", "23044234523","12.12.2020");
		CustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(musteri1);
		
		CustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(musteri1);
		starbucksCustomerManager.save(musteri2);
	}

}
