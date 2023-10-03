package mandatoryHomeWork.week14;

import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class FindatozIsPresentinString {
	
	/*
	 * Given a string, validate you have all the characters of a-z
	 * words only in lowercase and whitespace return - true or false
	 * 
	 * Pseudocode 
	 * 1. initialise hashSet 
	 * 2. add characters apart from whitespace to
	 * the set
	 * 3. validate is the set size of 26
	 * 
	 * Time Complexity - O[N], Space Complexity - O[N]
	 */
	
	  @Test
	    private void test(){
	        Assert.assertFalse(allCharASCII("this is input"));
	        Assert.assertFalse(allCharHashSet("this is input"));
	        Assert.assertTrue(allCharASCII("qwerty uiopl kjhgf d s a zxcv b mn"));
	        Assert.assertTrue(allCharHashSet("qwerty uiopl kjhgf d s a zxcv b mn"));
	    }

	//boolean
	 private boolean allCharHashSet(String input){
	        HashSet<Character> set = new HashSet<>();

	        for(char each : input.toCharArray())
	            if(each != ' ')
	                set.add(each);

	        return set.size() == 26;
	    }
	//==================================== by asci method==================================== 
	    /*
	    Pseudocode
	    1. init boolean Array with 26 length
	    2. mark true is the character is found

	    Time Complexity - O[N], Space Complexity - O[1]
	     */

	    private boolean allCharASCII(String input){
	        boolean[] arr = new boolean[26];

	        for(char each : input.toCharArray())
	            if(each != ' ')
	                arr[each-'a'] = true;


	        for(boolean each : arr)
	            if(!each)
	                return false;

	        return true;
	    }
	

}
