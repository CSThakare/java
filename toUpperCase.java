import java.util.Scanner;
class toUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner tk = new Scanner(System.in);
		System.out.print("Enter the currency :");
		String curr =tk.next().toUpperCase();
		System.out.println(curr);
	}
}
