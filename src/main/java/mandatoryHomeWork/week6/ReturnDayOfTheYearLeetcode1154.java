package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class ReturnDayOfTheYearLeetcode1154 {
	
	//https://leetcode.com/problems/day-of-the-year/
	

	
	@Test
	public void test() {
		Assert.assertEquals(41, countDaysInaYear("2019-02-10"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(91, countDaysInaYear("2020-03-31"));
	}
	
	public int countDaysInaYear(String str) {
		String[] s=str.split("-");
		int year=Integer.parseInt(s[0]);
		int month=Integer.parseInt(s[1]);
		int date=Integer.parseInt(s[2]);
		
		boolean isleap=isLeapYear(year);
		int totalDays=0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
		  for (int i = 0; i <month-1 ; i++) {
	            if (isleap && i == 1) { //if it leap year we are adding +1
	            	
	            	totalDays =totalDays+ days[i] + 1;
	                continue;
	            }
	            totalDays = totalDays+days[i];
	        }
	        return totalDays + date;		
		
	}
	
	public boolean isLeapYear(int year) {
		
		// if the year is divided by 4
		if (year%400==0) {
			return true;
		}if(year%100==0) {
			return false;
		}if(year%4==0) {
			return true;
		}
		return false;
	}

}
