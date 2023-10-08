package expandFromCenter;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome_String {



    /*
    Pseudocode
    BruteForce: with an extra space
    1. create a String buffer with input String value
    2. reverse the string
    3. validate if those are equal

    Time Complexity - O[N], Space Complexity = O[N]
     */


    private boolean isPalindrome_BF(String input){
        return new StringBuffer(input).reverse().toString().equals(input);
      /*  *//*
        abcd
        "" -> 1
        "d" -> 2
        "dc" -> 3
        "dcb" -> 4
        "dcba" -> 5
         *//*
        String reverse = "";

        for(int i =input.length()-1; i >= 0; i--)
            reverse += input.charAt(i);

        return reverse.equals(input);*/

    }


    /*
    Pseudocode - Expand From center
    1. initialise the pointer => left is length/2 -1; and right will be length/2+1 if odd or length/2 if even
    2. loop till end of the string and validate left and right index value are equal
    3. return true if all characters are equal and false if any one mismatch
     */

    @Test
    private void tc1(){
        Assert.assertTrue(isPalindrome("RADAR"));
        Assert.assertFalse(isPalindrome("RADAr"));
    }

    private boolean isPalindrome(String input){

        /* R A D A R

        left => A, right => A
        left == right => continue, if mismatch => false
         *
         */

        int left = input.length()/2-1, right ;

        if(input.length()%2==0) right = input.length()/2;
        else right = input.length()/2+1;

        while(right < input.length()){
            if(input.charAt(left) != input.charAt(right))
                return false;
            left--;
            right++;
        }

        return true;
    }


}
