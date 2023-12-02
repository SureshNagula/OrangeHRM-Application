package identifyingTheTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class BingHomePageTitleValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".");
		
		ChromeDriver chromeBrowser = new ChromeDriver();
		
		
		chromeBrowser.navigate().to("http://bing.com");
		
		String expected_BingHomePageTitle="bing";
		
		System.out.println(" The Expected Title of the Bing Home Page is = "+expected_BingHomePageTitle);
		
		String actual_BingHomePageTitle=chromeBrowser.getTitle();
		
		System.out.println("The  Actual Title oF Bing Home Page Is ="+actual_BingHomePageTitle);
		
		
		
		
		if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
		{
			System.out.println("The Title Of the Bing Home Page Is Matched - Pass");
			
		}
		else
		{
			System.out.println("The Title Of the Bing Home Page Is Not Matched - fail");
		}
		
		
		chromeBrowser.close();
		
		
	}

}
