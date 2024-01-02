package com.Jqueri_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Base_Test.Jquery_Base_Test;

public class Jqueri_Test extends Jquery_Base_Test
{

	@Test
	public void dragAndDropTest()
	{


	// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
	// Identifying the Frame of the WebPage
	By webPageFrameProperty=By.className("demo-frame");
	WebElement webPageFrame=driver.findElement(webPageFrameProperty);

	// getting into the Frame of the WebPage - to identify the element in the Frame

	driver.switchTo().frame(webPageFrame);

	// id="draggable"
	// id="draggable"

	By dragMeToMyTargetProperty=By.id("draggable");
	WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);

	// id="droppable"
	By dropHereProperty=By.id("droppable");
	WebElement dropHere=driver.findElement(dropHereProperty);

	Actions drag = new Actions(driver);
			
	drag.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
	
	driver.switchTo().defaultContent();
	
	//<a href="https://jqueryui.com/selectable/">Selectable</a>
	
	By selectableProperty=By.linkText("Selectable");
	WebElement selectable=driver.findElement(selectableProperty);
	selectable.click();
	
	
	}
	
}
	
	
	

