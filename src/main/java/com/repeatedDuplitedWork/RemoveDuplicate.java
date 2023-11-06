package com.repeatedDuplitedWork;

import org.junit.Test;

public class RemoveDuplicate {
	
	
	@Test
	public void test() {
		System.out.println(removeContinuosSimilarCharInString("MissiSippi"));
	}
	
	public static String removeContinuosSimilarCharInString(String input){

		 StringBuilder sb=new StringBuilder();
		 		sb.append(input.charAt(0));   

		  for(int i=1;i<input.length();i++){
			   if(input.charAt(i)!=input.charAt(i-1)){
					sb.append(input.charAt(i));
					}
				}
			return sb.toString();
	}
}
