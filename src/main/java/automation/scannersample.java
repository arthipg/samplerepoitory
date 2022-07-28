package automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scannersample {
public static void main(String args[])

	{
	System.setProperty("WebDriver.Chrome.Driver","E:\\jar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter webpage");
    String browser=sc.nextLine();
    driver.get(browser);
    if(browser.contains("https://www.google.com/"))
    {
    System.out.println("Valid Browser");	
    }
    else
    {
    System.out.println("Invalid browser");
    }
    sc.close();
}
}