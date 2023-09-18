package mandatoryHomeWork.week12;

import org.junit.Test;
import org.testng.Assert;

public class ReverseTheStringUsing_TwoPointerApproach {
	
	
	@Test
	public void test() {
		Assert.assertEquals("edocteel", reverseTheStrigUsingTwoPointer("leetcode"));
		Assert.assertEquals("avaj", reverseTheStrigUsingTwoPointer("java"));

	}
	
	
	public String reverseTheStrigUsingTwoPointer(String str) {
		int i=0,j=str.length()-1;
		char[] ch=str.toCharArray();
		
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}

}
