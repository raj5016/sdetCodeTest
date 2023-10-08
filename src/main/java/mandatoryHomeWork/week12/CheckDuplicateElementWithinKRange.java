package mandatoryHomeWork.week12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class CheckDuplicateElementWithinKRange {
	
	/*  https://www.techiedelight.com/find-duplicates-within-given-range-array/
	 * 
	 * Given an array and a positive number k, check whether the array contains any duplicate elements within the range k. If k is more than the array’s size, the solution should check for duplicates in the complete array.

		Example: 
		Input:
		 
		nums[] = { 5, 6, 8, 2, 4, 6, 9 }
		k = 4
		 
		Output: Duplicates found
		 
		(element 6 repeats at distance 4 which is <= k)

	 * Logic:
	 *  Brute Force:
	 *  Iterate with loop ,
	 *  
	 * 
	 */
	
	@Test
	public void test() {
        List<Integer> duplicates = by_SlidingWindow(new int[] {5, 6, 8, 2, 4, 6, 9}, 4);
        System.out.println("Duplicates within range " + 4 + ": " + duplicates);


	}
	
	public int bruteForce_returnDuplicateElementInArray(int[] arr, int k) {
		int duplicateElement=0;
		if (arr == null || arr.length <= 1 || k <= 0) {
            System.out.println("No Duplicates");
        }
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <= i + k && j<arr.length; j++) {
					if (arr[i]==arr[j]) {
						duplicateElement=arr[i];
					}
			}
		}
		
		return duplicateElement;
	}
	
	
	public List<Integer> by_SlidingWindow(int[] arr, int k) {
		
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> windowMap = new HashMap<>();

		
		for (int i = 0; i < arr.length; i++) {
			 int currentElement = arr[i];
	            windowMap.put(currentElement, windowMap.getOrDefault(currentElement, 0) + 1);
	            if (i >= k) {
	                int leftElement = arr[i - k];
	                if (windowMap.get(leftElement) == 1) {
	                    windowMap.remove(leftElement);
	                } else {
	                    windowMap.put(leftElement, windowMap.get(leftElement) - 1);
	                }
	            }  
	            if (windowMap.containsKey(currentElement) && windowMap.get(currentElement) > 1) {
	                duplicates.add(currentElement);
	            }
		
		}
		return duplicates;
		
	}

}
