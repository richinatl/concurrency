package address_book;


	public class Entry {
		private String firstName;
		private String lastName;
	    private String address;
	    private String phoneNumber;
	    
	 public void setName(String privateFirstName) {
		 firstName = privateFirstName;
	 }
	 
	 public String getFirstName() {
		 return firstName;
	 }
	 
	 public void setLastName(String privateLastName) {
		 firstName = lastName;
	 }
	 
	 public String getlastName() {
		 return lastName;
	 }
	 
	 public void setAddress(String privateAddress) {
		 address = privateAddress;
	 }
	 
	 public String getAddress() {
		 return address;
	 }
	 
	 public void setPhoneNumber(String privatePhoneNumber) {
		 phoneNumber = privatePhoneNumber;
	 }
	 
	 public String getPhoneNumber(String privatePhoneNumber) {
		 return phoneNumber;
	 }
	 
	 public Entry (String firstName, String lastName, String address, String phoneNumber ) {
		 this.firstName = name;
		 this.address = address;
		 this.phoneNumber = phoneNumber;
	 }
}
