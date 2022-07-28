package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyvalue {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement x =driver.findElement(By.name("coffee"));
	    Thread.sleep(1000);
		Select s=new Select(x);
		
		}

	}


