package mandatoryHomeWork.week5;

import org.junit.Assert;
import org.junit.Test;

public class HM_2_ColourOfChessBoard {
	
	//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
	
	@Test
	public void test() {
		Assert.assertEquals(false, findColourOfGivenCoordinates("a1"));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(true, findColourOfGivenCoordinates("h3"));
	}
	
	public boolean findColourOfGivenCoordinates(String coordinates) {
		int sum=0;
		int x=	coordinates.charAt(0)-'a';
		int y=	coordinates.charAt(1)-'0';
		sum=x+y;
		return sum%2==0;
		
	}

}
