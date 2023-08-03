package com.repeatedDuplitedWork;

import org.junit.Assert;
import org.junit.Test;

public class Countofmatchesintournamen {
	
	@Test
	public void test() {
		Assert.assertEquals(6, countNoOfMatches(7));
	}
	
	public int countNoOfMatches(int teams) {
		int matchcount=0;
		
		while(teams>1) {
			if(teams%2==0) {
				matchcount=matchcount+teams/2;
				teams=teams/2;
			}else {
				matchcount=matchcount+(teams-1)/2;
				teams=(teams-1)/2+1;
			}
		}
		return matchcount;
		
	}

}
 
		