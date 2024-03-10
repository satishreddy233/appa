package Testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.googlesearchpage;

public class Testmethodsgooglesearch {
  WebDriver driver;
  @BeforeTest
  public void beforetest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.get("https://www.google.co.in");
	  
	  
}
  @Test
  public void searchoperation() {
	  googlesearchpage page = new googlesearchpage(driver);
	  page.searchgoogle("facebook");
  }
 
  
  
 
  
  
  
  
}
