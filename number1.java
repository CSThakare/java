import java.util.Scanner;
class number1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int num = new Scanner (System.in).nextInt();
		String op= ((num%2==0&&num%5==0)?("Hi Two Five"):((num%2==0)?("Hi Two"):((num%5==0)?("Hi Five"):(" "))));
		System.out.println(op);
	}
}
