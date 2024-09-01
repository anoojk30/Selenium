package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment1 extends Base {
	
	public void checkbox()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement element=driver.findElement(By.xpath("//input[@value='option-3']"));
		element.click();
		System.out.println(element.isSelected());
		
	}
	public void radiobutton()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement element1=driver.findElement(By.xpath("//input[@value='green']"));
		System.out.println(element1.isSelected());
		element1.click();
	}
	
	public void message(){
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement element2=driver.findElement(By.id("single-input-field"));
	System.out.println(element2.isEnabled());
	element2.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assignment1 assignment1=new Assignment1();
assignment1.intializeBrowser();
assignment1.checkbox();
assignment1.radiobutton();
assignment1.message();
	}

}
