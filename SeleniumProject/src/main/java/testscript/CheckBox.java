package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement element=driver.findElement(By.id("gridCheck"));
		//System.out.println(element.isSelected());
		element.click();
		System.out.println(element.isSelected());//to check checkbox selected or not
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckBox checkbox=new CheckBox();
checkbox.intializeBrowser();
checkbox.checkBox();
	}

}
