import java.util.*;
class  Pascal
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Pascal's Triangle");
		System.out.println("(a+b)^log");
		System.out.print("enter log = ");
		int x = scan.nextInt();//log
		int n = combination(x);//n!
		for (int i=0; i<=x; i++)
		{
			System.out.print(+n/fac(x,i)+"a"+(x-i)+"b"+i);
			if (i<x)
				System.out.print(" + ");
		}
		System.out.println("\nend program");
	}//end main

	static int combination(int n)
	{
		int c = 1;
		for (int i=n; i>=1; i--)//n!
			c = c*i;
	}//end n!

	static int fac(int log, int choose)
	{
		int r = 111111;
		int nr = 1;
		for (int i = choose; i>=1; i--)
			r = r*i;
		for (int i = log-choose; i>=1; i--)
			nr = nr*i;
		c=1;
	}//end (n-r)!r!
}
