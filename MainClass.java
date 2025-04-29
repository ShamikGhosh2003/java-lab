import java.util.Scanner;
public class MainClass
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course course = new Course();
		course.set_course_info(sc);
		course.get_course_info();
		sc.close();
	}
}
