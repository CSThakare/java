import java.util.Scanner;
class  CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner tk = new Scanner(System.in);
		System.out.println("CurrencyConverter");
		System.out.print("Enter the Amount(INR) : ");
		float inr = tk.nextFloat();
		System.out.println();

		System.out.println("***List Of Currency***");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println();
		System.out.print("Enter the currency :");
		String curr =tk.next().toUpperCase();
		
		float conCurr =0;
		if (curr.equals("USD"))
		{
			conCurr = inr/86.56f;
			System.out.println(inr+" INR = "+conCurr+ "USD");
		}
		else if (curr.equals("EUR"))
		{
			conCurr = inr/90.25f;
			System.out.println(inr+"INR = "+conCurr+ "EUR");
		} 
		else if (curr.equals("GBP"))
		{
			conCurr = inr*0.0093f;
			System.out.println(inr+"INR = "+conCurr+ "GBP");
		} 
		else if (curr.equals("PKR"))
		{
			conCurr = inr*3.23f;
			System.out.println(inr+"INR = "+conCurr+ "PKR");
		} 
	}
}