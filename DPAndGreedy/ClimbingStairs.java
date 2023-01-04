package DPAndGreedy;

//1. You are given a number n, representing the number of stairs in a staircase.
//        2. You are on the 0th step and are required to climb to the top.
//        3. In one move, you are allowed to climb 1, 2 or 3 stairs.
//        4. You are required to print the number of different paths via which you can climb to the top.
import java.util.*;
import java.lang.*;

public class ClimbingStairs {

    // with recursion(memorizatio)
    public static int stairs(int n,int dp[])
    {
        if(n==0)
            return 1;
        else if(n<0)
            return 0;
        if(dp[n]>0)
            return dp[n];
        int a=stairs(n-1,dp);
        int b=stairs(n-2,dp);
        int c=stairs(n-3,dp);
        int paths=a+b+c;
        dp[n]=paths;
        return paths;
    }
    //with iteration
    public static int countstairs(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        for (int i = 1; i <=n; i++) {
            if(i==1)
                dp[i]=dp[i-1];
            else if (i==2)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
            else
            {
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n+1];
        System.out.println("using dp recursion: "+stairs(n,arr));
        System.out.println("using dp table iteration: "+countstairs(n));

    }
}
