package mandatoryHomeWork.week10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FindDuplicateElementInAnArray {
	
	@Test
	public void test() {
		 ArrayList<Integer> arr1 = new ArrayList<>();
	        arr1.add(1);
	        arr1.add(3);
	        arr1.add(4);
	        arr1.add(2);
	        arr1.add(2);
		System.out.println(findDuplicate(arr1));
	}
	
	
	@Test
	public void test1() {
		 ArrayList<Integer> arr1 = new ArrayList<>();
	        arr1.add(1);
	        arr1.add(5);
	        arr1.add(5);
	        arr1.add(2);
	        arr1.add(3);
		System.out.println(findDuplicate(arr1));
	}

	public static int findDuplicate(ArrayList<Integer> arr){ //{1 3 4 2 2 }
		int duplicateWElement = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer element : arr) {
        	if (set.contains(element)) {
                System.out.println("The first duplicate element is: " + element);
                break; // Stop searching for more duplicates
            } else {
                // Otherwise, add it to the seenElements set
                set.add(element);
            }
        }
		
		return duplicateWElement;
		
    }
}
