import java.util.Scanner;
class LowerCase
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a character :");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.print((ch>='a'&&ch<='z')?(ch+" is a Lowercase Alphabet"):(ch+" is not a Lowercase Alphabet"));
	}
}
