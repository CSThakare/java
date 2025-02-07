import java.util.Scanner;
class SumOfEvenOdd1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter 4 Digit No. : ");
		int num = new Scanner(System.in).nextInt();
		int evenSum = 0;
		int oddSum = 0;
		int temp = 0;
		int rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;
		rem = num%10;
		temp = (rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num=num/10;
		System.out.println("Even Sum is "+evenSum);
		System.out.println("Odd Sum is "+oddSum);
	}
}

