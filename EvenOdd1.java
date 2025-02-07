import java.util.Scanner;
class EvenOdd1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a num:");
		int num = new Scanner (System.in).nextInt();
		System.out.println(num/2==num/2.0);
	}
}