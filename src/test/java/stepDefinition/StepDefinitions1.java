package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions1 {
	WebDriver driver;
	@Given("^i open hrm url in chrome browser$")
	public void i_open_hrm_url_in_chrome_browser() throws Throwable {
	    driver = new ChromeDriver();
	    driver.get("http://orangehrm.qedgetech.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	}

	@When("^i enter  in username field$")
	public void i_enter_in_username_field() throws Throwable {
	  driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin"); 
	}

	@When("^i enter in password field$")
	public void i_enter_in_password_field() throws Throwable {
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Admin");
	   
	}



	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.cssSelector("#btnLogin")).click();
		Thread.sleep(5000);
	}

	@Then("^i validate url$")
	public void i_validate_url() throws Throwable {
	   String expected="dashboard";
	   String actual=driver.getCurrentUrl();
	   if(actual.equalsIgnoreCase(expected))
	   {
		   System.out.println("Login Success");
	   }
	   else
		   System.out.println("Login Fail");
	}

	@Then("^i close browser$")
	public void i_close_browser() throws Throwable {
	  driver.close();  
	}

}
