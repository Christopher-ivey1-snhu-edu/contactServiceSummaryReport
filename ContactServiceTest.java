package Contact;


import org.junit.Test;
import static org.junit.Assert.*;

public class ContactServiceTest {
	  String contactID="Mister C";
	  String firstName="Mister";
	  String lastName="C";
	  String phone="7023664613";
	  String address="35 boulder hwy Las Vegas,NV";
	  
		@Test
	   public void testForContacts() {

	    Contact contactTest = new Contact(contactID);	     
	     contactTest.setFirstName(firstName);	     
	     contactTest.setLastName(lastName);	     
	     contactTest.setPhone(phone);	     
	     contactTest.setAddress(address);
         
         ContactService service = new ContactService();
         
         assertTrue(service.addContact(contactTest));
         assertTrue(service.deleteContact(contactID));

	     
	   }


       @Test
	   public void testForUpdates() {

        Contact contactTest = new Contact(contactID);	
          ContactService service = new ContactService();
	    //ContactService contactTest = new ContactService(contactID);	     
	     service.updateFirstName(contactID,firstName);	     
	     service.updateLastName(contactID,lastName);	     
	     service.updatePhone(contactID,phone);	     
	     service.updateAddress(contactID,address);
         
        // ContactService service = new ContactService();
         
         assertEquals("Mister", contactTest.getFirstName());
         assertEquals("C", contactTest.getLastName());
         assertEquals("7023664613", contactTest.getPhone());
         assertEquals("35 boulder hwy Las Vegas,NV", contactTest.getAddress());
	     
	   }

	  
	}// end class

