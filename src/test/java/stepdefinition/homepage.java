package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjectfile.Header;
import webdriver.driverset;

public class homepage {
	public setupanddown start;
	public driverset context;
	
	
	public homepage(driverset context) {
		this.context = context;
	}
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() throws InterruptedException {
		Header H = new Header(context);
		H.getlink();
		
	}
	
	@Given("Get the Search field box")
	public void get_the_search_field_box() throws InterruptedException {
		Header H = new Header(context);
		H.productsearch();
		
		String checkcart = H.checkcart();
		System.out.println(checkcart);
	}
	
	@When("enter the product name")
	public void enter_the_product_name() {
		
			   
	}
	
}
