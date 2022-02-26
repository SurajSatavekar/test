package Day5Assignments;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Person
{
	String name;
	int age;
	public Person(int age) {
		super();
		this.age = age;
	}
}
public class Day5Problem1 {
	static void printName(String name)
	{
		System.out.println("Hello "+name);
	}

public static void main(String[] args) 
{
	 Scanner sc = new Scanner(System.in);
	System.out.println("**Check Driving Eligibility of person** ");
	Predicate<Integer> p2 = n -> {
    	int count =0;
    	boolean res = false;
    	for(int i=2;i<n;i++)
    	{
    		if(n%i==0)
    		{
    			count++;
    		}
    	}
    	if(count==0)
    	{
    		res = true;
    	}
    	else {
    		res = false;
    	}
    	return res;
    };
   Function<Person,String> f1 = p ->{
	 String result = null;
	 if(p.age<18) 
	 result = "You are not eligible to drive vehicle. ";
	 else if(p.age>=18 && p.age<100)
	result = "You are eligible to drive vehicle. ";
	 else 
	result = "Enter valid age.";
	 return result;
   };
  
	Consumer<String> c1 = Day5Problem1::printName;
	 System.out.println("Enter the name");
	 String name = sc.next();
	 c1.accept("Suraj");
 
   System.out.println("Enter You age ");
   int age = sc.nextInt();
   Person p1 = new Person(age);
   String result = f1.apply(p1);
   System.out.println("Result is ---> "+result);	
   System.out.println("Age is prime number --> "+p2.test(age));//true
	}
}

