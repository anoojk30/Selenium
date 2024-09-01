package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class FileUpload extends Base {
	
	public void sendKeys() {
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement select=driver.findElement(By.xpath("//input[@id='file-upload']"));
		select.sendKeys("C:\\Users\\HP\\Downloads\\sodapdf-converted.pdf");
		WebElement submit=driver.findElement(By.xpath("//input[@id='file-submit']"));
		submit.click();
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload = new FileUpload();
		fileupload.intializeBrowser();
		fileupload.sendKeys();

	}

}
