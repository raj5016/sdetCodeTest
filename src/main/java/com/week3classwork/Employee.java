package com.week3classwork;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	public int id;

    public String name;

    public String city;

    public static int count = 0;

 

    //zero argument constructor. Gets called by default when an object is created for the Employee class

    public Employee(){}

 

    //Parameterized Constructor

    public Employee(int id, String name,String city)

    {

        super();
        this.id = id;

        this.name = name;

        this.city=city;
        count++;

    }

 

    public int getId() {

    return id;

    }

 

    public String getName() {
    return name;

    }

 

    public String getAddress() {

    return city;

    }

public static void main(String[] args) throws Exception

    {

     List<Employee> list = new ArrayList<Employee>();

 

     list.add(new Employee(1, "Ravi","Delhi"));

     list.add(new Employee(2, "Raj","Mumbai"));

     list.add(new Employee(3, "Rekha","Chennai"));

     list.add(new Employee(4, "Ram","Siliguri"));
     list.add(new Employee(5, "Raj","Siliguri"));

 
     int countOfRaj=0;
        for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.

        {

            System.out.print("ID, Name and City of the employee are : ");

            System.out.println(s.getId()+" "+s.getName()+" " +s.getAddress());
            if(s.getName()=="Raj") {
            	countOfRaj++;
            }
        }
        System.out.println("countOfRaj  is :"+ countOfRaj);


    }//End of main() method
}
