package com.supportclass;


import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

public final class RandomGenerator {

    // define few firstNames and lastNames 
    public static String[] firstNames = {"John", "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Robin"};
    public static String[] lastNames = {"Doe", "Smith", "Johnson", "Williams", "Jones", "Brown", "Hood"};
    public static Random random = new Random();
    static String firstName;
    static String lastName;
  
    public static String randomFirstName() {
        firstName = firstNames[random.nextInt(firstNames.length)] ;
        return firstName;
    }
    
    public static String randomLastName() {
        lastName = lastNames[random.nextInt(lastNames.length)] ;
        return lastName;
    }
    
    public static String randomPhoneNumber() {
    	String randomNumbers = RandomStringUtils.randomNumeric(7);
    	String phNo = 793+randomNumbers;
        return phNo;
    }


    public static String randomInteger(Integer length) {
        return RandomStringUtils.randomNumeric(length);
    }

  
    public static String randomAlphabetic(Integer length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

  
    public static String randomEmailAddress(String firstName,String lastName ) {
        String email = firstName+lastName +randomInteger(4)+ "@example.com";
        return email.toLowerCase();
    }

   

}