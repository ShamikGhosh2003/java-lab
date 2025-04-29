import java.util.Scanner;
public class Circle {
    double radius;
    public static final double PI = 3.14159;
    public Circle(double r)
    {
        radius=r;
    }
    public Circle(Circle obj)
    {
        this.radius=obj.radius; //This is deep copy
    }
    public double calculate_area()
    {
        return PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radisus of the circle: ");
        double rad = sc.nextDouble();
        Circle c1 = new Circle(rad);
        System.out.println("Area of the circle is: "+c1.calculate_area());
        Circle c2 = c1; // shallow copy
        System.out.println("Area of the circle (shallow copy) is: "+c2.calculate_area());
        Circle c3 = new Circle(c1);
        System.out.println("Area of the circle (deep copy) is: "+c3.calculate_area());
    }
}

