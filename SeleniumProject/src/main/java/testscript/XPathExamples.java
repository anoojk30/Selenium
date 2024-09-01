package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathExamples extends Base {

	public void relativexpath() {
		//Relative xpath
		//Syntax
		//tagname[@attributetype='value']
		
		WebElement message = driver.findElement(By.xpath("//input[@placeholder='Message']"));
		/*
		 Absolute Xpath
		/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
		*/
		
		/*
		 * Dynamic xpath
		 * 1.contains
		 * 
		 * 2.text
		 */
		
	}
public void dynamicXPath() {
		//contains
		WebElement showmessage = driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		
		//text
		WebElement showmessage1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
	}
/* Xpath Axes methods
 * 
 *tagname[@attribute='value']//axesmethodname::tagname
		 
 * 1. Parent
 * driver.findElement(By.xpath("//button[text()='Show Message']//parent::form"));  give tag or xpath
 * 2. Child
 * //a[@class='navbar-brand']//child::img[@alt='logo'] give tag or xpath
 * 3. Following
 * //input[@type='text']//following::input
 * 4. indexing
 * //form[@method='POST'][1]
 * *parent 
		 *child 
		 *ancestor 
		 *descendant 
		 *following 
		 //select[@id="single-input-field"]//following::select
		 * 
		 * preceding
		 * //select[@id="multi-select-field"]//preceding::select
		 * * preceding - sibling
		 * //select[@id="single-input-field"]//option[@value="Yellow"]//preceding-sibling::option
		 * 
		 * following - sibling
		 * 
		 * //select[@id="single-input-field"]//option[@value="Yellow"]//following-sibling::option
 */
//Parent
	WebElement formpost = driver.findElement(By.xpath("//div[@id='message-one']//parent::form"));
	WebElement valueb = driver.findElement(By.xpath("//input[@id='value-b']//parent::div"));
	WebElement valuea = driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));

//Child
	WebElement logo = driver.findElement(By.xpath("//div[@class='top-logo']//child::a"));
//Indexing
	WebElement message = driver.findElement(By.xpath("//input[@type='text'][1]"));
	WebElement avalue = driver.findElement(By.xpath("//input[@type='text'][2]"));
	WebElement bvalue = driver.findElement(By.xpath("//input[@type='text'][3]"));
	//starts with
	//tag[starts-with(@attribute,'value')]
	WebElement starts=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	//and & or 
	//tag[@attribute='value' and @attribute='value']
	//tag[@attribute='value' or @attribute='value']
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XPathExamples xpathexamples=new XPathExamples();
		xpathexamples.intializeBrowser();
		//xpathexamples.relativexpath();
		xpathexamples.dynamicXPath();
		xpathexamples.driverQuitAndClose();
		
		

	}

}
