package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseEdge {
	
	public WebDriver Driver;
	public void intializeBrowser()
	{
		Driver=new EdgeDriver();
		Driver.get("https://selenium.qabible.in/");
		Driver.manage().window().maximize();
	}
	public void driverQuitAndClose()
	{
		//Driver.quit();
		Driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseEdge base=new BaseEdge();
		base.intializeBrowser();
		base.driverQuitAndClose();

	}

}
