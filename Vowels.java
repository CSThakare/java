import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Charater : ");
		char ch= new Scanner(System.in).next().charAt(0);
		String op =(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+" is a Vowel"):(ch+" is a Constraint");
		System.out.println(op);
	}
}
