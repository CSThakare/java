import java.util.Scanner;
class  UserName
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name : ");
		String un = sc.next().toUpperCase();

		for (int i=0;i<un.length() ;i++ )
		{
			System.out.println(un.charAt(i));
		}
	}
}
