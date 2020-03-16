import java.net.*;
import java.io.*;

public class httptrial {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// This line creates the object and then stores the data we need to access the web page
		URL theWebPage = new URL("https://www.w3schools.com");
		
		// This opens up a communication to the web page that we want to communicate with
		HttpURLConnection seePage = (HttpURLConnection)theWebPage.openConnection();
		
		// 
		BufferedReader getThePage = new BufferedReader(new InputStreamReader(seePage.getInputStream()));
		
		// A string value for the while loop
		String httpCode;
		
		while((httpCode = getThePage.readLine()) != null) {
			if(httpCode.isEmpty() != true) {
				System.out.println(httpCode);
			} else {
				System.out.println("This is a blank line");
			}
		}
		
		getThePage.close();
	}

}
