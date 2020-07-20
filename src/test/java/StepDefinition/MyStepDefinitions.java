package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
//import junit.framework.Assert;

@RunWith(Cucumber.class)

public class MyStepDefinitions {
	public WebDriver driver;
	
    @Given("^User is on greencart page$")
    public void user_is_on_greencart_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\HEADWAY\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^User searched for \"([^\"]*)\"$")
    public void user_searched_for_something(String strArg1) throws Throwable {
    	driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@type='search']")).sendKeys("strArg1");
       Thread.sleep(3000);
    }
    
  

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    //	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
  
    }
}