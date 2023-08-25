package mandatoryHomeWork.week8;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class HM4_LeetCode_455_AssignCookies {
	
	@Test
	public void test() {
		Assert.assertEquals(1, returnContentChildren(new int[] {1,2,3}, new int[] {1,1}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(2, returnContentChildren(new int[] {1,2}, new int[] {1,2,3}));
	}
	
	public int returnContentChildren(int [] g,int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		
		int i=0,j=0;
		int contentChildren=0;
		
		 while(i<g.length && j<s.length) {
			 if(s[j] >= g[i]) {
				 contentChildren++;
				 i++;
			 }
			 j++;
		 }
		
		return contentChildren;
		
	}

}
