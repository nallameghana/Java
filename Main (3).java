import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		System.out.println("Enter a string : ");
		String s = br.readLine();
		System.out.println("Entered string is : " + s);
		System.out.println("Enter a number : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Entered number is : " + n);
		
	}
}
