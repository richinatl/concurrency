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
	public void removeEntry(String s) {
		for(int i= 0;i< colleagues.size(); i++) {
			if(colleagues.get(i).getAddress().equals(s))
				System.out.println(colleagues.remove(i));
		}
	}
	
	//Search for a colleague information
	private int searchEntry(String s) {
		for(int i= 0;i< colleagues.size(); i++) {
			
			if(colleagues.get(i).getFirstName().equals(s) || colleagues.get(i).getlastName().equals(s) || colleagues.get(i).getAddress().equals(s)||colleagues.get(i).getPhoneNumber(s).equals(s)) 
				//System.out.println(colleagues.get(i));
				return i;
		
		}
		return -1;
	}
	
	//Print the entries 
	public void printEntries() {
		for (int i=0;i<colleagues.size();i++)
            System.out.println(colleagues.get(i));
			

	}
	
	// Clear the address book
	public void deleteEntry() {
	    for(int i=0; i<colleagues.size();i++)
	        
            System.out.print(colleagues.remove(i));
    
	}
	
	// Quit the program
	public void quitProgram() {
		System.exit(0);
		
	}

	public void add(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String next) {
		// TODO Auto-generated method stub
		
	}

	public Entry[] viewAll() {
		// TODO Auto-generated method stub
		return null;
	}


		
	}
	

