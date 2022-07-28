package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	    
		private static Object Assert;

		public static void main(String[] args) throws InterruptedException
		{
		System.out.println("welcome to selenium");
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  //add implicity wait
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		//WebDriverWait wait=new WebDriverWait(driver,20); //expilict wait
		//wait.until(visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Chennai')]"))));
		List<WebElement> elements = driver.findElements(By.xpath("//h1[@style='padding-top: 16px;']"));
	    System.out.println("Number of places:" +elements.size());
	    for (int i=0; i<elements.size();i++){
	      System.out.println("Delivery places:" + elements.get(i).getText());
	    }
	     WebElement place1 = driver.findElement(By.xpath("//h1[contains(text(),'Chennai')]"));
	     place1.click();
	     //WebElement Element = driver.findElement(By.xpath("//h1[contains(text(),'Chennai')]"));
	              //Find element by xpath and store in variable "Element" 
	     js.executeScript("window.scrollBy(0,500)");
	     //js.executeScript("arguments[0].scrollIntoView();", Element);
	              //This will scroll the page till the element is found
	     Thread.sleep(3000);
			System.out.println(place1.getText());
		String x=driver.findElement(By.xpath("//*[@id='accordion1']/ul/li[8]/div/ul/li[5]/span")).getText();
		System.out.println(x);
		if (x=="Tel: 1860-123-1000") {
			System.out.println("Number is Verified");
		}
	    else
	    {
			System.out.println("Number is not verified");
	    }
		//Assert.                                           /* Create an instance of Assert */
	 	driver.navigate().to("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//*[contains( text(),'Carrot')]")).click();
		Thread.sleep(1000);
		driver.close();
	}
		}
	    





