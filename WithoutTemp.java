class WithoutTemp
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 01;
		System.out.println("BEFORE SWAPPING");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		a = a-b; // 9
		b = a+b; // 10
		a = b-a; // 1
		System.out.println("AFTER SWAPPING");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
}
