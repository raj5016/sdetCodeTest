package mandatoryHomeWork.week11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.testng.Assert;

public class ReturnMinDistanceBetweenTwoMatchesInAnArray {
	
	//https://www.hackerrank.com/challenges/minimum-distances/problem
	
	@Test
	public void test() {
		Assert.assertEquals(3, minimumDistances1(Arrays.asList(7, 1, 3, 4, 1, 7)));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(-1, minimumDistances1(Arrays.asList(1,2,3,4,5)));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(-1, minimumDistances1(Arrays.asList(1,2,3,4,10)));
	}
	
	
	
	//Reference method pls use this
	
	public static int minimumDistances1(List<Integer> a) {   //7, 1, 3, 4, 1, 7
	    // Write your code here
	        Map<Integer, Integer> lastIndexMap = new HashMap<>();
	        int minDistance = Integer.MAX_VALUE;

	        for (int i = 0; i < a.size(); i++) {
	            int currentElement = a.get(i);
	            
	            if (lastIndexMap.containsKey(currentElement)) {
	                int lastSeenIndex = lastIndexMap.get(currentElement);
	                int distance = i - lastSeenIndex;
	                minDistance = Math.min(minDistance, distance);
	            }
	            
	            lastIndexMap.put(currentElement, i);
	        }

	        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
	    }
	}


