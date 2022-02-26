package Contact;

import org.junit.Test;
import static org.junit.Assert.*;

public class contactTest{
  
  String contactID="Mister C";
  String firstName="Mister";
  String lastName="C";
  String phone="7023664613";
  String address="35 boulder hwy LAs Vegas,NV";
  
	@Test
   public void testForContacts() {

    Contact contactTest = new Contact(contactID);
       
     assertEquals("Mister C", contactTest.getContactID());
  
     assertNotNull(contactTest.getFirstName());
     assertNotNull(contactTest.getLastName());
     assertNotNull(contactTest.getPhone());
     assertNotNull(contactTest.getAddress());
     
     contactTest.setFirstName(firstName);
     assertEquals("Mister", contactTest.getFirstName());
     contactTest.setLastName(lastName);
     assertEquals("C", contactTest.getLastName());
     contactTest.setPhone(phone);
     assertEquals("7023664613", contactTest.getPhone());
     contactTest.setAddress(address);
     assertEquals("35 boulder hwy LAs Vegas,NV", contactTest.getAddress());
   
     
   }
  
}// end class