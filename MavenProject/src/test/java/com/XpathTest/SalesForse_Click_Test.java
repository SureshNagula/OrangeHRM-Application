package com.XpathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.testng.annotations.Test;

import com.Base_Test.SalesForce_BaseTest;

public class SalesForse_Click_Test extends SalesForce_BaseTest{
	
	
	//<hgf-c360nav locale="in" search="true" show-region-selector="true" context-nav-enabled="false" hide-login="false" truly-hide-login="false" show-button-main="true" show-button-secondary="false" hide-contact="false" origin="https://wp.sfdcdigital.com/en-in/wp-json">
  //  </hgf-c360nav>
	
	//<span class="nav-item-label--l1" slot="start">Products</span>
	
	//tagname[text()='textvalue']
	
	//span[text()='Products']
	//hgf-c360nav[locale='in']
	@Test
	public void sales() {
	By loginProperty=By.cssSelector("hgf-c360nav[locale='in']");

	SearchContext login=driver.findElement(By.cssSelector("hgf-c360nav[locale='in']"));
	
	}
	
}
