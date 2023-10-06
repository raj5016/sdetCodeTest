package mandatoryHomeWork.week14;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LeetCode_205_IsomorphicString {
	
	//https://leetcode.com/problems/isomorphic-strings/description/
	@Test
	public void test() {
		assertTrue(isIsomorphic("egg", "add"));
	}
	
	
	public boolean isIsomorphic(String s, String t) {
		int n = s.length();
		int m = t.length();

		if (n != m)
			return false;
		if (s.equals(t))
			return true;

		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			char d = t.charAt(i);

			if (map.containsKey(c)) {
				if (!map.get(c).equals(d))
					return false;
			} else {

				if (map.containsValue(d))
					return false;

				map.put(c, d);
			}

		}
		return true;

	}

}
