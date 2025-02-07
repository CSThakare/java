import java.util.Scanner;
class  EVM
{
	public static void main(String[] args) 
	{
		Scanner tk = new Scanner(System.in);
		int bjp=0,cng=0,ss=0,mns=0,aap=0,nota=0;
		System.out.println("Welcome");
		System.out.println("Enter the population : ");
		int pop = tk.nextInt();
		
		for(int i=1;i<=pop;i++)
		{
			System.out.println("***List Of Parties***");
			System.out.println("1.BJP");
			System.out.println("2.CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.NOTA");
			System.out.println("");
			System.out.println("Enter the option : ");
			int opt = tk.nextInt();
			if(opt>=1 && opt<=6)
			{
				if(opt==1)
				{
					bjp++;
				}
				if(opt==2)
				{
					cng++;
				}
				if(opt==3)
				{
					ss++;
				}
				if(opt==4)
				{
					aap++;
				}
				if(opt==5)
				{
					mns++;
				}
				if(opt==6)
				{
					nota++;
				}
				if(!(opt>=1 && opt<=6))
				{
					i--;
					System.out.println("Invalid Option");
				}
			}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println(" Bjp has Won the Election by "+bjp+" votes");
			}
			if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println(" Congress has Won the Election by "+cng+" votes");
			}
			if(ss>=cng && ss>=bjp && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println(" Shiv Sena has Won the Election by "+ss+" votes");
			}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println(" AAP has Won the Election by "+aap+" votes");
			}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println(" MNS has Won the Election by "+mns+" votes");
			}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println(" Nota has Won the Election by "+nota+" votes");
			}
		}
	}
}
