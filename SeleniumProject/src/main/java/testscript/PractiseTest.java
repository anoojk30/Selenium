package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PractiseTest extends Base {
	
	public void inputForm()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField = driver.findElement(By.id("single-input-field"));
		messageField.sendKeys("Welecome");//to pass the value
		WebElement showmessage = driver.findElement(By.id("button-one"));
		showmessage.click();//to click the show message button
		System.out.println(showmessage.getText());
		System.out.println(showmessage.getAttribute("id"));
		System.out.println(showmessage.getTagName());
			
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PractiseTest practisetest=new PractiseTest();
		practisetest.intializeBrowser();
		practisetest.inputForm();
		

	}

}
