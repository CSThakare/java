class Census 
{
	public static void main(String[] args) 
	{
		long currentP = 312032486;
		final long sec = (365*24*60*60)*5;
		long birth = sec/7;
		long death = sec/13;
		long imm = sec/45;
		long newP = currentP+birth-death+imm;
		System.out.println(" Current Population is "+currentP);
		System.out.println(" New Population is "+newP);
	}
}
