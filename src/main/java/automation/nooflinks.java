package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nooflinks {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
          driver.navigate().to("https://www.flipkart.com/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        WebElement x=driver.findElement(By.xpath("//div[@class='_1psGvi SLyWEo'][1]"));//Loacating main element
          Actions action = new Actions(driver);//Instantiating Actions class
          action.moveToElement(x);//Hovering on main menu
          action.click().perform();//build()- used to compile all the actions into a single step 
          System.out.println(x.getText());
        Thread.sleep(2000);  
       WebElement y=driver.findElement(By.xpath("//div[@class='exehdJ']"));
          action.moveToElement(y);
          action.click().perform();
          System.out.println(y.getText());
        Thread.sleep(2000);
        driver.close();
      	
	}
}
