package hello;

//This class executes code in the main method to display restaurant information
public class Listing {
	
	public static void main(String[] args) {
		
		try {
		//Create restaurant with sample information for name and address
		Restaurant bobsBBQ = new Restaurant("Bob's BBQ", "820 Main St", "Colorado Springs", "CO", 00030);

		//Print string returned by Restaurant method listRestaurantInfo()
		System.out.println(bobsBBQ.listRestaurantInfo());
		
		//Second test case to demonstrate input validation
		Restaurant pizzaPalace = new Restaurant("Pizza Palace", "39 Main St", "New York", "NY", 19999999);
		System.out.println(pizzaPalace.listRestaurantInfo());
		}
		
		//Catch any exceptions and print the descriptive message
		catch(Exception e) {
			System.out.println("Something Went Wrong: " + e.getMessage());
		}
	}
	
}

