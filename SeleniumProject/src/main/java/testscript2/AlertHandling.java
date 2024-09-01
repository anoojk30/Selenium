package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base {
	
	/*public void simplealert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simpleclick=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simpleclick.click();
		driver.switchTo().alert().accept();//ok-accept//cancel-dismiss
	}*/
	/*public void confirmationalert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simpleclick2=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		simpleclick2.click();
		driver.switchTo().alert().accept();
	}*/
	public void promptalert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simpleclick3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		simpleclick3.click();
		driver.switchTo().alert().sendKeys("Anooj");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AlertHandling alerthandling=new AlertHandling();
alerthandling.intializeBrowser();
alerthandling.promptalert();
//alerthandling.simplealert();
//alerthandling.confirmationalert();

	}

}
