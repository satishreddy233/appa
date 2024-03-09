package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebookpage {
	WebDriver driver;
	public facebookpage(WebDriver driver) {
		this.driver =driver; 
		
	}
	      By searchbox = By.name("q");
	      
	     
	

}
