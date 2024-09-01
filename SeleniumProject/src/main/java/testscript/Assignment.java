package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment extends Base {
	
	public void inputForm1(){
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entervalue = driver.findElement(By.id("value-a"));
		entervalue.sendKeys("1");
		WebElement entervalue1 = driver.findElement(By.id("value-b"));
		entervalue1.sendKeys("2");
		WebElement getTotal = driver.findElement(By.id("button-two"));
		getTotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assignment assignment=new Assignment();
assignment.intializeBrowser();
assignment.inputForm1();

	}

}
