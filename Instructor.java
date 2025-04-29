import java.util.Scanner;
public class Instructor
{
	private String name;
	private long phone;
	Instructor()
	{
		name="";
		phone=0;
	}
	public void set_instructor_info(Scanner sc)
	{
		System.out.println("Enter the name of the instructor: ");
		name=sc.nextLine();
		System.out.println("Enter the phone number of the instructor: ");
		phone = sc.nextLong();
	}
	public void get_instructor_info()
	{
		System.out.println("Instructor name: "+name+" has phone number: "+phone);
	}
}

