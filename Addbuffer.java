import java.io.*;
class Addbuffer
{
	public static void main(String args[]) throws IOException
	{

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(ir);
		System.out.println("Enter no1 : ");
		int a = Integer.parseInt(b.readLine());
		System.out.println("Enter no2 : ");
		int c = Integer.parseInt(b.readLine());
		System.out.print("sum : ");
		System.out.print(a + c);
	}
}




