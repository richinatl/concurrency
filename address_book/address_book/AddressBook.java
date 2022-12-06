package address_book;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class AddressBook {

	// An arrayList of Entries for storing information of colleagues
	private ArrayList<Entry> colleagues;
	
	// Create an empty AddressBook
	
	public AddressBook() {
		colleagues = new ArrayList<Entry>();
	}
	
	// Add an Entry to the AddressBook
	public void addEntry(Entry e) {
		colleagues.add(e);
	}
	
	// Remove an Entry from the AddressBook
	public void removeEntry(String name) {
		for(int i= 0;i< colleagues.size(); i++) {
			if(colleagues.get(i).getFirstName().equals(name) || colleagues.get(i).getlastName().equals(name)) 
				colleagues.remove(i);
		}
	}
	
	//Search for a colleague information
	public void searchEntry(String name) {
		for(int i= 0;i< colleagues.size(); i++) {
			
			if(colleagues.get(i).getFirstName().equals(name) || colleagues.get(i).getlastName().equals(name)) 
				System.out.println(colleagues.get(i));
		}
	}
	
	//Print the entries 
	public void printEntries() {
		
	}
	
	// Delete an information
	public void deleteEntry() {
		
	}
	
	// Quit the program
	public void quitProgram() {
		
	}
	
}
