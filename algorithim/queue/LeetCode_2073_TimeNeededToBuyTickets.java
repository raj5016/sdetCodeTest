package mandatoryHomeWork.week16;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2073_TimeNeededToBuyTickets {
	
	//https://leetcode.com/problems/time-needed-to-buy-tickets/
	
	@Test
	public void test() {
		Assert.assertEquals(6, timeRequiredToBuy(new int[] {2,3,2}, 2));
	}
	
	
	public int timeRequiredToBuy(int[] tickets, int k) {
		int count = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < tickets.length; i++) {
			q.add(i);
		}

		while (!q.isEmpty()) {
			int index = q.poll();
			tickets[index]--;
			count++;
			if(tickets[index] > 0){
	                q.add(index);
	         }
			if(tickets[index] == 0 && index == k){
                return count;
            }
          
		}

		return count;
	}

}
