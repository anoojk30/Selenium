package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void id() {
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		//By is a class used to locate a webelement
		//id() etc are methods of By class
		//findElement is a method used to locate a single webelement on a webpage
	
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement entervaluea=driver.findElement(By.id("value-a"));
		WebElement gettotal=driver.findElement(By.id("button-two"));
		WebElement entervalueb=driver.findElement(By.id("value-b"));
	}
	public void name() {
		WebElement author=driver.findElement(By.id("author"));
		WebElement descri=driver.findElement(By.id("description"));
		WebElement keyword=driver.findElement(By.id("keywords"));
		WebElement view=driver.findElement(By.id("viewport"));
	}
	/*public void tagName() {
		//to find elements
		 * WebElement entervalueb=driver.findElement(By.tagName("img"));
	}
	}*/
	public void className() {
		WebElement singleinputfield=driver.findElement(By.className("clearfix"));
		WebElement container=driver.findElement(By.className("container page"));
		WebElement mt=driver.findElement(By.className("mt-5"));
		WebElement col=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
		WebElement lis=driver.findElement(By.className("list-group list-group-flush"));
		
	}
	public void linkText() {
		WebElement simpleform=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkbox=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement radiobutton=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement select=driver.findElement(By.linkText("Select input"));
		WebElement form=driver.findElement(By.linkText("Form Submit"));
		WebElement ajax=driver.findElement(By.linkText("Ajax Form Submit"));
		
	}
	public void partialLinkTest()
	{
		WebElement simpleform=driver.findElement(By.linkText("Simple Form o"));
		WebElement checkbox=driver.findElement(By.linkText("Checkbox D"));
		WebElement radiobutton=driver.findElement(By.linkText("Radio Buttons D"));
		WebElement select=driver.findElement(By.linkText("Select i"));
		WebElement form=driver.findElement(By.linkText("Form "));
		WebElement ajax=driver.findElement(By.linkText("Ajax Form"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators locators=new Locators();
		locators.intializeBrowser();
		locators.id();
		locators.driverQuitAndClose();

	}

}
