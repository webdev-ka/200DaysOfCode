import java.util.Scanner;
class WithDp
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(fib(n,new int[n+1]));
	}
	static int fib(int n,int dp[]){
		if(n==0||n==1)
			return n;
		if(dp[n]!=0)
			return dp[n];
			System.out.println("he");
		dp[n]=fib(n-1,dp)+fib(n-2,dp);
		return dp[n];
	}
}