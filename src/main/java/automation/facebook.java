package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();  
    driver.manage().window().maximize();  
    driver.navigate().to("https://www.facebook.com/");  
    boolean logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
    if(logo==true)
    {
    	System.out.println("Logo is available");
    }
    else
    {
    	System.out.println("Logo is not available");
    }
    driver.close();
}}
