package citool;

import org.junit.Assert;
import org.junit.Test;

public class TestCITest {

	@Test
	public void testSample() {
		TestCI test = new TestCI();
		Assert.assertEquals(test.sample(),"sample");
	}

}
