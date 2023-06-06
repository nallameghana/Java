import java.io.*;
class Addbuffer
{
	public static void main(String args[]) throws IOException
	{

		InputStreamReader ir = InputStreamReader(System.in);
		BufferReader b = new BufferReader(ir);
		System.out.println("Enter no1 : ");
		int a = Integer.passInt(b.readLine());
		System.out.println("Enter no2 : ");
		int c = Integer.parseInt(b.readLine());
		System.out.print("sum : ");
		System.out.print(a + c);
	}
}




