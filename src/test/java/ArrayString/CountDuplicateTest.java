package ArrayString;

import org.junit.Assert;
import org.junit.Test;


public class CountDuplicateTest {

	
	@Test
	public void TestCountDuplicates() {
		
		char [] str= {'a','b','c','d','e'};
		int n = 5;
		CountDuplicates cd = new CountDuplicates();
		int expectedOutput = 0;
		int methodOutput = cd.countDuplicate(str,n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
	public void TestCountDuplicates1() {
		
		char [] str= {'a','a','b','b','c','d','e'};
		int n = 7;
		CountDuplicates cd = new CountDuplicates();
		int expectedOutput = 2;
		int methodOutput = cd.countDuplicate(str,n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
	public void TestCountDuplicates2() {
		
		char [] str= {'a','a','b','b','c','d','e'};
		int n = 7;
		CountDuplicates cd = new CountDuplicates();
		int expectedOutput = 2;
		int methodOutput = cd.countDuplicate(str,n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
public void TestCountDuplicates3() {
		
		char [] str= {'i','n','d','i','v','i','s','i','b','i','l','i','t','y'};
		int n = 14;
		CountDuplicates cd = new CountDuplicates();
		int expectedOutput = 1;
		int methodOutput = cd.countDuplicate(str,n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
	public void TestCountDuplicates6() {
			
			char [] str= {'i','n','d','i','v','i','s','i','b','i','l','i','t','i','e','s'};
			int n = 16;
			CountDuplicates cd = new CountDuplicates();
			int expectedOutput = 2 ;
			int methodOutput = cd.countDuplicate(str,n);
			
			Assert.assertEquals(expectedOutput, methodOutput);
		}

	@Test
	public void TestCountDuplicates4() {
		
		char [] str= {'a','a','1','1'};
		int n = 4;
		CountDuplicates cd = new CountDuplicates();
		int expectedOutput = 2;
		int methodOutput = cd.countDuplicate(str,n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}
	
	@Test
	public void TestCountDuplicates5() {
		
		char [] str= {'a','b','b','a'};
		int n = 4;
		CountDuplicates cd = new CountDuplicates();
		int expectedOutput = 2;
		int methodOutput = cd.countDuplicate(str,n);
		
		Assert.assertEquals(expectedOutput, methodOutput);
	}

	
}
