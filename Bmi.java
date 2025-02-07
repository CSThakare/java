import java.util.Scanner;
class  Bmi
{
	public static void main(String[] args) 
	{
		Scanner tk =new Scanner(System.in);
		System.out.print("Enter weight in pounds : ");
		float pou = tk.nextFloat();
		System.out.print("Enter height in inches : ");
		float inch =tk.nextFloat();
		float weight = pou*0.4535f;
		float height = inch*0.0254f;
		float Bmi = weight/(height*height);
		System.out.println(" BMI is "+Bmi);
	}
}
