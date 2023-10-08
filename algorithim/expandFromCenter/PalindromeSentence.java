package expandFromCenter;

	
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import java.util.Arrays;

	public class PalindromeSentence {

	    /*
	    1. Split the string with regex " "
	    2. create a boolean array of same as the split array
	    3. loop each word and validate is it a palindrome
	        1. from the center calculate left and right by left = len/2-1, right as center or center+1 based on the length
	        2. validate if both are same, else in output array mark as false
	        3. end of the loop mark as true

	     Time Complexity - O[N], Space Complexity- O[N]
	     */

	    @Test
	    private void tc1(){
	        Assert.assertEquals(new boolean[]{false,false,true, true}, palindrome("this is a Tet"));
	        Assert.assertEquals(new boolean[]{false,false,true, false}, palindrome("this is a Test"));
	        Assert.assertEquals(new boolean[]{true}, palindrome("a"));
	        Assert.assertEquals(new boolean[]{false}, palindrome("ab"));
	        Assert.assertEquals(new boolean[]{}, palindrome(""));
	    }


	    private boolean[] palindrome(String input){
	        if(input.length() == 0) return new boolean[0];
	        String[] inputArr = input.split(" ");

	        boolean[] output = new boolean[inputArr.length];
	        Arrays.fill(output, true);

	        int left , right;
	        String temp;

	        for(int i = 0 ; i < inputArr.length; i++){
	            temp = inputArr[i];
	            left = temp.length()/2-1;
	            if( temp.length()%2==0)
	                right = temp.length()/2;
	            else
	                right = temp.length()/2+1;

	            while(right < temp.length()){
	                if(Character.toLowerCase(temp.charAt(left)) != Character.toLowerCase(temp.charAt(right))) {
	                    output[i] = false;
	                    break;
	                }
	                left--;
	                right++;
	            }
	        }

	        return output;
	    }
	}


