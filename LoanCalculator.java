import java.util.Scanner;
class LoanCalculator
{
	public static void main(String[] args) 
	{
		Scanner tk = new Scanner(System.in);
		System.out.print("Enter the Months :");
		int mon = tk.nextInt();
		int month=mon%12;
		System.out.println(mon/12+(month/100.0));
	}
}
