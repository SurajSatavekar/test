/* Program to remove spaces present in the given String by using 
Function */

package Day3Assignments;

public class Day3Problem1 {
	public static void main(String[] args) {
		String str = "My Name Is Suraj";
		
		String str2 = str.replaceAll(" ", "");
		System.out.println(str2);
	}

}
