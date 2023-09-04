package mandatoryHomeWork.week9;

import java.util.Scanner;


public class CheckCharValue {
	
	public static void main(String[] args) {
		System.out.println(CheckCharValue.charValue('A'));
		System.out.println(CheckCharValue.charValueByAsci('a'));
	}
	

	public static int charValue(char c) {
		//Scanner in=new Scanner(System.in);
		//char c	=in.next().charAt(0);

		if(Character.isLowerCase(c)){
			return 0;
		}else if(Character.isUpperCase(c)){
			return 1;
		}else{
			return -1;
		}
		
	}
	
	public static int charValueByAsci(char c) {
		//Scanner in=new Scanner(System.in);
		//char c	=in.next().charAt(0);

		if (c >= 65 && c <= 90) {
			return 0;
        } else if (c >= 97 && c <= 122) {
			return 1;
        } else {
			return -1;
        }
		
	}

}
