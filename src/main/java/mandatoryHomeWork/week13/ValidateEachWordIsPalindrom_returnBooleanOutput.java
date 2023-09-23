package mandatoryHomeWork.week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ValidateEachWordIsPalindrom_returnBooleanOutput {
	
	
	@Test
	public void test() {
		Assert.assertEquals(Arrays.asList(false, false, true, true), validatePalindrome("this is a Tst"));
		Assert.assertEquals(Arrays.asList(false, false, true, false), validatePalindrome("this is a Test"));
		Assert.assertEquals(Arrays.asList(true), validatePalindrome("a"));
		Assert.assertEquals(Arrays.asList(false), validatePalindrome("ab"));
		Assert.assertEquals(Arrays.asList(), validatePalindrome(""));
		 
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(new boolean[] { false, false, true, true }, palindrome_CodedByNatraj("this is a Tet"));
		Assert.assertEquals(new boolean[] { false, false, true, false }, palindrome_CodedByNatraj("this is a Test"));
		Assert.assertEquals(new boolean[] { true }, palindrome_CodedByNatraj("a"));
		Assert.assertEquals(new boolean[] { false }, palindrome_CodedByNatraj("ab"));
		Assert.assertEquals(new boolean[] {}, palindrome_CodedByNatraj(""));
		 
	}
	
	public List<Boolean> validatePalindrome(String input) {
		List<Boolean> list=new ArrayList<Boolean>();
		String[] words=input.split("\\s");
		
		for (int i = 0; i < words.length; i++) {
			String str = words[i].toLowerCase();
			int left = str.length() / 2 - 1;
			int right= (str.length()%2==0)? str.length()/2 : str.length()/2 +1;  //---this is ternary operator 

			if (str.length() == 1) {
				list.add(true);
			}

			while (right < str.length()) {
				if (str.charAt(left) != str.charAt(right)) {
					list.add(false);
					break;
				}else {
					list.add(true);
				}
				left--;
				right++;
			}
		}
		
		return list;
	}
	
	// By natraj
	
	private boolean[] palindrome_CodedByNatraj(String input){
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
