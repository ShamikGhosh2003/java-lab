import java.util.Scanner;

public class Sum
{
    short a,b;
    public static void main(String[] args) {
        Sum s = new Sum();
        s.take_input();
        s.calculate_sum();
    }
    public void take_input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a short number: ");
        a = sc.nextShort();
        System.out.println("\nEnter another short number: ");
        b = sc.nextShort();
    }
    public void calculate_sum()
    {
        int c = a+b;
        if(c > Short.MAX_VALUE || c < Short.MIN_VALUE)
            System.out.println("\nThe sum is outside the range of short");
        System.out.println("\nSum is: "+c);
    }
}
