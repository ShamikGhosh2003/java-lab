import java.util.InputMismatchException;
import java.util.Scanner;

class Wrapper
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int ch;
		Integer obj;
		int num;
		String s;
		do
		{
			System.out.println("---------------MENU-----------------");
			System.out.println("1. basic type to object. \n2. object to basic type. \n3. basic type to String. \n4. String (holding numeric data) to numeric object. \n5. object to string. \n0. Exit.");
			ch=sc.nextInt();
			switch(ch)
			{
				case 0:
					break;
				case 1:
					System.out.print("\nEnter an integer: ");
					num=sc.nextInt();
					obj=num;
					System.out.println("Basic to Object: "+obj);
					break;
				case 2:
					System.out.print("Enter an integer: ");
					obj=Integer.valueOf(sc.nextInt());
					num=obj;
					System.out.println("Object to Basic: "+num);
					break;
				case 3:
					System.out.print("Enter an Integer: ");
					num = sc.nextInt();
					s=Integer.toString(num);
					System.out.println("Basic to String: "+s);
					break;
				case 4:
					System.out.print("Enter a string with neumeric data: ");
					sc.nextLine();
					s=sc.nextLine();
					try{
						obj=Integer.valueOf(s);
						System.out.println("String to integer obj: "+obj);
					}catch(Exception e)
					{
						System.out.println("String data not neumeric");
					}
					break;
				case 5:
                    System.out.print("Enter an integer: ");
					obj=Integer.valueOf(sc.nextInt());
					s=obj.toString();
					System.out.println("Object to String: "+s);
					break;
				default:
					System.out.println("Wrong Input");
					break;

			}
		}while(ch!=0);
		sc.close();
	}
}
