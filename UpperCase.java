import java.util.Scanner;
class UpperCase
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a character :");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.print((ch>=65&&ch<=90)?(ch+" is a Uppercase Ap"):(ch+" is a Uppercase Alphabet"));
	}
}
