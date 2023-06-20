import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter the age of person : ");
	    int age = s.nextInt();
	    if (age >= 18)
	    {
	        System.out.println("Eligible to vote");
	    }
	    else
	    {
	        System.out.println("Not Eligible to vote");
	    }
	    System.out.print("Enter a number : ");
	    int n = s.nextInt();
	    int rem = 0, sum = 0;
	    while(n != 0)
	    {
	        rem = n%10;
	        sum = sum*10 + rem;
	        n = n/10;
	    }
	    System.out.print("The reverse of given number is : ");
	    System.out.print(sum);
	    int k = 0;
	    int[] a = {1, 4, 5, 8, 9};
	    for(int i = 0; i < 5; i++)
	    {
	        k += a[i];
	    }
	    System.out.print("\nThe sum of array nos is : ");
	    System.out.print(k);
	}
}
