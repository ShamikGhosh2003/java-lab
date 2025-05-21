import java.util.Scanner;
class StringImp implements CharSequence {
    private String rev="";

    public StringImp(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);
    }

    @Override
    public int length(){
        return rev.length();
    }

    @Override
    public char charAt(int index){
        if(index<0 || index >= rev.length())
            System.out.println("Array index out of bounds!");
        return rev.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end)
    {
        if(start < 0 || end >= rev.length() || start > end)
            System.out.println("Invalid Subsequence");
        return rev.substring(start, end);
    }

    @Override
    public String toString()
    {
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();

        StringImp ob = new StringImp(s);
        System.out.println("Original: "+s);
        System.out.println("Reversed (toString): "+ob.toString());
        System.out.println("Length: "+ob.length());
        System.out.print("\nEnter an index: ");
        int index = sc.nextInt();
        System.out.println("\nElement at index "+index+" is: "+ob.charAt(index));
        System.out.print("Enter the start index: ");
        int start = sc.nextInt();
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();
        System.out.println("Substring is: "+ob.subSequence(start, end));
    }
}
