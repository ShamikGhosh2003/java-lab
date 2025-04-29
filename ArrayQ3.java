import java.util.Scanner;
public class ArrayQ3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
            arr[i]=i+1;
        System.out.print("Array is: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        int size=n;
        int skip=2;
        while(skip <= size)
        {
            int count=0;
			System.out.println("\nElements are: ");
			for (int i = 0; i < size; i+=skip)
			{
				arr[count++]=arr[i];
				System.out.print(arr[count-1]+" ");
			}
            size=count;
            skip+=1;
        }
        System.out.println("\nFinal Array: ");
        for (int i = 0; i < size; i++) 
            System.out.print(arr[i]+" ");
    }
}

