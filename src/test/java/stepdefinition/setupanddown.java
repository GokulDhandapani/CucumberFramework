package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webdriver.driverset;

public class setupanddown {
	public driverset context;
	public setupanddown(driverset context) {
		this.context= context;
	}
	@Before
	public void browsersetup() {
		context.driver = new ChromeDriver();
		context.driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10531127569585288882&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9298694&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");	
		context.driver.manage().window().maximize();
	}
	@After
	public void driverquit() {
		context.driver.quit();	
	}
}
