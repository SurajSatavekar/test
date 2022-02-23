/* Program to display names starts with 'K' by using Predicate */
package Day3Assignments;
import java.util.function.Predicate;
public class Day3Problem3 {
	public static void main(String[] args) {
	
		Predicate<String> p1 = ch -> {
		boolean result = false;
		for(int i=0;i<ch.length();i++)
		{
         if(ch.charAt(0)=='K') {			
        	result = true;
         }
         else
         {
        	 return false;
         }
		}
		return result;
		};
		
		System.out.println(p1.test("Kiran"));// true
		System.out.println(p1.test("Rahul"));//false
		System.out.println(p1.test("Komal"));//true
		System.out.println(p1.test("Suraj"));//false

	}

}