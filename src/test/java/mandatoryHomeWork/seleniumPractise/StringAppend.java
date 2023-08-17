package mandatoryHomeWork.seleniumPractise;

import org.apache.commons.lang3.RandomStringUtils;

public class StringAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String randomNumbers = RandomStringUtils.randomNumeric(7);
    	String phNo = 793+randomNumbers;
    	System.out.println(phNo);
	}

}
