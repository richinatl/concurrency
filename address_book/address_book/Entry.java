package address_book;


	public class Entry {
		private String name;
	    private String address;
	    private String phoneNumber;
	    
	 public void setName(String privateName) {
		 name = privateName;
	 }
	 
	 public String getName() {
		 return name;
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
	 
	 public Entry (String name, String address, String phoneNumber ) {
		 this.name = name;
		 this.address = address;
		 this.phoneNumber = phoneNumber;
	 }
}
