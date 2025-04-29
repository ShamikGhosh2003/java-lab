import java.util.Scanner;
public class StrTest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        String s2 = s1;
        System.out.println("s1 == s2: "+(s1==s2));
        System.out.println("s1.equals(s2): "+(s1.equals(s2)));
        
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println("s3 == s4: "+(s3==s4));
        System.out.println("s3.equals(s4): "+(s3.equals(s4)));
    }
}

