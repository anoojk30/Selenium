package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment3 extends Base {
	
	public void radiobutton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement button=driver.findElement(By.cssSelector("input#inlineRadio1"));
		if(!button.isSelected())
		{
			button.click();
			System.out.println("Radiobutton is Selected");
		}
		else
		{
		
			System.out.println("Radio button not Selected");
		}
		button.click();
		
	}
	/*public void checkbox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement button1=driver.findElement(By.id("check-box-one"));
		if(button1.isSelected())
		{
			button1.click();
			System.out.println("Checkbox is Deselected");
			
		}
		else
		{
			button1.click();
			System.out.println("checkbox is Selected");
		}
			
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 assignment3=new Assignment3();
		assignment3.intializeBrowser();
		assignment3.radiobutton();
		//assignment3.checkbox();

	}

}
