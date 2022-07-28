package automation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class newj {  
	
	    @Before
	    public void NeedMobilePhone()
	    {
	    	System.out.println("Need Mobile");
	    }
	    
		@Test
		public void ShopMobilePhone()
		{
			System.out.println("Search for mobile");
		}
		@Test
		public void SelectMobile()
		{
			System.out.println("Select Mobile");
		}
	    @After
	    public void SelectNetwork()
	    {
	    	System.out.println("Select network");
	    }
}	  
