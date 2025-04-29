import java.util.Scanner;
public class Course
{
	private String name;
	private Instructor instructor;
	private TextBook book;
	Course()
	{
		name="";
	    instructor=null;
		book=null;
	}
	public void set_course_info(Scanner sc)
	{
		System.out.println("Enter the name of the Course: ");
		name=sc.nextLine();

		instructor = new Instructor();
		System.out.println("Enter the instructor information: ");
		instructor.set_instructor_info(sc);
				
		book = new TextBook();
		System.out.println("Enter the TextBook information: ");
		book.set_book_info(sc);
	}
	public void get_course_info()
	{
		System.out.println("Course Name: " + name);
		instructor.get_instructor_info();
		book.get_book_info();
	}
}


