/* Program to find Number of spaces present in the given String by 
using Function */

package Day3Assignments;
public class Day3Problem2 {
	public static void main(String[] args) {
		String name = "Suraj Suresh Satavekar";
		int count =0;
		for(int i=0;i<name.length();i++)
		{
			 char ch=name.charAt(i);
	            if(ch==' ') {
	            count++;
	            }
		}
		System.out.println("Number of spaces are "+count);
	}
}
