package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class ChooseFlightPage extends BaseSetup{ 
	
	public ChooseFlightPage() {  
		//we are implementing Pagefactory class to initialize the UI elements 
		// using @FondBy annotation of PageFactory
		PageFactory.initElements(getDriver(), this); 
		// syntax for storing UI elements using @FindBy annotations
		//@Find(locatorType = "locator value") 
		// public WebElement nameOfElement 
	} 
	
	
		@FindBy(xpath="//img[contains(@alt, 'American Airlines')]")  
		public WebElement AmericanAirlineLogo; 
	    
		
		@FindBy(xpath="//button[contains(text(),'Continue')]")  
		public WebElement DeletCookies;  
		
		@FindBy(xpath="(//span[@class='control'])[2]")  
		public WebElement OnewayButton;   
		
		@FindBy(xpath ="//input[@id='reservationFlightSearchForm.originAirport']")
		public WebElement FlightFrom;  
		
		@FindBy(xpath ="//input[@id='reservationFlightSearchForm.destinationAirport']")
		public WebElement FlighTo; 
		
		@FindBy(xpath = "//select[@id='flightSearchForm.adultOrSeniorPassengerCount']")
		public WebElement NumberOfAdults;  
		
		@FindBy(xpath = "//select[@id='flightSearchForm.childPassengerCount']")
		public WebElement NumberOfChildern;  
		
		@FindBy(xpath = "//input[@id='aa-leavingOn']")
		public WebElement chooseDate; 
		
		@FindBy(xpath = "//input[@id='flightSearchForm.button.reSubmit']")
		public WebElement searchButton;  
		
		@FindBy(xpath = "//span[contains(text(), 'Flexible')] ")
		public WebElement FelixableOption;
		
		
}
