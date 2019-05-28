class  Ram
{
	static
	{
		 System.out.println("i am from static");
	}
	
	{
			 System.out.println("i am from iib");
	}

	public static void main(String[] args)
	{
		System.out.println("I am from main");
		Ram r1 = new Ram();
		Ram r2 = new Ram();
	}
}
