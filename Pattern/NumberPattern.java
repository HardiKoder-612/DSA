package Pattern;
//        33333
//        32223
//        32123
//        32223
//        33333
import java.util.*;
import java.lang.*;

public class NumberPattern {
    static void printPattern(int N){
        // code here
        int k=2*N-2;
        for(int i=0;i<=k;i++)
        {
            for(int j=0;j<=k;j++)
            {
                int y=Math.min(j,i);//adress from all four corners mein se min nikalna padega
                int x=Math.min(k-j,k-i);
                x=Math.min(x,y);
                System.out.print(N-x);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
    }
}
