package automation;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class webpage {		
		
		public static void main(String[] args) throws InterruptedException  {  
		      
		      
	        System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();  
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.navigate().to("http://www.bigbasket.com/");  
	        driver.manage().window().maximize();  
	        JavascriptExecutor js= (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(2000,0)","");          
	        System.out.println("Chrome launched");    
	 driver.findElement(By.xpath("//a[@href='http://www.bigbasket.com/contact/?nc=bt']")).click();
	 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 System.out.println("Read contact us");
	 List <WebElement> sd = driver.findElements(By.xpath("//div[@id='accordion1']"));
	 System.out.println("Number of places"+sd.size());
		for(int i=0;i<sd.size();i++)
		{
			System.out.println("Office address"+sd.get(i).getText());
		}
		WebElement ab=driver.findElement(By.xpath("//h1[contains(text(),'Chennai')]"));ab.click();
			
			System.out.println("Chennai location found");
			String x=driver.findElement(By.xpath("//*[@id='accordion1']/ul/li[8]/div/ul/li[5]/span")).getText();
			System.out.println(x);
			String y="Tel: 1860-123-1000";
			if (x=="Tel: 1860-123-100")
				System.out.println("Number is Verified");
			else
				System.out.println("Number is not verified");
			
	
	Assert.assertNotEquals(x, y);
			{
				System.out.println("Actual not matched");
			}
			driver.close();
			
			
		
	  
	    }

		
		}


