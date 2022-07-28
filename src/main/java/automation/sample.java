package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");//to configure driver/create chromedriver
		WebDriver driver = new ChromeDriver();//
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		String title=driver.getTitle();//get tile of the page
		System.out.println(title);//print title
		String url=driver.getCurrentUrl();//get Url of the page
		System.out.println(url);
		driver.navigate().to("https://www.google.com/");//navigate to google page
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		driver.close();
	}
}
