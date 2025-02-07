import java.util.Scanner;
class PoundKilogram 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number in pound : ");
		float f = new Scanner(System.in).nextFloat();
		System.out.println(f+" pounds is "+f*0.454+" Kilograms");
	}
}
