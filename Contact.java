package Contact;

public class Contact {
	  private String contactID; 
	  private String firstName;
	  private String lastName;
	  private String phone;
	  private String address;
	  
	  public Contact(String id) {
          if(id != null && id.length() <= 10)
              this.contactID = id;
          else 
              System.out.println("ID should not be greater than 10 char");
          firstName = "";
          lastName = "";
          phone = "";
          address = "";
      }
	  public String getContactID () {
	    return contactID;
	    }	  
	  public String getFirstName  () {
	    return firstName;
	    }
	  public String getLastName () {
	    return lastName;
	    }
	  public String getPhone () {
	     return phone;
	    }
	  public String getAddress() {
	     return address;
	    }
	    public void setFirstName(String N)
	    {
            if(N != null && N.length() <= 10)
                this.firstName = N;
            else
                System.out.println("first name should not be greater than 10 char");	 
	    }// Method 2 - Setter
	    public void setLastName(String N)
	   {
            if(N != null && N.length() <= 10)
                this.lastName = N;
            else
                System.out.println("last name should not be greater than 10 char");	 
	    }
	 // Method 2 - Setter
	    public void setPhone(String N)
	    {
            if(N != null && N.length() == 10)
                this.phone = N;
            else
                System.out.println("phone number should be exactly 10 char");	 
	    }
	 // Method 2 - Setter
	    public void setAddress(String N)
	    {
            if(N != null && N.length() <= 30)
                this.address = N;
            else
                System.out.println("address should not be greater than 30 char");	 
	    }

}