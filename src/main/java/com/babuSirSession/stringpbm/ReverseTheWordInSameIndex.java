package com.babuSirSession.stringpbm;

import org.junit.Test;

public class ReverseTheWordInSameIndex {
	
	/*
	 * 
	 * 
			String str = "I am happy  engineer";
			Reverse the words and not the entire string 
			
			Define a stringBuilder/Buffer
			Split the sentence to words
			Iterate until the length of words
				convert the word to char(happy) h,a,p,p,y
				take the length of char, use j=0
				use break condition in while loop(j<n)
					swap the chars using temp variable
					decrese length,increment j
			append the swap result to string
			use a condition to check white space, if so append the white space
			return the string
	 */
	
	@Test
	public void testReverseTheWordInSameIndexMethod() {
		System.out.println(reverseTheWordInSameIndex("I am happy  engineer"));
		//output=I ma yppah reenigne
	}
	
	@Test
	public void testReverseTheWordInSameIndexMethodInSameMemory() {
		System.out.println(reverseWordInSameIndexInPlaceMemeory("I am happy  engineer"));
	}

	//With Space
	private String reverseTheWordInSameIndex(String input) {
		StringBuilder sb=new StringBuilder();
		String[] words=input.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			char[] ch=words[i].toCharArray();
			int lastIndex=ch.length-1, j=0;
			
			while(j<lastIndex) {
				char temp=ch[j];
				ch[j]=ch[lastIndex];
				ch[lastIndex]=temp;
				lastIndex--;
				j++;
			}
			sb.append(String.valueOf(ch));
			
			if(i!=words.length-1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	//2nd best approach without space
	private String reverseWordInSameIndexInPlaceMemeory(String input) {
		char[]  ch=input.toCharArray();
		int start=0,end=0;
		
		while(end<ch.length) {
			if(ch[end]!=' ') {
				start=end;
				
				while(end<ch.length && ch[end]!=' ') {
					end++;
				}
				reverseTheWord(ch,start,end-1);
			}
		end++;
		}
		return String.valueOf(ch);
	}

	private void reverseTheWord(char[] ch, int start, int end) {
		 while (start < end) {
	            char temp = ch[start];
	            ch[start] = ch[end];
	            ch[end] = temp;
	            start++;
	            end--;
	        }
	}

}