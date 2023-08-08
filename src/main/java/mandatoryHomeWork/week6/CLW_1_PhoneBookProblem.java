package mandatoryHomeWork.week6;

import java.util.HashMap;
import java.util.Scanner;

public class CLW_1_PhoneBookProblem {
	
	//https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
	
	static HashMap<String,Integer> map=new HashMap<String,Integer>();

	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
	
		while(in.hasNext())
		{	
			String s=in.nextLine();
			returnPersons(s);
	}

	}
	public static void returnPersons(String inputQuery){
		if(map.containsKey(inputQuery)) {
			   Object value = map.get(inputQuery);
	            System.out.println(inputQuery +"="+ value);
		}else {
				System.out.println("Not found");
		}
	}
}