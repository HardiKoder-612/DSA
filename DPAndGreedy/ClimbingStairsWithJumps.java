package DPAndGreedy;
//1. You are given a number n, representing the number of stairs in a staircase.
//        2. You are on the 0th step and are required to climb to the top.
//        3. You are given n numbers, where ith element's value represents - till how far from the step you
//        could jump to in a single move.
//        You can of course jump fewer number of steps in the move.
//        4. You are required to print the number of different paths via which you can climb to the top.
import java.util.*;
import java.lang.*;

public class ClimbingStairsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        arr[n]=1;
        int dp[]=new int[n+1];
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <=arr[i]&&i+j<=dp.length; j++) {
            dp[i]+=arr[i+j];
            }
        }
        System.out.println(dp[0]);
    }
}
