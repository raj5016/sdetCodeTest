package mandatoryHomeWork.week10;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_2325_DecodeTheMessage {
	//https://leetcode.com/problems/decode-the-message/description/
	
	@Test
	public void test() {
		Assert.assertEquals("this is a secret", decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
	}
	
	
	public String decodeMessage(String key, String message) {
		Map<Character,Character> map=new HashMap<>();
		int i=97;
		
		for (int k = 0; k < key.length(); k++) {
			char c=key.charAt(k);
			if(c==' ') {
				continue;
			}else if(!map.containsKey(c)) {
				map.put(c, (char)i++);
			}
		}
		
		String output="";
		
		for (int n = 0; n < message.length(); n++) {
				char msg=message.charAt(n);
				if(msg==' ') {
					output=output+msg;
				}else {
					char valueinMapTable=map.get(msg);
					output=output+valueinMapTable;
				}
		}
		
		
		return output;
		
	}

}
