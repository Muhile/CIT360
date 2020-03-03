import java.util.Scanner;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrontController frontController = new FrontController();
//		frontController.dispatchRequest("HOME");
//		frontController.dispatchRequest("CONTACT US");
//		frontController.dispatchRequest("PRODUCTS");
//		frontController.dispatchRequest("ABOUT");

		Scanner input = new Scanner(System.in);
				
		System.out.println("Page selections: Home, contact us, products, about. ");
		System.out.println("Enter a Page you want to go to: ");
				
		String page = input.next();
		
		frontController.dispatchRequest(page);
	
	}

}
