package StepDefinition;



import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
//import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDef {

	 @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
     System.out.println("User is on Netbanking");
	    }

	    @When("^User Loginto application with user name and password$")
	    public void user_loginto_application_with_user_name_and_password() throws Throwable {
	    	 System.out.println("User Loginto application");
	   }
	    
	    
	        @When("^User signup with following details$")
	        public void user_signup_with_following_details(DataTable data) throws Throwable {
	        	List<List<String>> obj =data.asLists();
	        	System.out.println(obj.get(0).get(0));
	        	System.out.println(obj.get(0).get(1));
	        	System.out.println(obj.get(0).get(2));
	        	System.out.println(obj.get(0).get(3));
	      
	        }

	         
	        @When("^User signup with (.+) and (.+)$")
	        public void user_signup_with_and(String username, String password) throws Throwable {
	         	System.out.println(username);
	         	System.out.println(password);
	        }

	    

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	
	    	 System.out.println("Home page ");
	
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	
	    	 System.out.println("cards  displayed");
	       
	    }
	
	    @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {

	    	 System.out.println("validate the browser");
	    }

	    @When("^browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	
	    	System.out.println("Browser is triggered");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("browser is started");
	    }

	
	
	
}
