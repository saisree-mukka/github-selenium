package com.cg.gd.Main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	private WebDriver driver;
	@Before(order=1)
	public void setupStepENV() {
		System.out.println("setupStepENV");
		System.setProperty("webdriver.chrome.driver","D:\\Saisree Mukka\\chromedriver.exe");
	}
//
//	@Before(order=2)
//	public void setupStepENV2() {
//		System.out.println("setupStepENV2");
//	}
//
//	@Given("^user wants to access the login Page 'www\\.github\\.com'$")
//	public void user_wants_to_access_the_login_Page_www_github_com() throws Throwable {
//		driver=new ChromeDriver();
//	}
//
//	@When("^user will open google chrome$")
//	public void user_will_open_google_chrome() throws Throwable {
//		driver.get("https://www.google.com");
//	}
//
//	@When("^enters the url 'www\\.github\\.com'$")
//	public void enters_the_url_www_github_com() throws Throwable {
//	    
//	}
//
//	@Then("^display the github page 'www\\.github\\.com'$")
//	public void display_the_github_page_www_github_com() throws Throwable {
//		String actualTitle=driver.getTitle();	
//		Assert.assertEquals("Github", actualTitle);
//	}

	@Given("^user wants to logged in 'www\\.github\\.com'$")
	public void user_wants_to_logged_in_www_github_com() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
	}

	@When("^user enters valid Username$")
	public void user_enters_valid_Username() throws Throwable {
		 WebElement element1=driver.findElement(By.id("login_field"));
		 element1.sendKeys("mukkawarsaisree@gmail.com");
	}

	@When("^user Enters valid password$")
	public void user_Enters_valid_password() throws Throwable {
		 WebElement element2=driver.findElement(By.id("password"));
		 element2.sendKeys("saisree@169");
		 element2.submit();
		 
	}

	@Then("^user must me redirecyted to 'www\\.github\\.com' and message$")
	public void user_must_me_redirecyted_to_www_github_com_and_message() throws Throwable {
		
	    //driver.get("https://github.com/saisree-mukka");
	}

	@When("^user enters Invalid Username$")
	public void user_enters_Invalid_Username() throws Throwable {
		 WebElement element1=driver.findElement(By.id("login_field"));
		 element1.sendKeys("mukkaware@gmail.com");
	}

	@When("^user Enters Invalid password$")
	public void user_Enters_Invalid_password() throws Throwable {
		WebElement element2=driver.findElement(By.id("password"));
		 element2.sendKeys("sai");
		 element2.submit();
	}

	@Then("^user must display error message$")
	public void user_must_display_error_message() throws Throwable {
		//driver.get("https://github.com/login");
	}


}
