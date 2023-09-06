package mandatoryHomeWork.week10;

import org.junit.Assert;
import org.junit.Test;

public class SpanOfArrays {
	//span is nothing but Span=Max-Min
	
	@Test
	public void test() {
		Assert.assertEquals(84, spanOfArrays(new int[] {88,55,66,77,4,9}));
	}
	
	public int spanOfArrays(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return max-min;
	}

}
