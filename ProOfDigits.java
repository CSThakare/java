import java.util.Scanner;
class ProOfDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a 4 Digit No. : ");
		int num = new Scanner(System.in).nextInt();
		int rem = num%10;
		int pro = 1;
		pro =pro*rem;
		num=num/10;
		rem=num%10;
		pro =pro*rem;
		num=num/10;
		rem=num%10;
		pro =pro*rem;
		num=num/10;
		rem=num%10;
		pro =pro*rem;
		System.out.println("Product of Digits is "+pro);
	}
}
