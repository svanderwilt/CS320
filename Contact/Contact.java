// Author Name:  Scott Vanderwilt

//Date: 3/19/2022

//Course ID: CS 320

//Description: A class to create a contact with requirements put on the input

package Contact;

public class Contact {
	// contact attributes based on requirements
	private String contactId;  // required not longer than 10 characters
	private String firstName; // required not longer than 10 characters non null
	private String lastName; // required not longer than 10 characters non null
	private String phone; // required exactly 10 digits non null
	private String address; // required no longer than 30 characters non null
	
	// Constructor
	/*
	 * Take arguments for all attributes and set them 
	 */
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		super();
		// ensure the requirements are met for each attribute
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Bad contactId");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Bad firstName");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Bad lastName");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Bad phone " + phone);
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Bad address");
		}
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// when setting attribute ensure requirements are met
	// getter for contactId
	public String getContactId() {
		return contactId;
	}
	
	// getter and setter for firstName
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Bad firstName");
		}
		this.firstName = firstName;
	}
	
	// getter and setter for lastName
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Bad lastName");
		}
		this.lastName = lastName;
	}
	
	//getter and setter for phone
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Bad phone");
		}
		this.phone = phone;
	}
	
	//getter and setter for address
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Bad address");
		}
		this.address = address;
	}
	

}
