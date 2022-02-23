/*Write a program to read an integer and find the sum of all odd numbers from 1 to the given number.
[inclusive of the given number]

if N = 9 [ 1,3,5,7,9]. Sum = 25 */

package Day1Assignments;
import java.util.Scanner;
public class Day1Problem2 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int sum =0;
    for(int i=1;i<=n;i++)
    {
    	if(i%2!=0)
    	{
    		sum = sum + i;
    	}
    }
  System.out.println("Sum of odd numbers :"+sum);
  sc.close();
		
	}

}
