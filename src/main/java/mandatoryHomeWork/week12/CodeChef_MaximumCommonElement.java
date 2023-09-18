package mandatoryHomeWork.week12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CodeChef_MaximumCommonElement {
	
	/*
	 * 
	 * 
	 * 
	 * Given two arrays A and B, each of size N, where each array consists of distinct elements.
			
	   Find the number of elements that are common in both the arrays.
	   
	   Input 1: 1 2 3 4  , Input 2: 1 3 4 5
	   Output: 3
	   
	   Brutforce: 
	   
	   1.Sort the two arrays , initialize a variable maxCount=0
	   2.Iterate wit two loops and compare the element and if it matches increment the count.
	   
	   Two Pointer:
	   1.Sort the two arrays , initialize a variable maxCount=0, and two pointer i=0,j=0
	   2.Have a condition until loop
	   3.If the elements are equal, increment the count and move both pointers forward.
	   4.If the element in the first array is smaller, move the second pointer forward.
	   5.If the element in the second array is smaller, move the first pointer forward.
	   
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(3, byBruteFoce_ReturnMaxCommonElement(new int[] {1,2,3,4}, new int[] {1,3,4,5}));
		Assert.assertEquals(3, byTwoPointer_ReturnMaxCommonElement(new int[] {1,2,3,4}, new int[] {1,3,4,5}));
		Assert.assertEquals(3, withoutSort_returnMaxCommonElement(new int[] {1,2,3,4}, new int[] {1,3,4,5}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(0, byBruteFoce_ReturnMaxCommonElement(new int[] {1,2,3,4}, new int[] {8,9,10,5}));
		Assert.assertEquals(3, byTwoPointer_ReturnMaxCommonElement(new int[] {1,2,3,4}, new int[] {8,9,10,5}));
		Assert.assertEquals(3, withoutSort_returnMaxCommonElement(new int[] {1,2,3,4}, new int[] {8,9,10,5}));
	}
	
	
	@Test
	public void test2() {
		Assert.assertEquals(3, byBruteFoce_ReturnMaxCommonElement(new int[] {2,4,1}, new int[] {1,4,2}));
		Assert.assertEquals(3, byTwoPointer_ReturnMaxCommonElement(new int[] {2,4,1}, new int[] {1,4,2}));
		Assert.assertEquals(3, withoutSort_returnMaxCommonElement(new int[] {2,4,1}, new int[] {1,4,2}));
	}
	
	//Withou sort---Time complexity O(N)
	public int withoutSort_returnMaxCommonElement(int[] input1,int[] input2) {
		int maxCount=0;
		Set<Integer> set1=new HashSet<Integer>();
		for (int i = 0; i < input1.length; i++) {
			set1.add(i);
		}
		
		Set<Integer> set2=new HashSet<Integer>();
		for (int i = 0; i < input2.length; i++) {
			set2.add(i);
		}
		int i=0,j=0;
		while(i<input1.length&& j<input2.length) {
			System.out.println(input1[i]);
			System.out.println(input2[j]);
			if(input1[i]==input2[j]) {
				maxCount++;
				i++;
				j++;
			}else if(input1[i]<input1[j]) {
				j++;
			}else {
				i++;
			}
			
		}
		return maxCount;

	}
	
	//Brute force Approach //With sort---Time complexity O(NlogN)
	public int byBruteFoce_ReturnMaxCommonElement(int[] input1,int[] input2) { //1 2 3 4 ---- 1 3 4 5
		int maxCount=0;
		Arrays.sort(input1);
		Arrays.sort(input2);
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				if(input1[i]==input2[j]) {
					maxCount++;
				}
			}
		}
		return maxCount;
	}
	
	
	//Two Pointer approach //With sort---Time complexity O(NlogN)
	public int byTwoPointer_ReturnMaxCommonElement(int[] input1,int[] input2) {
		int maxCount=0;
		Arrays.sort(input1);
		Arrays.sort(input2);
		int i=0,j=0;
		while(i<input1.length&& j<input2.length) {
			System.out.println(input1[i]);
			System.out.println(input2[j]);
			if(input1[i]==input2[j]) {
				maxCount++;
				i++;
				j++;
			}else if(input1[i]<input1[j]) {
				j++;
			}else {
				i++;
			}
			
		}
		return maxCount;
	}

}
