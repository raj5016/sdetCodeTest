package mandatoryHomeWork.week11;

import org.junit.Test;

public class EvenNumberWord {

	@Test
	public void test() {
		System.out.println(processInput("hey"));
	}
	
	@Test
	public void test1() {
		System.out.println(processInput("my input is java word oopsprog"));
	}
	
	    public static String processInput(String input) {
	    	 String[] words = input.split(" ");

	         String firstEvenWord = "";
	         int maxEvenLength = 0;

	         for (String word : words) {
	             if (word.length() % 2 == 0) {
	                 if (word.length() >= maxEvenLength) {
	                     firstEvenWord = word;
	                     maxEvenLength = word.length();
	                 }
	             }else {
	            	 firstEvenWord="00";
	             }
	         }
	         return firstEvenWord;
	    }



}
