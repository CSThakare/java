import java.util.Scanner;
class  UserName1
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name : ");
		String un = sc.next().toUpperCase();

		for (int i=0;i<un.length() ;i++ )
		{
			char n=un.charAt(i);
			if (n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
				System.out.println(n);
		}
	}
}
