package pageobjectfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import webdriver.driverset;


public class Header {
	driverset context; 
	

By enteramazon = By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb N8QANc Va3FIb EE3Upf']");
By search = By.xpath("//*[contains(@id,'twotabsearchtextbox')]");
By Cart = By.xpath("//*[contains(@id,'nav-cart')]");
By language = By.xpath("");
By subheader = By.xpath("//a[@aria-label='Mobiles & Accessories, You are currently on a drop-down. To open this drop-down, Press Enter.']");
By SHOnepluse = By.xpath("//a[text()='OnePlus']");
By Gettext = By.xpath("//*[contains(@class,'_bXVsd_gridColumn_2Jfab')]/child::div//*[contains(text(),'Apple iPhone 15 (256 GB) - Green')]");


public Header(driverset context) {
	this.context = context;
}

public void getlink() throws InterruptedException
{
	
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor)context.driver;
	js.executeScript("window.scrollBy(0,1000)");
	
////	js.executeScript("Window.scrollTO(0,document.body.scrollHeight)");
//	WebElement oneplus = driver.findElement(By.xpath("//span[text()='Up to 35% off | Inverters & batteries combo']"));
//	js.executeScript("arguments[0].scrollIntoview();",oneplus);
	
System.out.println("Succesfully Lauched and scrolled");	
}

public void productsearch() throws InterruptedException {

	Thread.sleep(2000);
	WebElement input = context.driver.findElement(search);
	input.sendKeys("Mobilephone");
	Thread.sleep(1000);
	input.submit();
}

public String checkcart()
{
	String text = context.driver.findElement(Gettext).getText();
	context.driver.findElement(Cart).click();
	return text;
}

public void subheader()	 {
//	WebElement mobilebrand = driver.findElement(subheader);
//	Actions new1 = new Actions(driver);
//	new1.moveToElement(mobilebrand);
//	driver.findElement(SHOnepluse).click();
}
}
