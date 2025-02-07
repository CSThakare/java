import java.util.Scanner;
class  SeasonsProgram
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the month : ");
		String month = new Scanner(System.in).next().toUpperCase();

		String op = 
			(month.equals("OCT"))||(month.equals("NOV"))||
			(month.equals("DEC"))||(month.equals("JAN")) ? month+" is Winter Season":
			(month.equals("FEB"))||(month.equals("MAR"))||
			(month.equals("APR"))||(month.equals("MAY")) ? month+" is Summer Season":
			(month.equals("JUN"))||(month.equals("JUL"))||
			(month.equals("AUG"))||(month.equals("SEP")) ? month+" is Monson Season":
			" Invalid Month";
		System.out.println(op);
	}
}
