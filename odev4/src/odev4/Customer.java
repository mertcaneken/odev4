package odev4;


public class Customer {
	private int id;
    private String firstName;
    private String lastName;
    private String tckn;
    private String dateOfBirth;
    public Customer() {
    }
	public Customer(int customerId, String firstName, String lastName, String tckn, String dateOfBirth) {
		super();
		this.id = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tckn = tckn;
		this.dateOfBirth = dateOfBirth;
	}
	public int getCustomerId() {
		return id;
	}
	public void setCustomerId(int customerId) {
		this.id = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTckn() {
		return tckn;
	}
	public void setTckn(String tckn) {
		this.tckn = tckn;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
