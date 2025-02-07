import java.util.Scanner;
class NumOfYears 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of minutes : ");
		int min = new Scanner(System.in).nextInt();
		float yr1 = min/(60*24*365.0f);
		int yr2= (int)yr1;
		float yr=yr1-yr2;
		float dy1= yr*365;
		int dy=(int) dy1;
		System.out.println(min+" minutes is approximately "+yr2+" years "+dy+" days ");
	}
}
