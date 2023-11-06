package com.solveprogram;

import com.github.javafaker.Faker;

public class FakerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Faker faker=new Faker();

		System.out.println(faker.address().firstName());
	}

}
