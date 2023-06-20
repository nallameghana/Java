import java.io.*;
import java.util.*;
class Arrays
{
	public static void main(String[] args)
	{
		int[] x = {10, 80, 90, 80};
		System.out.print("Length of given array : ");
		System.out.print(x.length);
		int[] y = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			y[i] = s.nextInt();
		}
		int k = 0, j = 0;
		int[] e = new int[5];
		int[] o = new int[5];
		for(int i = 0; i < 5; i++)
		{
			if(y[i]%2 == 0) {
				e[k] = y[i];
		                k += 1;	}
			else {
				o[j] = y[i];
				j += 1; }
		}
		System.out.print("\nEven numbers : ");
		for(int l = 0; l < k; l++)
		{
			System.out.print(e[l]);
			System.out.print("\t");
		}
	        System.out.print("\nOdd numbers : ");
                for(int l = 0; l < j; l++)
                {
                        System.out.print(o[l]);
                        System.out.print("\t");
                }
		
	}
}
