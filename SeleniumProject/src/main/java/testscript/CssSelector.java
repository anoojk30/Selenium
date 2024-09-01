package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{
	public void tagId() //tag#id 
	{

		WebElement element= driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement element1=driver.findElement(By.cssSelector("input#value-a"));
		WebElement element2=driver.findElement(By.cssSelector("input#value-b"));
		WebElement element3=driver.findElement(By.cssSelector("button#button-two"));
		
	}
	public void tagClass()//tag.class 
	{
		WebElement element4=driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement element5=driver.findElement(By.cssSelector("button.btn"));
		WebElement element6=driver.findElement(By.cssSelector("textarea.form-control"));
		WebElement element7=driver.findElement(By.cssSelector("input.btn"));
	
	}
	public void tagAndAttribute() //tag[attribute=value]
	{
	WebElement element8=driver.findElement(By.cssSelector("button[id=button-one]"));
	WebElement element9=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	WebElement element10=driver.findElement(By.cssSelector("button[id=button-two]"));
	WebElement element11=driver.findElement(By.cssSelector("button[id=button-two]"));
	}
	

	public void tagClassAndAttribute() //tag.classname[attribute=value]
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CssSelector cssselector=new CssSelector();
cssselector.intializeBrowser();
cssselector.tagId();
cssselector.tagClass();
cssselector.tagClassAndAttribute();
cssselector.driverQuitAndClose();
	}

}
