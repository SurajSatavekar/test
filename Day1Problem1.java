//Given an int array and a number as input, write a program to add all the elements in the array greater than the given number.
//Finally reverse the digits of the obtained sum and print it.

//Example:
//Input Array = {10,15,20,25,30,100}
//Number = 15
//sum = 20 + 25 + 30 + 100 = 175
//output = 571
package Day1Assignments;
public class Day1Problem1 {

	public static void main(String[] args) {
	 int arr[] = {10,15,20,25,30,100};
	 int sum = 0;
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>15)
		 {
			 sum = sum + arr[i];
		 }
	 }
	 int temp = sum ;
	 int rev = 0;
	 while(temp>0)
	 {
		 int rem = temp%10;
		 rev = (rev *10 )+ rem;
		 temp = temp/10;
	 }
	 System.out.println("Output = "+rev);
	 
	}

}