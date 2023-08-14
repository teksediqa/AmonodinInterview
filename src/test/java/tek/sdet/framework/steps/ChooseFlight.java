package tek.sdet.framework.steps;

//import java.time.Duration;
import java.util.List;
import java.util.Map;

//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

//import org.junit.Assert;
//import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class ChooseFlight extends CommonUtility { 
	
	POMFactory factory = new POMFactory(); 
	
	
	@Given("User is on american airlines website") 
	public void userIsOnAmericanAirlineWebsite() { 
		getTitle(factory.flightPage().AmericanAirlineLogo); 
		logger.info("American Airline shuld be displyed "); 
	}   
	
	@When("User click on button Continue with cookies") 
	public void userClickOnButtonContinueWithCookies() { 
		clickElementWithJS(factory.flightPage().DeletCookies); 
		logger.info("user should clicked on cookies button"); 
		
	}  
	
	@And("User click on oneway button")
	
	public void userClickOnewayButton() { 
		click(factory.flightPage().OnewayButton); 
		logger.info("user should clicked on oneway button");
	}
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {  
		List<Map<String, String>> pass = dataTable.asMaps(String.class,String.class); 
		clearTextUsingSendKeys(factory.flightPage().FlightFrom);
		sendText(factory.flightPage().FlightFrom, pass.get(0).get("originAirport")); 
		sendText(factory.flightPage().FlighTo, pass.get(0).get("destinationAirport")); 
		
		logger.info("user entered below information");
	}  
	
@And("User selecet number of adults {string}")
	
	public void userSelectNumberOfAdult(String adult ) {  
	click(factory.flightPage().NumberOfAdults);
	selectByVisibleText(factory.flightPage().NumberOfAdults,adult); 
		logger.info("number of passenger should be changed to 2");
	}
	

 @And("User select number of childern {string}")

   public void userSelectNumberOfChildren(String children ) {  
	 click(factory.flightPage().NumberOfChildern);
	 selectByVisibleText(factory.flightPage().NumberOfChildern,children ); 
	logger.info("number of passenger should be changed to 3 ");
}
	@And("User select the date of departure {string}") 
	
	public void userSelectTheDateOfDeparture(String date) {  
		//click(factory.flightPage().chooseDate);
		sendText(factory.flightPage().chooseDate, date );
		logger.info("user should be selected departure date ");
		
		
	}  
	
	@And("User click on search button")
	public void userClickOnSearchButton() { 
		click(factory.flightPage().searchButton); 
		logger.info("user should be clicked on search button");
		
	}   
	
	@Then("User should be able to see choose flight page") 
	public void userShouldBeAbleToSeeOnChooseFlight() { 
		
		fluientWaitforElement(factory.bookingPage().FlightHeader, 30, 30); 
		logger.info("user should be see the choose flight page");
		
		
		
		
		
		
	}

	
	
		

}
