package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("test@gmail.com");
		TakesScreenshot tk=(TakesScreenshot)driver;  //screenshot declaration
		File source=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\sc\\flipkart1.png");
		FileUtils.copyFile(source, des);
				
	}
}
