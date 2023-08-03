package mandatoryHomeWork.week5;

import org.junit.Assert;
import org.junit.Test;

public class HM_3_CalculateMoneyInLeetBank {
	
	//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
	
	@Test
	public void test() {
		Assert.assertEquals(10, totalMoney(4));
	}
	
	public int totalMoney(int n) {
		
        int previousMonday = 0;
        int totalMoney = 0;
        int previousDay = 0;
        
        for (int i = 0; i < n; i++) {
        	
            if(i % 7 == 0){
            	
                previousMonday = previousMonday+1;
                totalMoney = totalMoney+previousMonday;
                previousDay = previousMonday;
                
            } else {
                previousDay = previousDay+1;
                totalMoney = totalMoney+previousDay;
            }
        }
        
        return totalMoney;
    }

}
