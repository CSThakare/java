import java.util.Scanner;
class  Calculator
{
	public static void main(String[] args) 
	{
		Scanner tk = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		float num1 = tk.nextFloat();
		System.out.print("Enter num2 : ");
		float num2 = tk.nextFloat();
		System.out.print("Enter operator : ");
		char op = tk.next().charAt(0);
		float opt =0;
		opt =(op=='+')? num1+num2:
			(op=='-')? num1-num2:
			(op=='*')? num1*num2:
			(op=='/')? num1/num2:
			(op=='%')? num1%num2:0;
		
		String output=num1+" "+op+" "+num2+" = "+opt;
		if (!(opt==0))
		{
			System.out.print(output);
		}
	}
}
