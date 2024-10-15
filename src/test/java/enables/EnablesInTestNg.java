package enables;

import org.testng.annotations.Test;

import annotation.TestBase;

public class EnablesInTestNg {
		@Test
		public void A()
		{
			System.out.println("Method A");
		}
		
		@Test (enabled = false)
		public void B()
		{
			System.out.println("Method B");
		}

	}

