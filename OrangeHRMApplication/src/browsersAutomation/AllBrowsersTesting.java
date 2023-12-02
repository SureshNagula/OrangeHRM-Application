package browsersAutomation;

   import org.openqa.selenium.chrome.ChromeDriver;
    //import org.openqa.selenium.edge.EdgeDriver;
    //import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsersTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","");
		
		ChromeDriver suresh = new ChromeDriver();
		
		
		suresh.get("http://bing.com");
		
		suresh.close();
		
		
//System.setProperty("webdriver.edge.driver", "./broserDriveFiles/msedgedriver.exe");

  //EdgeDriver suresh = new EdgeDriver(); 
  
//  suresh.get("http://bing.com");
  
 // suresh.close();

  		
		//System.setProperty("webdriver.gecko.driver", "./broserDriveFiles/geckodriver.exe");
		
		//FirefoxDriver suresh = new FirefoxDriver();
		
		
		//suresh.get("http://bing.com");
		// suresh.close();
		
  
		

	}

}
