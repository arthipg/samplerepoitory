package automation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class asrtexample {

	 @Test
	   public void testAssertions() {
	      //test data
	      String str1 = new String ("chennai");
	      String str2 = new String ("chennai");
	      String str3 = null;
	      //String str4 = "xyz";
	      //String str5 = "abc";
			
	      int val1 = 5;
	      int val2 = 6;

	      String[] expectedArray = {"one", "two", "three"};
	      String[] resultArray =  {"one", "two", "three"};

	      //Check that two objects are equal
	      assertEquals(str1, str2);

	      //Check that a condition is true
	      assertTrue (val1 < val2);

	      //Check that a condition is false
	      assertFalse(val1 > val2);

	      //Check that an object isn't null
	      assertNotNull(str1);

	      //Check that an object is null
	      assertNull(str3);

	     
	      //Check whether two arrays are equal to each other.
	      assertArrayEquals(expectedArray, resultArray);
	   }
	}

