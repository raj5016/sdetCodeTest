package com.lamdaexpersiontests;

public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
				Greeter greeter=new Greeter();
				
				//helloWorldGreeting is instance of specific implementation of HelloWorldGreating  of Greeting Interface 
				Greeting helloWorldGreeting=new HelloWorldGreating(); 
				
				Greeting lamdaWorldGreeting=()->System.out.println("Hello World");
				
				helloWorldGreeting.perform();
				lamdaWorldGreeting.perform();

}
}