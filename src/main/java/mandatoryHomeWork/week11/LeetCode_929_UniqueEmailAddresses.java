package mandatoryHomeWork.week11;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_929_UniqueEmailAddresses {
	
	/*
	 * 
	 * Logic:
	 * https://leetcode.com/problems/unique-email-addresses/description/
	 * 
	 * 
	 */
	
	@Test
	public void test() {
		System.out.println(numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
		Assert.assertEquals(2, numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
	}
	
	@Test
	public void test1() {
		System.out.println(numUniqueEmails(new String[] {"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
		Assert.assertEquals(3, numUniqueEmails(new String[] {"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
	}
	
	 public int numUniqueEmails(String[] emails) {  //test.email+alex@leetcode.com,test.e.mail+bob.cathy
	        Set<String> set=new HashSet<String>();
	        String outputString="";
	        String nameemail="";
	        String nameWithoutDot ="";
	        String nameWithoutPlus="";
	        
	        for (int i = 0; i < emails.length; i++) {
				String email=emails[i];
				 int nameIndex=email.indexOf('@');
				 CharSequence domain=email.subSequence(nameIndex, email.length());
				 CharSequence name=email.subSequence(0, nameIndex);
				 
				 nameemail=name.toString();
				 
				 if(nameemail.contains(String.valueOf('.'))) {
					 nameWithoutDot = nameemail.replace(".", "");
					 outputString=nameWithoutDot;
				 }else {
					 outputString=nameemail;
				 }
				 if(outputString.contains(String.valueOf('+'))) {
					 int indexOfPlusChar = outputString.indexOf('+');
					 nameWithoutPlus= outputString.substring(0, indexOfPlusChar);
					 outputString=nameWithoutPlus+domain;
				 }else {
					 outputString=outputString+domain;
				 }
				 set.add(outputString);
			}
	        
	        return set.size();
	 }
	

}
