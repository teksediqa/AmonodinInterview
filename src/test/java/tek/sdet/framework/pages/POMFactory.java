package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{  
	

	     
	    private ChooseFlightPage flightPage;
	    private BookingPage bookingPage;
	    
	    
	public POMFactory() { 
		 
		this.flightPage = new ChooseFlightPage(); 
		this.bookingPage = new BookingPage();
		
	}   
	
	
	
	
	public ChooseFlightPage flightPage() {
		return this.flightPage;
	}  
	
	
	public BookingPage bookingPage() { 
		return this.bookingPage;
	}
	
	
}
