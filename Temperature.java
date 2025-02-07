import java.util.Scanner;
class Temperature 
{
	public static void main(String[] args) 
	{
		Scanner tk = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius ");
		double c = tk.nextDouble();
		double f = (9.0/5)*c+32;
		System.out.println(c+" Celsius is "+f+" Fahrenheit");
	}
}
