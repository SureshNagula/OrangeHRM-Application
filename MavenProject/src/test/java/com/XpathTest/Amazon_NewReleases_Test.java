package com.XpathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base_Test.AmazonBase_Test;

public class Amazon_NewReleases_Test extends AmazonBase_Test {
	
	@Test
	public void newReleasesTest()
	{
		//<a href="/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3" class="hmenu-item">New Releases</a>
		
		// 1.//tagname[contains(text(),'partialtextvalue')]
     //a[contains(text(),'New')]
		
		By newRealeasesProperty=By.xpath("//a[contains(text(),'New')]");
		WebElement newrelease=driver.findElement(newRealeasesProperty);
		newrelease.click();
	}

}
