package Pattern;

import java.util.*;
import java.lang.*;

public class Swastik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int st=n/2,sp=1;
        for (int i = 0; i < n; i++)
        {
            if(i<n/2)
            {
                if(i==0)
                {
                    for (int j = 0; j <=n/2; j++) {
                        System.out.print("*\t");
                    }
                    for (int j = n/2+1; j < n-1; j++) {
                        System.out.print("\t");
                    }
                    System.out.println("*");
                }
                else
                {
                    for (int j = 0; j < n/2; j++)
                    {
                        System.out.print("\t");
                    }
                    System.out.print("*");
                    for (int j = n/2+1; j < n; j++) {
                        System.out.print("\t");
                    }
                    System.out.println("*");
                }
            }
            else if(i==n/2)
            {
                for (int j = 0; j < n; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            else if(i>n/2)
            {
                if(i==n-1)
                {
                    System.out.print("*");
                    for (int j = 1; j <=n/2; j++) {
                        System.out.print("\t");
                    }
                    for (int j = n/2; j < n; j++) {
                        System.out.print("*\t");
                    }
                }
                else
                {
                    System.out.print("*");
                    for (int j = 1; j <=n/2; j++) {
                        System.out.print("\t");
                    }
                    System.out.println("*");
                }
            }
        }
    }
}
