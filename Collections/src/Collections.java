// Imports
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a set
		Set <String> cookies = new HashSet();
		
		// Adding values to set
		cookies.add("Chocolate Chip");
		cookies.add("Oatmeal Raisin");
		cookies.add("Peanut Butter");
		
		// Creating a list
		List <String> icecream = new ArrayList();
		
		// Adding values to list
		icecream.add("Banana Float");
		icecream.add("Bunny Tracks");
		icecream.add("Cookie Dough");
		
		// Adding values to list from set
		icecream.addAll(cookies);
		
		HashMap<String, Integer> quantities = new HashMap<String, Integer>();
		
		quantities.put("Chocolate Chip", 5);
		quantities.put("Peanut Butter", 10);
		quantities.put("Banana Float", 3);
		
		System.out.println("The types of cookies in this store are: " + cookies);
		System.out.println("The icecream flavors in this store are: " + icecream);
		System.out.println("We have " + quantities.get("Peanut Butter") + " Peanut Butter Cookies left");
		System.out.println("We have " + quantities.get("Banana Float") + " Banana Float Icecream waffles left");
	}

}
