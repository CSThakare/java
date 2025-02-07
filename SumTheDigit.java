import java.util.Scanner;
class SumTheDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number  between 0 and 1000 : ");
		int num = new Scanner(System.in).nextInt();
		int add=0;
		int rem=num%10;
		add=add+rem;
		num=num/10;
		rem=num%10;
		add=add+rem;
		num=num/10;
		rem=num%10;
		add=add+rem;
		num=num/10;
		rem=num%10;
		add=add+rem;
		System.out.println("The sum of digits is "+add);
	}
}
