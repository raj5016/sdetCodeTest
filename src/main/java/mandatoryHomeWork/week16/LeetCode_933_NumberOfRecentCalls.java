package mandatoryHomeWork.week16;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_933_NumberOfRecentCalls {

	//https://leetcode.com/problems/number-of-recent-calls/description/
	
	
	/*@Test
	public void test() {
		LeetCode_933_NumberOfRecentCalls obj=new LeetCode_933_NumberOfRecentCalls();
		assertNotNull(obj);
        assertEquals(1, obj.ping(1));
        assertEquals(2, obj.ping(100));
        assertEquals(3, obj.ping(3001));
        assertEquals(3, obj.ping(3002));
	}
	*/
	Queue<Integer>  queue;
	
    public LeetCode_933_NumberOfRecentCalls() {
        queue=new LinkedList<Integer>();
    }
    
    public int ping(int t) {
    	queue.add(t);
    	while(queue.peek()-t<3000) {
    		queue.poll();
    	}
    	return queue.size();
    }
}
