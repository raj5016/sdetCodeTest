package mandatoryHomeWork.week6;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1185_DayOfTheWeek {
	
	//https://leetcode.com/problems/day-of-the-week/
	
		 public String dayOfTheWeek(int day, int month, int year) {
		        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		        //intDay has range from 1 to 7 start from Monday
		        int intDay  = LocalDate.of(year,month,day).getDayOfWeek().getValue(); 
		/*
		 * The expression is checking if intDay is equal to 7. If it is, then it returns
		 * days[0], which would typically correspond to the name of Sunday. If intDay is
		 * not equal to 7, then it returns days[intDay], which corresponds to the name
		 * of the day represented by the value of intDay.
		 */
		        return intDay==7?days[0]:days[intDay];
		    }
		 
		 @Test
		 public void test() {
			 Assert.assertEquals("Saturday", dayOfTheWeek(31, 8, 2019));
		 }

}
