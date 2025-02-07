import java.util.Scanner;
class CalTips 
{
	public static void main(String[] args) 
	{
		Scanner tk= new Scanner(System.in);
		System.out.println("Enter the Subtotal "+"and a tip rate");
		short sub =tk.nextShort();
		float tip = tk.nextFloat();
		float tiprate = sub*(tip/100.0f);
		float total = sub+tiprate;
		System.out.println("The tip is "+tiprate+" and total is "+total);
	}
}
