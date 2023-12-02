package capturingURLAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_CapturingHomePageURLAdress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String applicationUrlAdress="http://google.com";
		
		System.setProperty("webdriver.chrome.driver", ".");
		
		ChromeDriver chromeBrowser = new ChromeDriver();
		
		chromeBrowser.navigate().to(applicationUrlAdress);
		
		String actual_GoogleHomePageTitle=chromeBrowser.getTitle();
 System.out.println("The actual Title of The google Home Page Title is ="+actual_GoogleHomePageTitle);
 
 System.out.println(" The URL Adress Provided is ="+applicationUrlAdress);
 
 String actual_GoogleHomePageUrlAdress=chromeBrowser.getCurrentUrl();
 System.out.println("The Current URL Adress of The Google Home Page is ="+actual_GoogleHomePageUrlAdress);
		
		
		chromeBrowser.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
