package ArrayString;

import org.junit.Assert;
import org.junit.Test;


public class LargestNumberTest {

	@Test
    public void TestMissingNumber() {
		
		int a= 21445;
		int n = 5;
		LargestNumber ln = new LargestNumber();
		int expectedOutput = 54421;
		int methodOutput = ln.largestNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestMissingNumber1() {
		
		int a= 145263;
		int n = 6;
		LargestNumber ln = new LargestNumber();
		int expectedOutput = 654321;
		int methodOutput = ln.largestNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestMissingNumber2() {
		
		int a= 1548597;
		int n = 7;
		LargestNumber ln = new LargestNumber();
		int expectedOutput = 9875541;
		int methodOutput = ln.largestNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	
}
