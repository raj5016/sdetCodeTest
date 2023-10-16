package mandatoryHomeWork.week16;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_682_BaseBallGame {
	//https://leetcode.com/problems/baseball-game/
	
	@Test
	public void test() {
		Assert.assertEquals(30, calPoints(new String[] {"5","2","C","D","+"}));
	}
	
	//Brute force
	 public int calPoints(String[] operations) {
		 int output=0;
		 List<Integer>  list=new ArrayList<Integer>();
		 
		 for (int i = 0; i < operations.length; i++) {
			 int length=list.size();
			String oper= operations[i];
			if(oper.equals("C")) {
				list.remove(length-1);
			}else if(oper.equals("D")) {
				int total=list.get(length-1)*2;
				list.add(total);
			}else if(oper.equals("+")) {
				int val=list.get(length-1)+list.get(length-2);
				list.add(val);
			}else {
				list.add(Integer.parseInt(operations[i]));
			}
		}
		 for (Integer value : list) {
			output+=value;
		}
	     return output;   
	 }
	 
	 //Stack approach
	public int calPoints1(String[] operations) {
		Stack<Integer> st = new Stack<Integer>();
		int result = 0;
		for (String opr : operations) {
			if (opr.equals("C")) {
				st.pop();
			} else if (opr.equals("D")) {
				st.push(st.peek() * 2);
			} else if (opr.equals("+")) {
				int pop1 = st.pop();
				int pop2 = st.pop();
				st.push(pop2);
				st.push(pop1);
				int sum = pop1 + pop2;
				st.push(sum);
			} else {
				st.push(Integer.parseInt(opr));
			}
		}
		while (!st.isEmpty()) {
			result += st.pop();
		}
		return result;
	}
	 

}
