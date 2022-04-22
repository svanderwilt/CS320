/**
 * @author Scott Vanderwilt
 * 
 * @date 3/19/2022
 * 
 * @course CSC 320
 * 
 * @description This is the test class for the Contact class
 */

package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;
class ContactTest {
	
	// verify that all the test values will create a contact
	@Test
	void testNoNullArgument() {
		Contact contact = new Contact("1001","Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
		assertNotNull(contact, "Contact was null");
	}

	// check if exception is thrown for null contactId
	@Test
	void testNullContactIdArgument() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null,"Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
		});
	}
	
	// check if exception is thrown for null firstName
	@Test
	void testNullFirstNameArgument() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001",null, "Vanderwilt","9165555555","Somewhere over the rainbow");
		});
	}
	
	// check if exception is thrown for null lastName
	@Test
	void testNullLastNameArgument() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001","Scott", null,"9165555555","Somewhere over the rainbow");
		});
	}
	
	// check if exception is thrown for null phone
	@Test
	void testNullPhoneArgument() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001","Scott", "Vanderwilt",null,"Somewhere over the rainbow");
		});
	}
	
	// check if exception is thrown for null address
	@Test
	void testNullAddressArgument() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1001","Scott", "Vanderwilt","9165555555",null);
		});
	}
	
	// check if exception is thrown for too long contactId
		@Test
		void testTooLongContactIdArgument() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("123432344444434343","Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
			});
		}
		
		// check if exception is thrown for too long firstName
		@Test
		void testTooLongFirstNameArgument() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1001", "ScottIsTheBest", "Vanderwilt","9165555555","Somewhere over the rainbow");
			});
		}
		
		// check if exception is thrown for too long lastName
		@Test
		void testTooLongLastNameArgument() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1001","Scott", "VanderwiltIsMyLast","9165555555","Somewhere over the rainbow");
			});
		}
		
		// check if exception is thrown for too long phone
		@Test
		void testTooLongPhoneArgument() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1001","Scott", "Vanderwilt","91655555555","Somewhere over the rainbow");
			});
		}
		
		// check if exception is thrown for too long address
		@Test
		void testTooLongAddressArgument() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("1001","Scott", "Vanderwilt","9165555555","this address is very long  somewhere in Egypt I guess");
			});
		}
		
		//check if exception is thrown for too long firstName on update
		@Test
		void testTooLongFirstNameUpdate() {
			Contact contact = new Contact("1001","Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				contact.setFirstName("ScottIsTheBest");
			});
		}
		
		//check if exception is thrown for too long lastName on update
		@Test
		void testTooLongLastNameUpdate() {
			Contact contact = new Contact("1001","Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				contact.setLastName("VanderwiltIsMyLast");
			});
		}
		
		//check if exception is thrown for too long phone on update
		@Test
		void testTooLongPhoneUpdate() {
			Contact contact = new Contact("1001","Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				contact.setPhone("91655555555");
			});
		}
		
		//check if exception is thrown for too long phone on update
		@Test
		void testTooLongAddressUpdate() {
			Contact contact = new Contact("1001","Scott", "Vanderwilt","9165555555","Somewhere over the rainbow");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				contact.setAddress("this address is very long  somewhere in Egypt I guess");
			});
		}
	
	

}
