package mandatoryHomeWork.week5;

import org.openjdk.jol.vm.VM;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";
		String b=new String("Hello");
		String c=new String("Hello");
		String d="Hello";
		
		//Getting memory address //add dependency  //org.openjdk.jol
		System.out.println(VM.current().addressOf(a));   //31513298200
		System.out.println(VM.current().addressOf(b));	 //31513298256
		System.out.println(VM.current().addressOf(c));	 //31513298280
		System.out.println(VM.current().addressOf(d));	 //31513298200
		
		
		System.out.println(a==b);  //false
		System.out.println(b==c);  //false
		System.out.println(c==d);  //false
		System.out.println(a==d);  //true
		
		System.out.println(a.equals(b));  //true
		System.out.println(b.equals(c)); // true
		System.out.println(c.equals(d)); //true
		
		System.out.println(a=="Hello");   ///true
		
		a="vijay";
		System.out.println(VM.current().addressOf(a));	 //31516836568
		
		b="hari";
		System.out.println(VM.current().addressOf(b));	 //31516836784

	}

}
