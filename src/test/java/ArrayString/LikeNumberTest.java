package ArrayString;

import org.junit.Assert;
import org.junit.Test;

public class LikeNumberTest {

	
	@Test
    public void TestLikeNumber() {
		
		String[] a= {};
		int n = 0;
		LikeNumber ln = new LikeNumber();
		String expectedOutput = "0 liked";
		String methodOutput = ln.likeNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestLikeNumber1() {
		
		String[] a= {"Peter"};
		int n = 1;
		LikeNumber ln = new LikeNumber();
		String expectedOutput = "Peter liked";
		String methodOutput = ln.likeNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestLikeNumber2() {
		
		String[] a= {"Jacob", "Alex"};
		int n = 2;
		LikeNumber ln = new LikeNumber();
		String expectedOutput = "Jacob,Alex liked";
		String methodOutput = ln.likeNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestLikeNumber3() {
		
		String[] a= {"Max", "John", "Mark"};
		int n = 3;
		LikeNumber ln = new LikeNumber();
		String expectedOutput = "Max,John,Mark liked";
		String methodOutput = ln.likeNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
    public void TestLikeNumber4() {
		
		String[] a= {"Alex", "Jacob", "Mark", "Max"};
		int n = 4;
		LikeNumber ln = new LikeNumber();
		String expectedOutput = "Alex,Jacob,Mark and 1 others liked";
		String methodOutput = ln.likeNumber(a, n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
}
