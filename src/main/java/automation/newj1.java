package automation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class newj1 {
	 @Before
	    public void launchBrowser()
	    {
	    	
		 System.out.println("launch browser");	
	    }
	    
		@Test
		public void verifyLogin()
		{
			
			System.out.println("login");
			
		}
		@Test
		public void selectProduct()
		{
			System.out.println("product");
		}
	    @After
	    public void closeBrowser()
	    {
	    	System.out.println("close");
	    }
}	  

