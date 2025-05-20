import java.util.Scanner;

class Matrix3D
{
	//int m1[][][],m2[][][];
	//int diff1[][][],diff2[][][];
	//int k,m,n;
	public void takeInput(Scanner sc,int arr[][][],int k,int m,int n)
	{
		for(int i=0;i<k;i++)
		{
			System.out.println("sub-matrix "+(i+1)+": ");
			for(int j=0;j<m;j++)
			{
				for(int f=0;f<n;f++)
				{
					System.out.print("\nm["+i+"]["+j+"]["+f+"]: ");
					arr[i][j][f]=sc.nextInt();
				}
			}
		}
	}
	public void display(int arr[][][],int k,int m,int n)
	{
        for(int i=0;i<m;i++)
		{
			for(int j=0;j<k;j++)
			{
				System.out.print("[ ");
				for(int f=0;f<n;f++)
				{
					System.out.print(arr[j][i][f]+" ");
				}
				System.out.print("]    ");
			}
			System.out.println();
		}

	}
	public void consecutiveDiff(int arr[][][],int diff1[][][],int k,int m,int n)
	{
		for(int i=1;i<k;i++)
			for(int j=0;j<m;j++)
				for(int f=0;f<n;f++)
					diff1[i-1][j][f]=arr[i][j][f]-arr[i-1][j][f];				
	}
	public void correspondDiff(int m1[][][],int m2[][][], int diff2[][][], int k, int m, int n)
	{
		for(int i=0;i<k;i++)
			for(int j=0;j<m;j++)
				for(int f=0;f<n;f++)
					diff2[i][j][f]=m1[i][j][f]-m2[i][j][f];

	}
	public static void main(String args[])
	{
		int m1[][][],m2[][][],diff1[][][],diff2[][][];
		int k,m,n;
		Scanner sc = new Scanner(System.in);
        
		System.out.print("\nEnter the number of sub-matrices(k): ");
		k=sc.nextInt();
		System.out.print("\nEnter the number of rows: ");
		m=sc.nextInt();
		System.out.print("\nEnter the number of column: ");
		n=sc.nextInt();

		m1=new int[k][m][n];
		m2=new int[k][m][n];
		diff1=new int[k-1][m][n];
		diff2=new int[k][m][n];

		Matrix3D ob = new Matrix3D();
		System.out.println("Enter the value of Matrix M1: ");
		ob.takeInput(sc,m1,k,m,n);
		System.out.println("Enter the value of Matrix M2: ");
		ob.takeInput(sc,m2, k, m, n);
		System.out.println("\nMatrix M1:\n");
		ob.display(m1,k,m,n);
		System.out.println("\n");
		System.out.println("\nMatrix M2:\n");
		ob.display(m2, k, m, n);
		System.out.println("\nConsecutive difference for M1: \n");
		ob.consecutiveDiff(m1, diff1, k, m, n);
		ob.display(diff1, k-1, m, n);
        System.out.println("\nConsecutive difference for M2: \n");
		ob.consecutiveDiff(m2, diff1, k, m, n);
		ob.display(diff1, k-1, m, n);
        System.out.println("\nCorresponding difference for M1 & M2: \n");
		ob.correspondDiff(m1,m2, diff2, k, m, n);
		ob.display(diff2, k, m, n);
	}
}
