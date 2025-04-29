import java.util.Scanner;
public class TextBook
{
	private String title, author, publisher;
	TextBook()
	{
		title="";
		author="";
		publisher="";
	}
	public void set_book_info(Scanner sc)
	{
		sc.nextLine();
		System.out.println("Enter the title of the TextBook: ");
		title=sc.nextLine();
		System.out.println("Enter the author of the TextBook: ");
		author = sc.nextLine();
		System.out.println("Enter the publisher name: ");
		publisher=sc.nextLine();
	}
	public void get_book_info()
	{
		System.out.println("TextBook titled: '"+title+"', is authored by : '"+author+"' and published by: '"+publisher+"'");
	}
}

