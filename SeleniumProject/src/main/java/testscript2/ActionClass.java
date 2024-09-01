package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class ActionClass extends Base {
	
	public void actionClass()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).build().perform();// to moveelement
		actions.doubleClick(drag).build().perform();// to double click
		actions.contextClick(drag).build().perform();//to rightclick
		actions.dragAndDrop(drag, drop).build().perform();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ActionClass actionclass=new ActionClass();
		actionclass.intializeBrowser();
		actionclass.actionClass();

	}

}
