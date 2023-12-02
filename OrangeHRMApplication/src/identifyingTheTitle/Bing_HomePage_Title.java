package identifyingTheTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_HomePage_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/broserDriveFiles/chromedriver.exe");

		ChromeDriver chromeBrowser = new ChromeDriver();
		
		chromeBrowser.get("http://bing.com");
		
		 String actual_BingHomePageTitle=chromeBrowser.getTitle();
		 
		 System.out.println(" The Actusl Title of the Bing Home Page is ="+actual_BingHomePageTitle);
		 
		 chromeBrowser.close();

	}

}
