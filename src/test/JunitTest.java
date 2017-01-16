package test;

import org.junit.Assert;
import org.junit.Test;

import citool.TestCI;

public class JunitTest {
		

		@Test
		public void testSample() {
			TestCI test = new TestCI();
			Assert.assertEquals(test.sample().toString(),"sample1");
		}

	
}
