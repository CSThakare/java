import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		final float pi = 22.0f/7.0f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius(cm) : ");
		float r = sc.nextFloat();
		float a = pi*r*r;
		float p = 2*pi*r;
		System.out.println("Area of Circle ="+a+"cm^2");
		System.out.println("Perimeter of Circle ="+p);
	}
}
