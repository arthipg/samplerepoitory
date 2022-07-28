package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sclass {
	
	
	static WebDriver driver;
	
	
	@BeforeSuite //run before all tests in this suite
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		}
   
    @Test
    public void openGoogle() {
    driver.get("https://www.google.com/");	
    }
  
    public void openBing() {
    driver.get("https://www.bing.com/");	
    }
   
    public void openYahoo() {
    driver.get("https://www.yahoo.com/");	
    }
   
	public void closeBrowser(){
    driver.quit();
    }
}
