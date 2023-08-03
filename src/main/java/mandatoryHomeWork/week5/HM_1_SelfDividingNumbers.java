package mandatoryHomeWork.week5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HM_1_SelfDividingNumbers {
	
	//Pseudocode   https://leetcode.com/problems/self-dividing-numbers/
	
	/*
	 * Declare a list to return the output 
	 * And Initialize the count 
	 * Input is two Integer number
	 * Initialize a loop with left as start and right as end
	 * Have a condition if n is greater than 9,the individual number and 
	 * 					divide with input number and verify it is equal to 0
	 * 
	 */
		@Test
		public void Test() {
			System.out.println(CountselfDividingNumbers(1, 22));
		}
	
		public List<Integer> CountselfDividingNumbers(int leftInt, int rightInt){
			List<Integer> listOfSelfDividingNumbers=new ArrayList<Integer>();
			
			for(int i=leftInt;i<=rightInt;i++){
	            if(check(i))
	            	listOfSelfDividingNumbers.add(i);
	        }
			return listOfSelfDividingNumbers;
			
		}
		
		
	    public boolean check(int n){
	        int temp=n;
	        while(temp != 0){
	            int remainder = temp%10;
	            if(remainder == 0 || n%remainder != 0){
	                return false;
	            }
	            temp =temp/ 10;
	        }
	        return true;
	    }
	

}
