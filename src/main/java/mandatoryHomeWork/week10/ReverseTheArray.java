package mandatoryHomeWork.week10;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTheArray {
	
	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] {2,43,1,1,7,5,2,11 }, reverseTheArray(new int[] {11,2,5,7,1,1,43,2}));
	}
	
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[] {5,4,3,2,1}, reverseTheArray(new int[] {1,2,3,4,5}));
	}
	
	public int[] reverseTheArray(int arr[]) {
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
		
	}

}
