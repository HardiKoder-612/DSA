package DPAndGreedy;

import java.util.*;
import java.lang.*;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []vals=new int[n];
        int []wts=new int[n];
        System.out.println("Enter Values array->");
        for (int i = 0; i < n; i++) {
            vals[i]=sc.nextInt();
        }
        System.out.println("Enter Weights array->");
        for (int i = 0; i < n; i++) {
            wts[i]=sc.nextInt();
        }
        System.out.print("Enter the capacity of the bag: ");
        int cap=sc.nextInt();

        int [][]dp=new int[n+1][cap+1];
        // We leave first row and coloumn because they already zero
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(j>=wts[i-1])
                {
                    int remcapacity = j-wts[i-1];
                    if(dp[i-1][remcapacity] + vals[i-1]> dp [i-1][j])
                    {
                        dp[i][j]=dp[i-1][remcapacity] + vals[i-1];
                    }
                    else
                        dp[i][j]=dp[i-1][j];    //If he doesn't bat i.e. we don't chose to put in bag
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        System.out.println("Max Profit will be: Rs."+dp[n][cap]);
    }
}
