package DPAndGreedy;
//1. You are given a number n, representing the number of rows.
//        2. You are given a number m, representing the number of columns.
//        3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
//        4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from
//        any row in the left wall.
//        5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
//Input Format
//        A number n
//        A number m
//        e11
//        e12..
//        e21
//        e22..
//        .. n * m number of elements
//Output Format
//        An integer representing Maximum gold available.
import java.util.*;
import java.lang.*;

public class GoldMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }    
        int dp[][]=new int[n][m];
        for(int i=arr[0].length-1;i>=0;i--)
        {
            for (int j = arr.length-1; j >=0 ; j--) {
                if(j==arr[0].length-1)
                    dp[i][j]=arr[i][j];
                else if(i==0)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==arr.length-1)
                {
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1]));
            }
        }
        int max=dp[0][0];
        for (int i = 1;i<dp.length; i++) {
            if(max<dp[i][0])
                max=dp[i][0];
        }
        System.out.println(max);
    }
}
