package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class BookingPage extends BaseSetup{  
	
	public BookingPage() {  
		//we are implementing Pagefactory class to initialize the UI elements 
		// using @FondBy annotation of PageFactory
		PageFactory.initElements(getDriver(), this); 
		
	}   
	
	@FindBy(xpath="//h1[@id='chooseFlightsHeader']")  
	public WebElement FlightHeader; 
    
	
	
	

}
