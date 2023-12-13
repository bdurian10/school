package hello;

public class Listing {
	
	public static void main(String[] args) {
		
		Restaurant rest1 = new Restaurant("BBQ Bob", "820 Main St", "Colorado Springs, CO 80913");
		System.out.println(rest1.resName);
		System.out.println(rest1.streetAddress);
		System.out.println(rest1.cityState);
		
	}
}

