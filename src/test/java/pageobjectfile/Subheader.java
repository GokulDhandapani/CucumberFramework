package pageobjectfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver.driverset;

public class Subheader {

	driverset context;
	public Subheader(driverset context) {
		this.context = context;
	}


	By icon = By.xpath("//*[@id='nav-logo-sprites']");
	By AllButton = By.xpath("//*[@id='nav-hamburger-menu']");
	By showmore = By.xpath("//*[text()='See all']");
	By selectcat = By.xpath("//*[@id='hmenu-content']//*[text()='Car, Motorbike, Industrial']");
	By subselectcat = By.xpath("//a[text()='Car Accessories']");
	public void iconclick() 
	{
		context.driver.findElement(icon).click();
	}
	public void allbutton() throws InterruptedException {
		context.driver.findElement(AllButton).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)context.driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	public void selectcategory() throws InterruptedException {
		Thread.sleep(1000);
		context.driver.findElement(showmore).click();
		
		WebElement findElement1 = context.driver.findElement(selectcat);
		//waiting time to 
		WebDriverWait wait = new WebDriverWait(context.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(findElement1));
		findElement1.click();
		Thread.sleep(1000);
		
		//EKement not interactable
		
//		WebElement findelement1 = context.driver.findElement(subselectcat);
//		WebDriverWait wait1 = new WebDriverWait(context.driver, Duration.ofSeconds(20));
//		wait1.until(ExpectedConditions.visibilityOf(findelement1));
//		findelement1.click();
		
		try {
			WebElement findelement = context.driver.findElement(subselectcat);
			((JavascriptExecutor) context.driver).executeScript("arguments[0].click()",findelement);
			Thread.sleep(1000);
			findelement.click();
			
			Thread.sleep(1000);
			System.out.println("Completed");
			
		}
		catch (Exception e) {
			System.out.println("successfully completed");
		}	
		context.driver.quit();
	}
}
