import java.util.Scanner;
class WithoutDp
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
	static int fib(int n){
		if(n==0||n==1)
			return n;
		return fib(n-1)+fib(n-2);
	}
}