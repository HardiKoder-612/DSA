package DPAndGreedy;

import java.lang.*;

public class Fibonacci {
    public int fib(int n,int dp[])
    {
        if(n==0||n==1)
            return n;
        if(dp[n]!=0)
            return dp[n];
        int a=fib(n-1,dp);
        int b=fib(n-2,dp);
        int sum=a+b;
        dp[n]=sum;
        return sum;
    }
    public static void main(String[] args) {
    Fibonacci obj=new Fibonacci();
        int n=10;
        int arr[]=new int[n+1];
        System.out.println(obj.fib(n,arr));

    }
}
