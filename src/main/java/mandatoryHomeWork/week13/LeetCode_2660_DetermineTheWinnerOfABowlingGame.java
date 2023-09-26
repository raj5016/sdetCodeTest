package mandatoryHomeWork.week13;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2660_DetermineTheWinnerOfABowlingGame {
	
	
	
	/*https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/
	 * 
	 * Logic:
	 * 	Declare A variable sum1  and sum2 as first index value;
	 * 	Iterate player 1 until length 
	 * 		Check condition current index -1 is equal to 10, if so multiply index value with 2 and assign with sum
	 * 		Check condition current index -2 is equal to 10,f so multiply index value with 2  and assign with sum
	 * 		Both condition is not matched , directly add with the sum
	 *  Iterate with same logic for players2
	 *  Check for mentioned condition return 1 ,2,0
	 * 
	 */
	
	
	@Test
	public void test() {
		Assert.assertEquals(2, isWinner(new int[] {4,10,7,9}, new int[] {6,5,2,3}));
		Assert.assertEquals(2, isWinner(new int[] {3,5,7,6}, new int[] {8,10,10,2}));
		Assert.assertEquals(0, isWinner(new int[] {2,3}, new int[] {4,1}));
	}
	
	
	//Time complexity O(n)
	  	public int isWinner(int[] player1, int[] player2) {
	  		int sum1=player1[0],sum2=player2[0], i=1,j=1;
	  		
	  		  while(i<player1.length) {
	  			  if(player1[i-1]==10) {
	  				sum1+=2*player1[i];	  			  
	  			  }
	  			  else if(i!=1 && player1[i-2]==10){
	  				sum1+=2*player1[i];
	  			  }
	  			  else {
	  				sum1+=player1[i];
	  			  }
	  			  i++;
	  		  }
	  		  
	  		
	  		 while(j<player2.length) {
	  			 if(player2[j-1]==10) {
		  				sum2+=2*player2[j];	  			  
		  		}
	  			 else if(j!=1 && player2[j-2]==10){
		  				sum2+=2*player2[j];
	  			}
	  			 else {
		  				sum2+=player2[j];
		  		}
		  			  j++;
		  		  }
	  		
	  		return sum1>sum2?1:sum1<sum2?2:0;
	  		
	        
	    }
}
