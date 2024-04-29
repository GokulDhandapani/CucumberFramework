package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjectfile.Subheader;
import webdriver.driverset;

public class featurefile2
{
	public driverset context;
	public featurefile2(driverset context)

	{
	this.context = context;	
	}
	
	@Given("Return back to home page")
	public void return_back_to_home_page() throws InterruptedException {
	  Subheader sub = new Subheader(context);
	  sub.iconclick();
	  sub.allbutton();
	}
	@When("click the all in subheader menu")
	public void click_the_all_in_subheader_menu() throws InterruptedException {
		  Subheader sub1 = new Subheader(context);
		   sub1.selectcategory();
	}

}
