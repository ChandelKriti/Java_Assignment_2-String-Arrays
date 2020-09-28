package ArrayString;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrenceTest {

	
	@Test
    public void TestOddOccurrence() {
		
		int[] a= {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
		int n = 17;
		OddOccurrence ln = new OddOccurrence();
		int expectedOutput = 5;
		int methodOutput = ln.oddOccurrence(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestOddOccurrence1() {
		
		int[] a= {1,1,2,-2,5,2,4,4,-1,-2,5};
		int n = 11;
		OddOccurrence ln = new OddOccurrence();
		int expectedOutput = -1;
		int methodOutput = ln.oddOccurrence(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestOddOccurrence2() {
		
		int[] a= {20,1,1,2,2,3,3,5,5,4,20,4,5};
		int n = 13;
		OddOccurrence ln = new OddOccurrence();
		int expectedOutput = 5;
		int methodOutput = ln.oddOccurrence(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestOddOccurrence3() {
		
		int[] a= {10};
		int n = 1;
		OddOccurrence ln = new OddOccurrence();
		int expectedOutput = 10;
		int methodOutput = ln.oddOccurrence(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestOddOccurrence4() {
		
		int[] a= {1,1,1,1,1,1,10,1,1,1,1};
		int n = 11;
		OddOccurrence ln = new OddOccurrence();
		int expectedOutput = 10;
		int methodOutput = ln.oddOccurrence(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestOddOccurrence5() {
		
		int[] a= {5,4,3,2,1,5,4,3,2,10,10};
		int n = 11;
		OddOccurrence ln = new OddOccurrence();
		int expectedOutput = 1;
		int methodOutput = ln.oddOccurrence(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
}
