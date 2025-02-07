import java.util.Scanner;
class AreaOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner tk = new Scanner(System.in);
		System.out.println("Enter the radius and height of a cylinder :");
		float radius = tk.nextFloat();
		float height = tk.nextFloat();
		//final float pi = 22.0f/7f;
		float area = 3.14f*radius*radius;
		float volume = area*height;
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);
	}
}
