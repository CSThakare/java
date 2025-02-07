import java.util.Scanner;
class Digits
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a character :");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.print((ch>='0'&&ch<='9')?(ch+" is a Digit"):(ch+" is not a Digit"));
	}
}
