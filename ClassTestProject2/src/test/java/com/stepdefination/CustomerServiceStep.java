package com.stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerServiceStep extends Base {
	@Given("^user able to home page$")
	public void user_able_to_home_page() throws Throwable {
		getdriver();
	}

	@When("^user able to click customer service$")
	public void user_able_to_click_customer_service() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'customer service')]")).click();

	}

	@Then("^user should go customer service page successfully$")
	public void user_should_go_customer_service_page_successfully() throws Throwable {
		Assert.assertEquals(driver.getTitle(),"Amazon.com Help: Help & Customer Service");
		
	}

}
