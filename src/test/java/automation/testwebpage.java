package automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testwebpage {

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.browserstack.com/");
	   	String ActualTitle = driver.getTitle();
		//System.out.println(ActualTitle);
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | browserstack";
		Assert.assertNotEquals(ActualTitle, ExpectedTitle);
		driver.close();
		}
		}
	

