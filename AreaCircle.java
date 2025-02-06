import java.util.Scanner;
class  AreaCircle
{
	public static void main(String[] args) 
	{
		final float pi=22/7;
		System.out.print("radius :");
		Scanner sc = new Scanner(System.in);
		int r =sc.nextInt();
		
		
		float area= pi*r*r;
		System.out.println("Area of circle with radius :"+r+" ="+area);
	}
}
