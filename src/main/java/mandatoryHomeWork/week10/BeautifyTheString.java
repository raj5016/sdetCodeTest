package mandatoryHomeWork.week10;

import org.junit.Test;
import org.testng.Assert;

public class BeautifyTheString {
	
	/*
	 * https://www.codingninjas.com/studio/problems/beautiful-string_1115625
	 * 
	 * Input 0 0 0 0 
	 * Output 2
	 * 
	 * Input 1 0 1 0
	 * Output 0
	 * 
	 * Input 0 1 0 1 1
	 * Output 1
	 * 
	 * Input 1001
	 * Output 2
	 */
	
	
	@Test
	public void test1() {
		Assert.assertEquals(2, makeBeautiful("0000"));
	}
	
	
	@Test
	public void test2() {
		Assert.assertEquals(0, makeBeautiful("1010"));
	}
	
	
	@Test
	public void test3() {
		Assert.assertEquals(1, makeBeautiful("01011"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(2, makeBeautiful("1001"));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(5, makeBeautiful("01010010101"));
	}
	
	
	public static int makeBeautiful(String str) {
		int len=str.length();
		int minSwap0=0; //how many times we will swap if string starts with 0
		int minSwap1=0; // how many times we will swap if string starts with 1
		
		for (int i = 0; i < len; i++) {     //1001
			
			if(i%2==0) { // expected here is 0
				if(str.charAt(i)!='0') { //expect is 1
					minSwap0++;
				}else {
					minSwap1++;
				}
			}else {  
				if(str.charAt(i)!='1') {  //expect 0
					minSwap0++;
				}else {
					minSwap1++;
				}
			}
		}
		if (minSwap0 < minSwap1) {
            return minSwap0;
        } else {
            return minSwap1;
        }
		//return Math.min(minSwap0, minswap1);

    }

}
