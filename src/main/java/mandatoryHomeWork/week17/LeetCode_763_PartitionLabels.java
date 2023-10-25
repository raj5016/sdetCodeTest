package mandatoryHomeWork.week17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_763_PartitionLabels {
	
	
		@Test
		public void test() {
			Assert.assertEquals(Arrays.asList(9,7,8), partitionLabels("ababcbacadefegdehijhklij"));
		}
	
	 	public List<Integer> partitionLabels(String s) {
	 		List<Integer> output=new ArrayList<Integer>();
	 		
	 		Map<Character,Integer> hmap=new HashMap<Character,Integer>();
	 		
	 		// filling impact of character's
	 		for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				hmap.put(ch, i);
			}
	 		
	 		int max=0; int prev=-1;
	 		
	 		for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            max=Math.max(max, hmap.get(ch));
	            if(max==i) {
	            	output.add(max-prev);  //                // partition time
	            	prev=max;
	            }
			}
			return output;
	        
	    }

}
