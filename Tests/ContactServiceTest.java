/**
 * @author Scott Vanderwilt
 * 
 * @date 3/19/2022
 * 
 * @course CSC 320
 * 
 * @description This is the test class for the ContactService class
 */

package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {

	// test that contact creation is good
	@Test
	void testCreateContact() {
		// test that add contact with valid arugments adds new contact
		ContactService myContacts = new ContactService();
		String contactId = myContacts.addContact("Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
		assertNotNull(contactId, "contactId was null");
		
		// test that add contact with invalid firstName throws error
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.addContact(null, "Vanderwilt","9165555555","Somewhere over the rainbow");
		});
		
		// test that add contact with invalid lstName throws error
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.addContact("Scottt", null,"9165555555","Somewhere over the rainbow");
		});
		
		// test that add contact with invalid phone throws error
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.addContact("Scottt", "Vanderwilt",null,"Somewhere over the rainbow");
		});
		
		// test that add contact with invalid address throws error
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.addContact("Scottt", "Vanderwilt","9165555555",null);
		});
		
		
				
	}
	
	// test that contact deletion is good
	@Test
	void testDeleteContact() {
		// create valid contact to test deletion
		ContactService myContacts = new ContactService();
		String contactId = myContacts.addContact("Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
		// delete contact
		myContacts.deleteContact(contactId);
		// search for contactId and test equal to null
		Contact foundContact = myContacts.getContact(contactId);
		assertNull(foundContact, "contact was not deleted");
		
		// test that exception thrown on badid deletion
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.deleteContact("BadID");
		});
		
	}
	
	
	// test that update firstName is good
	@Test
	void testUpdateContactFirstName() {
		// create contact to be updated
		ContactService myContacts = new ContactService();
		String contactId = myContacts.addContact("Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
		// update and test that the first name of the contact equals the updated name
		myContacts.updateFirstName(contactId, "John");
		assertEquals("John", myContacts.getContact(contactId).getFirstName(), "First name is incorrect!");
		
		// test update first name with invalid argument
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.updateFirstName(contactId, null);
		});
		
		// test invalid or not found contactId throws exception
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.updateFirstName(null, "Peter");
		});
	}
	
	
	// test that update LastName is good
	@Test
	void testUpdateContactLastName() {
		// create contact to be updated
		ContactService myContacts = new ContactService();
		String contactId = myContacts.addContact("Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
		// update and test that the last name of the contact equals the updated name
		myContacts.updateLastName(contactId, "Williams");
		assertEquals("Williams", myContacts.getContact(contactId).getLastName(), "Last name is incorrect!");
		
		// test update last name with invalid argument
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.updateLastName(contactId, null);
		});
		
		// test invalid or not found contactId throws exception
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.updateLastName(null, "Williams");
		});
	}
	
	// test that update phone is good
	@Test
	void testUpdateContactPhone() {
		// create contact to be updated
		ContactService myContacts = new ContactService();
		String contactId = myContacts.addContact("Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
		// update and test that the phone number of the contact equals the updated name
		myContacts.updatePhone(contactId, "9165556666");
		assertEquals("9165556666", myContacts.getContact(contactId).getPhone(), "Phone is incorrect!");
		
		// test update phone number with invalid argument
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.updatePhone(contactId, null);
		});
		
		// test invalid or not found contactId throws exception
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			myContacts.updatePhone(null, "9165555555");
		});
	}
	
	// test that update address is good
		@Test
		void testUpdateContactAddress() {
			// create contact to be updated
			ContactService myContacts = new ContactService();
			String contactId = myContacts.addContact("Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
			// update and test that the address of the contact equals the updated name
			myContacts.updateAddress(contactId, "Let's go to Egypt");
			assertEquals("Let's go to Egypt", myContacts.getContact(contactId).getAddress(), "Address is incorrect!");
			
			// test update address with invalid argument
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				myContacts.updateAddress(contactId, null);
			});
			
			// test invalid or not found contactId throws exception
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				myContacts.updateAddress(null, "Somewhere over the rainbow");
			});
		}
		
		

}
