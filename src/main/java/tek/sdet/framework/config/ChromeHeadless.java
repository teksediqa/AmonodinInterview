package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless implements Browser{
	
	public WebDriver openBrowser(String url) {
        WebDriverManager.chromedriver().setup(); 
        // in order to use headless execution we can use chromeoption class 
        // same steps apply to firefox edge browser too 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get(url);
        return driver;
        
    }

}
