package mandatoryHomeWork.week15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2103_RingsAndRods {

	//https://leetcode.com/problems/rings-and-rods/description/  
	
	@Test
	public void test() {
		Assert.assertEquals(1, countRodsWithAllColors("B0B6G0R6R0R6G9"));
	}
	
	public static int countRodsWithAllColors(String rings) {
        // Initialize a map to keep track of the colors on each rod
        Map<Integer, Set<Character>> rods = new HashMap<>();

        // Iterate through the input string and update the map
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = Character.getNumericValue(rings.charAt(i + 1));
            rods.putIfAbsent(rod, new HashSet<>());
            rods.get(rod).add(color);
        }
        System.out.println("sssssss");
        // Initialize a counter for rods with all three colors
        int count = 0;

        // Iterate through the rods and check if they have all three colors
        for (Set<Character> rodColors : rods.values()) {
            if (rodColors.size() == 3) {
                count++;
            }
        }

        return count;
    }

}
