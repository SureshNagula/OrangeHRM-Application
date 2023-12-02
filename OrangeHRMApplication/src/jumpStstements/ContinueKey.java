package jumpStstements;

public class ContinueKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i +" Webdriver ");
			if(i==3)
			{
				System.out.println(i +" Selenium ");
				continue;
				
			}
			System.out.println(i +" Loadrunner");
		}
	
		
System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$ ");
		
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(i+" Selenium ");
			if(i==3)
			{
				System.out.println(i+" WebDriver ");
				continue;
			}
			System.out.println(i+" LoadRunner ");
			
		}
		
		
		
	}

}
