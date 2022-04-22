/**
 * 
 */

/**
 * @author Scott Vanderwilt
 * 
 * Date: 3/19/2022
 * 
 * Course ID: CS 320
 *
 * Description: A class to store and support contacts
 */

package Contact;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class ContactService {

	// create an array to store newly created contacts
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	private static AtomicLong id = new AtomicLong();
	
	// create a new contact and add it to the contacts array   return created contactId
	public String addContact(String firstName, String lastName, String phone, String address) {
		try {
			Contact contact = new Contact(String.valueOf(id.getAndIncrement()), firstName, lastName, phone, address);
			contacts.add(contact);
			return contact.getContactId();
		} catch(Exception e) {
			throw new IllegalArgumentException("Error creating contact because of " + e.getMessage());
		}
	}
	
	// delete contact that has contactId as contactId or send message saying not found
	public void deleteContact(String contactId) {
		// get the contact from contactId
		Contact contactToDelete = getContact(contactId);
		// delete from contacts if found
		if (contactToDelete != null) {
			contacts.remove(contactToDelete);
		} else {  // send message to user if not found
			throw new IllegalArgumentException("Contact with contactId: " + contactId + " not found.");
		}
	}
	
	// update contact firstName if valid contactId and valid firstName or message user
	public void updateFirstName(String contactId, String firstName) {
		try {
			// find contact to update by contactId
			Contact contactToUpdate = getContact(contactId);
			// if contact found try to update first name
			if (contactToUpdate != null) {
				contactToUpdate.setFirstName(firstName);
			} else {  // if not found send message to user
				throw new IllegalArgumentException("Contact with contactId: " + contactId + " not found.");
			}
		} catch(Exception e) {  // if not valid value for firstName
			throw new IllegalArgumentException("Error updating contact because of " + e.getMessage());
		}
	}
	
	// update contact lasttName if valid contactId and valid lastName or message user
	public void updateLastName(String contactId, String lastName) {
		try {
			// find contact to update by contactId
			Contact contactToUpdate = getContact(contactId);
			// if contact found try to update first name
			if (contactToUpdate != null) {
				contactToUpdate.setLastName(lastName);
			} else {  // if not found send message to user
				throw new IllegalArgumentException("Contact with contactId: " + contactId + " not found.");
			}
		} catch(Exception e) {  // if not valid value for lastName
			throw new IllegalArgumentException("Error updating contact because of " + e.getMessage());
		}
	}
	
	// update contact firstName if valid contactId and valid firstName or message user
	public void updatePhone(String contactId, String phone) {
		try {
			// find contact to update by contactId
			Contact contactToUpdate = getContact(contactId);
			// if contact found try to update first name
			if (contactToUpdate != null) {
				contactToUpdate.setPhone(phone);
			} else {  // if not found send message to user
				throw new IllegalArgumentException("Contact with contactId: " + contactId + " not found.");
			}
		} catch(Exception e) {  // if not valid value for phone
			throw new IllegalArgumentException("Error updating contact because of " + e.getMessage());
		}
	}
	
	// update contact address if valid contactId and valid firstName or message user
	public void updateAddress(String contactId, String address) {
		try {
			// find contact to update by contactId
			Contact contactToUpdate = getContact(contactId);
			// if contact found try to update first name
			if (contactToUpdate != null) {
				contactToUpdate.setAddress(address);
			} else {  // if not found send message to user
				throw new IllegalArgumentException("Contact with contactId: " + contactId + " not found.");
			}
		} catch(Exception e) {  // if not valid value for address
			throw new IllegalArgumentException("Error updating contact because of " + e.getMessage());
		}
	}

	// returns contact found where contactId's are equal or return null if not found
	public Contact getContact(String contactId) {
		Contact foundContact = null;
		for (Contact contact : contacts) {
			if (contact.getContactId().equals(contactId)) {
				foundContact = contact;
			}
		}
		return foundContact;
	}
}
