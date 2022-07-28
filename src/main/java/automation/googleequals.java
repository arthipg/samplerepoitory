package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleequals {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.google.com/");
    driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_8d gb_8c']")).click();
    String s=driver.getTitle();
    //System.out.println(s);
    if(s.equals("Sign in - Google Accounts"))
    {
    	System.out.println("Gmail Acc");
    }
    else
    {
    	System.out.println("Invalid");
    }
    driver.close();
}
}
