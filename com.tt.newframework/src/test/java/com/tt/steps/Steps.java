package com.tt.steps;

import org.openqa.selenium.By;

import com.tt.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends BaseClass  {// Inheritence implements
	
	
	@Given("^As user i want to open browser$")
	public void as_user_i_want_to_open_browser() throws Throwable {
		
		driver = getDriver();
	  
	  
	}

	@When("^As user i want click login button$")
	public void as_user_i_want_click_login_button() throws Throwable {
	   driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
	  
	}

	@When("^I put valid user name$")
	public void i_put_valid_user_name() throws Throwable {
 driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("habib_mdahasan@yahoo.com");
 
	  
	}

	@When("^I put valid password$")
	public void i_put_valid_password() throws Throwable {
	 driver.findElement(By.xpath("//*[@class='orko-button-primary orko-button']")).click();  
	  
	}

	@Then("^As user i loged succesfully$")
	public void as_user_i_loged_succesfully() throws Throwable {
	   
	  
	}

	
		
	}


