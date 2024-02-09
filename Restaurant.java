package hello;

//This class contains information about a restaurant to 
public class Restaurant {
	//Declare variables that will be used to store a restaurants name and address
	//Variables are public so they can be accessed in the class that will run the program
	private String restaurantName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	
	
	//default constructor initializes String variables to null and int variables to 0
	public Restaurant() {
		
		this.restaurantName = null;
		this.streetAddress = null;
		this.city = null;
		this.state = null;
		this.zipCode = 0;
		
	}
	
	//Parameterized constructor that allows the object to be created with variables initialized
	public Restaurant(String name, String street, String city, String state, int zipCode) {
		
		try {
			//Validate the constructor arguments, checking for null fields and invalid zip codes. 
			//If invalid data is detected, throw descriptive errors
			if(name == null) {
				throw new Exception("Missing Restaurant Name");
			}
			if(street == null) {
				throw new Exception("Missing Street Address");
			}
			if(city == null) {
				throw new Exception("Missing City");
			}
			if(state == null) {
				throw new Exception("Missing State");
			}
			if(zipCode < 1 || zipCode > 99950) {
				throw new Exception("Invalid Zip Code! Zip Codes Must Be Between 00000 and 99950");
			}
			
			//Assign public variables with validated data passed to constructor
			this.restaurantName = name;
			this.streetAddress = street;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		
		}
		//Catch any thrown exceptions and print the descriptive message
		catch(Exception e) {
			
			System.out.println("Constructor Failed: " + e.getMessage());
			
		}
	}
	
	//This method returns restaurant information in the desired format
	public String listRestaurantInfo() {
		
		//Format zipCode as a string with 5 values. Postal codes can have leading zeroes, 
		//so this is necessary to display the full postal code in some cases.
		String zipCodeString = String.format("%05d", zipCode);
		/*Print the information, formatting in accordance with the assignment instructions:
		 * Restaurant Name
		 * Street Address
		 * City, State Zip
		 */
		return (this.restaurantName + "\n" + this.streetAddress + "\n" + this.city + ", " + this.state + " " + zipCodeString);

		
	}

}

