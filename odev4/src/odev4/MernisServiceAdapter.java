package odev4;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result = true;
		/*KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getTckn()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }*/
		 return result;
	}

}
