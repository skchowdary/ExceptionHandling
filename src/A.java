import java.io.*;
class Sum
{
	static int i = 10;
	static int j = 20;
	static int sum;
	static void add()
	{
		sum = i+j;
	}
	public static void main(String[] args)
								 throws IOException
	{
		add();
		System.out.println(sum);
	}
}
class A extends Sum
{
	static int k = 30;
	static void add()
	{
		sum = i+j+k;
	}
	public static void main(String[] args)
	{
		add();
		System.out.println(sum);
	}
}
