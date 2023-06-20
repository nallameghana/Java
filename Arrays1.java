import java.io.*;
import java.util.*;
class Arrays1
{
	public static void main(String[] args)
	{
		System.out.println("\nMultidimensional array : ");
                int[][] x1 = {{10, 20, 50}, {30, 40, 50}};
                for(int k1 = 0; k1 < 2; k1++)
                {
                        for(int k2 = 0;k2 < 3; k2++)
                        {
                                System.out.print(x1[k1][k2]);
                                System.out.print("\t");
                        }
                }
		System.out.println("Enter the no of rows and columns of array : ");
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int x[][] = new int[r][c];
		for(int i1 = 0; i1 < r; i1++)
		{
			for(int j1 = 0; j1 < c; j1++)
			{
				x[i1][j1] = s.nextInt();
                         }
		}
		for(int i1 = 0; i1 < r; i1++)
		{
			for(int j1 = 0; j1 < c; j1++)
			{
				System.out.print(x[i1][j1]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
	}
}

