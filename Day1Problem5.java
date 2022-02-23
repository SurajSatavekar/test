/* Write a program to read an integer n, generate fibonacci series and calculate the sum of first n numbers in the series.
 *  Print the sum.
Sample Input :
5
Sample Output :
7
ie., [0 + 1 + 1 + 2 + 3 = 7]
*/
package Day1Assignments;
import java.util.Scanner;
public class Day1Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nnumber ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = a + b;
		System.out.print(a +" ");
		System.out.print(b +" ");
        for(int i=3;i<=num;i++)
        {
        	int c = a + b;
        	sum = sum + c;
        	System.out.print(c +" ");
        	a = b;
        	b = c;
        }
        System.out.println();
        System.out.println("Sum is "+ sum);
        sc.close();
	}

}