package address_book;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Instantiate AddressBook object
		AddressBook vipBook = new AddressBook();
		
		// create menu for for the 5 choices
		menu();
		int choice = scanner.nextInt();
		while (choice!=5) {
			if(choice ==1) {
			//Reads in all appropriate information.");
    		System.out.println("Enter your colleague\'s first name:");
    		String firstName = scanner.next();
    		System.out.println("Enter your colleague\'s last name:");
    		String lastName = scanner.next();
    		System.out.println("Enter your colleague\'s address:");
    		String address = scanner.next();
    		System.out.println("Enter your colleague\'s phone Number:");
    		String phoneNumber = scanner.next();
    		//a parameter to the addContact method.
    		vipBook.addEntry(new Entry( firstName , lastName, address, phoneNumber));  		
			}
			
			else {
				System.out.println("search");
			}
		//	else if(choice == 2) {
	    	
			// Implements rest of the choices by calling appropriate AddressBook methods on VipBook.
//				
//				System.out.println("What is the name of the contact you want to remove?");
//				String name = scanner.next();
//				vipBook.removeEntry(Entry(firsName, ));
//			
//			}
//		
		
				
		}
		}
		  public static void menu() {
				System.out.println("1.Add a new entry to your address book.");
				System.out.println("2.Remove an Entry from from your address book.");
				System.out.println("3.Search for a colleague information");
				
				System.out.println("4.Print out information of all of your contacts.");
				System.out.println("5.Quit.");
				
				System.out.println("Enter your menu choice:");
}
}