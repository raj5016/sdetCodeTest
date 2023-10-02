package com.week2.classwork;

import org.junit.Assert;
import org.junit.Test;


public class LeetCode_1688_CountofMatchesinTournament {
	
	/*
	 * https://leetcode.com/problems/count-of-matches-in-tournament/description/
	 * 
	 * 
	 * You are given an integer n, the number of teams in a tournament that has strange rules:

	If the current number of teams is even, each team gets paired with another team. 
	A total of n / 2 matches are played, and n / 2 teams advance to the next round.
	
	If the current number of teams is odd, one team randomly advances in the tournament
	, and the rest gets paired. A total of (n - 1) / 2 matches are played, 
	and (n - 1) / 2 + 1 teams advance to the next round.
	
	Return the number of matches played in the tournament until a winner is decided.
	
	
	Input: n = 7
Output: 6
Explanation: Details of the tournament: 
- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 3 + 2 + 1 = 6.

	 */
	
	@Test
	public void test() {
		Assert.assertEquals(6, countofMatchesinTournament1(7));
	}
	
	public int countofMatchesinTournament1(int teams) {
		int matchCount=0;
		
			while(teams>1) {
				if(teams%2==0) {
					matchCount=matchCount+teams/2;
					teams=teams/2;
				}else {
					matchCount=matchCount+(teams-1)/2;
					teams=(teams-1)/2+1;
				}
			}
		return matchCount;
		
	}
}
