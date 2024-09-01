package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AssignmentTable extends Base {
	public void rowprinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr[3]"));
				System.out.println(table.getText());
	}
	public void cellprinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement column=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
		System.out.println(column.getText());
	}
public void columnPrinting() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tablelist=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[3]"));
		for(WebElement menu:tablelist)
		{
		System.out.println(menu.getText());
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentTable assignmenttable=new AssignmentTable();
		assignmenttable.intializeBrowser();
		//assignmenttable.rowprinting();
		//assignmenttable.cellprinting();
		assignmenttable.columnPrinting();

	}

}
