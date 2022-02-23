/* Write a demo program to demo on predicate chaining. */
package Day3Assignments;
import java.util.function.Predicate;
public class Day3Problem5 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = n ->n%2==0;
        Predicate<Integer> p2 = n ->n>0;
        Predicate<Integer> p3 = n ->{
        	int count = 0;
        	for(int i=2;i<n;i++)
           {
               if(n%i==0)
               {
            	   count++;
               }
           }
        	if(count==0)
        	{
        		return true;
        	}
        	else {
        		return false;
        	}
        };
		Predicate<Integer> p4 = n ->n==10;
		
		System.out.println(p1.and(p2).test(20));//true
		System.out.println(p1.or(p2).or(p3).test(6));//true
		System.out.println(p1.and(p2).and(p3).test(6));//false
		System.out.println(p1.negate().test(9));//true
	    System.out.println(p1.and(p4).test(10));//true	
		
	}

}