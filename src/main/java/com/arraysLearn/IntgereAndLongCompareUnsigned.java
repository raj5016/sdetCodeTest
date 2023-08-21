package com.arraysLearn;

public class IntgereAndLongCompareUnsigned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		System.out.println(Integer.compare(a, b));
		System.out.println(Integer.compareUnsigned(a, b));
		
		
		int x=20;
		int y=-10;
		
		System.out.println(Integer.compare(x, y));
		System.out.println(Integer.compareUnsigned(x, y));
		
		
		int o=-20;
		int p=10;
		
		System.out.println(Integer.compare(o, p));
		System.out.println(Integer.compareUnsigned(o, p));
		
		 long signedValueA = -123456789L;
	     long signedValueB = 987654321L;
	     
		System.out.println(Long.compare(signedValueA,signedValueB));
		System.out.println(Long.compareUnsigned(signedValueA,signedValueB));
		
		

	}

}
