import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("1st Number : " + a);
		System.out.println("1st Number : " + b);
		
		
	}
}
