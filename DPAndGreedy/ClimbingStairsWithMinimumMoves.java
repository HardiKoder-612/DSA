package DPAndGreedy;
//1. You are given a number n, representing the number of stairs in a staircase.
//        2. You are on the 0th step and are required to climb to the top.
//        3. You are given n numbers, where ith element's value represents - till how far from the step you
//        could jump to in a single move.  You can of-course fewer number of steps in the move.
//        4. You are required to print the number of minimum moves in which you can reach the top of
//        staircase.
//        Note -> If there is no path through the staircase print null.
import java.util.*;
import java.lang.*;

public class ClimbingStairsWithMinimumMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Integer dp[]=new Integer[n+1];          //By default null will be the default value at each index
        for (int i = n-1; i >=0; i++) {
            if(arr[i]>0)
            {
                int min=Integer.MAX_VALUE;
                for (int j = 1; j <=arr[i] && i+j<dp.length; j++) {
                    if(dp[i+j]!=null)
                        min=Math.min(dp[i+j],min);
                }
                if(min!=Integer.MAX_VALUE)
                    dp[i]=min+1;
            }
        }
        System.out.println(dp[0]);
    }
}
