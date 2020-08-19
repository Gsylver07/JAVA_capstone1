import java.util.Scanner;

public class Person {
	
	// Attributes.
	String title;
	String name;
	String lastName;
	String phoneNumber;
	String email;
	String address;
	
	// Methods.
	
	// Create 'Person' object for contractor, architect and customer.
	public Person(String title, Scanner input){
		this.title = title;
		
		System.out.printf("Please enter the %s first name: ", title);
		this.name = input.next();
		
		System.out.printf("Please enter the %s last name: ", title);
		this.lastName = input.next();
		
		System.out.printf("Please enter the %s phone number: ", title);
		this.phoneNumber = input.next();
		
		System.out.printf("Please enter the %s email address: ", title);
		this.email = input.next();
		
		System.out.printf("Please enter the %s physical address. Use ';' to indicate separate lines: ", title);
		this.address = input.next();
	}
	
	// Call each attribute.
	public String getTitle(){
		return title;
	}
	
	public String getName(){
		return name + " " + lastName;
	}
	
	public String getSurname(){
		return lastName;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getAddress(){
		return address;
	}
	
	// Call all attributes.
	public String getPerson(){
		String output = "Designation: " + title;
		output += "\nFirst name: " + name;
		output += "\nLast name: " + lastName;
		output += "\nNumber: " + phoneNumber;
		output += "\nEmail: " + email;
		output += "\nAddress: " + address;
		
		return output;
	}

}