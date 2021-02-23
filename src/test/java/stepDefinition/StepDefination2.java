package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination2 {
	WebDriver driver;
	
	String url="http://orangehrm.qedgetech.com/";
	@Given("^user open url in \"([^\"]*)\" browser$")
	public void user_open_url_in_browser(String brw) throws Throwable {
		
	  if(brw.equalsIgnoreCase("chrome"))
	  {
		  System.out.println("Executing on Chrome");
		  driver= new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
	  }
	  else if(brw.equalsIgnoreCase("firefox"))
	  {
		  System.out.println("Executing on Firefox");
		  driver = new FirefoxDriver();
		  driver.get(url);
	  }
	  else
	  {
		  try{
		  throw new IllegalArgumentException("Browser value is not matching");
		  }catch(Throwable t)
		  {
			  System.out.println(t.getMessage());
		  }
	  }
	}

	@When("^user enter \"([^\"]*)\" in textbox$")
	public void user_enter_in_textbox(String username) throws Throwable {
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username); 
	}
	@When("^user enter \"([^\"]*)\" in password$")
	public void user_enter_in_password(String password) throws Throwable {
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
	}
	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.cssSelector("#btnLogin")).click();
		Thread.sleep(5000);
	}

	@Then("^user validates url$")
	public void user_validates_url() throws Throwable {
		
		 String expected="dashboard";
		   String actual=driver.getCurrentUrl();
		   if(actual.equalsIgnoreCase(expected))
		   {
			   System.out.println("Login Success");
		   }
		   else
			   System.out.println("Login Fail");
		}

	

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	  driver.close();  
	}

}
