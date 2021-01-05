package javaproject;

public class Addressbook {
	
	//uc1 for contacts details
	
	class Contacts {
	
	String firstName, lastName, address, city, state;
	long zip, phoneNumber; 
	
	public Contacts(String firstName, String lastName, String address, String city, String state, long zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getAddress() {
		return address;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public long getZip() {
		return zip;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}

	
	}


}