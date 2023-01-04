package DPAndGreedy;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to be checked: ");
        String str=sc.next();
        int n=str.length();
        String res="";
        int maxLength=1;
        int start=0;
        boolean table[][]=new boolean[n][n];
        // for substring of length 1
        for (int i = 0; i < n; i++) {
            table[i][i]=true;
        }
        // for substring of length 2
        for (int i = 0; i < n-1; i++) {
            if(str.charAt(i)==str.charAt(i+1))
            {
                table[i][i+1]=true;
                start=i;
                maxLength=2;
            }
        }
        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        res=str.substring(start,start+maxLength);
        System.out.println("Longest palindromic string is: "+res);
    }
}
