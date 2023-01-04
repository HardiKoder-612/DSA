package DPAndGreedy;

import java.util.*;
import java.lang.*;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []vals=new int[n];
        int []wts=new int[n];
        for (int i = 0; i < n; i++) {
            vals[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wts[i]=sc.nextInt();
        }
        int cap=sc.nextInt();
        int dp[]=new int[cap+1];
        dp[0]=1;
        for (int bagc = 0; bagc < dp.length; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if(wts[i]<=bagc)
                {
                    int rembagc=bagc-wts[i];
                    int rembagv=dp[rembagc];
                    int tbagv=rembagv+vals[i];

                    if(tbagv>max)
                        max=tbagv;
                }
            }
            dp[bagc]=max;
        }
        System.out.println(dp[cap]);
    }
}
