package mandatoryHomeWork.week17;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1884_EggDropWith2EggsAndNFloors {
	
	//https://leetcode.com/problems/egg-drop-with-2-eggs-and-n-floors/description/
	// Tried with multiple videoes to understand felt like quit complex.
	@Test
	public void test() {
		Assert.assertEquals(2, twoEggDrop(2));
	}
	
	public int twoEggDrop(int n) {
        int k = 2;
         int[][] dp = new int[k+1][n+1];
        for(int i=1;i<=k;i++){
            for(int j=1;j<=n;j++){
                if(i==1){// if only one egg 
                    dp[i][j] = j;
                }else if(j==1){// if only one floor
                    dp[i][j] = 1;
                }else{
                    int min = Integer.MAX_VALUE;
                    for(int a=j-1,b=0;a>=0;a--,b++){
                        int v1 = dp[i][a];//egg survive 
                        int v2 = dp[i-1][b];//egg break 
                        int max = Math.max(v1,v2);
                        min = Math.min(max,min);
                    }
                    dp[i][j] = min+1;
                }
            }
        }
        return dp[k][n];
    }

}
