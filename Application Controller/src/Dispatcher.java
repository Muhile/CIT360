
public class Dispatcher {
	private HomeView homeView;
	private AboutView aboutView;
	private ContactUsView contactUsView;
	private ProductsView productsView;

	public Dispatcher() {
		homeView = new HomeView();
		aboutView = new AboutView();
		contactUsView = new ContactUsView();
		productsView = new ProductsView();
		
	}
	
	public void dispatch(String request) {
		if(request.equalsIgnoreCase("ABOUT")) {
			aboutView.show();
		}
		else if (request.equalsIgnoreCase("CONTACT US")) {
			contactUsView.show();
		}
		else if (request.equalsIgnoreCase("PRODUCTS")) {
			productsView.show();
		}
		else {
			homeView.show();
		}
	}
}
