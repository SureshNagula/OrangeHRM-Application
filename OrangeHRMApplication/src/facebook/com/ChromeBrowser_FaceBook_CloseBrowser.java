package facebook.com;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_FaceBook_CloseBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".");
		
		ChromeDriver Facebook = new ChromeDriver();
		
		Facebook.get("http://facebook.com");
		
		Facebook.navigate().to("http://bing.com");
		
		Facebook.get("http://youtube.com");
		
		//Facebook.close();
		
		Facebook.quit();
		
		
		
	}
	
	
	

}
