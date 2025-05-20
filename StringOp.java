import java.util.Scanner;

class StringOp
{
	public static boolean isPalin(String s)
	{
		int l=s.length()-1;
		for(int i=0; i<= l/2; i++)
		{
			if(s.charAt(i)!=s.charAt(l-i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
		int ch;
		do{
			System.out.println("---------------------MENU----------------");
			System.out.println("1. Count occurences of 'a'. \n2. Count occurences of 'and'. \n3. Check if starts with 'The'. \n4. Convert String to character array. \n5. Display tokens (split by space, @ or .) \n6. Find largest palindrome (after removing non-alphaneumeric characters). \n0. Exit.");
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			sc.nextLine();

			switch(ch)
			{
				case 1:
					int count_a=0;
					for(int i=0;i<str.length();i++)
					{
						if(str.charAt(i)=='a')
							count_a++;
					}
					System.out.println("Number of a's: "+count_a);
					break;
				case 2:
					String words[]=str.toLowerCase().split(" ");
					int count_and=0;
					for(String word: words)
						if(word.equals("and"))
							count_and++;
					System.out.println("Number of 'and's are: "+count_and);
					break;
				case 3:
					if(str.startsWith("The"))
						System.out.println("Starts with The");
					else 
						System.out.println("Does not start with The");
					break;
				case 4:
					char arr[]=str.toCharArray();
					System.out.println("Character array: ");
					for(int i=0;i<arr.length;i++)
						System.out.print(arr[i]+",");
					System.out.println();
					break;
				case 5:
					String tokens[]=str.split("[ @,.]");
					System.out.println("Tokens: [ ");
					for(String token: tokens)
						System.out.print(token+",");
					System.out.println(" ]");
					break;
				case 6:
					String clrstr=str.replaceAll("[^a-zA-Z0-9 ]","");
					String lpalin="";
					for(int i=0;i<clrstr.length();i++)
					{
						for(int j=i+1;j<clrstr.length();j++)
						{
							String substr=clrstr.substring(i, j);
							if(isPalin(substr) && lpalin.length() < substr.length())
								lpalin=substr;
						}
					}
					if(lpalin.length()!=0)
						System.out.println("Largest palindrome is: "+lpalin);
					else
						System.out.println("No Palindrome found.");
					break;
				default:
					System.out.println("Wrong input!");
					break;                    
			}

		}while(ch!=0);
		sc.close();
	}
}
