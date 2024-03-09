package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googlesearchpage {
WebDriver driver;
public googlesearchpage(WebDriver driver) {
	this.driver =driver; 
	
}
      By searchbox = By.name("q");
      
      
      public void searchgoogle(String searchinput) {
    	  driver.findElement(searchbox).sendKeys(searchinput);
      }
}
