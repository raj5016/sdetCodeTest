package mandatoryHomeWork.week14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1436_DestinationCity {
	
	/*https://leetcode.com/problems/destination-city/
	 * 
	 * Logic:
	 * Create an empty set to store destination cities
	 * Iterate through the paths and add the destination cities to the set
	 * Iterate through the paths Check city occurs on the left side, if so, remove it from the set
	 * last city in set after removing
	 */
	
	
	@Test
	public void test() {
		List<List<String>> pathArrays = Arrays.asList(Arrays.asList("London", "New York"),
				Arrays.asList("New York", "Lima"), Arrays.asList("Lima", "Sao Paulo"));
		Assert.assertEquals("Sao Paulo", return_destCity(pathArrays));
	}
	
	@Test
	public void test1() {
		List<List<String>> pathArrays = Arrays.asList(Arrays.asList("B","C"),
				Arrays.asList("D","B"), Arrays.asList("C","A"));
		Assert.assertEquals("A", return_destCity(pathArrays));
	}
	
	@Test
	public void test2() {
		List<List<String>> pathArrays = Arrays.asList(Arrays.asList("A","Z"));
		Assert.assertEquals("Z", return_destCity(pathArrays));
	}

	public String return_destCity(List<List<String>> paths) {

		Set<String> destinationSet = new HashSet<String>();

		// Adding all destination city to set
		for (List<String> path : paths) {
			destinationSet.add(path.get(1));
		}

		// Find the city is in destination city, if so remove it.
		for (List<String> path : paths) {
			destinationSet.remove(path.get(0));
		}
		// return the last city in set after removing

		return destinationSet.iterator().next();

	}

}
