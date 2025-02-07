import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a 3 digit no. : ");
		int num = new Scanner (System.in).nextInt();
		int dup = num;
		int rev = 0;
		int rem = num%10;
		rev = rev*10+rem;
		num = num/10;
		rem = num%10;
		rev = rev*10+rem;
		num = num/10;
		rem = num%10;
		rev = rev*10+rem;

		System.out.println(dup+ " : " + rev);
	}
}
