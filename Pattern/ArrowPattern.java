/*
        *
        *	*
 *	*	*	*	*
        *	*
        *

 */

package Pattern;

import java.util.*;
import java.lang.*;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        for (int i = 0; i < n; i++) {
            if(i==n/2)
            {
                for (int j = 0; j <5; j++) {
                    System.out.print("*\t");
                }
            }
            else {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            }
            if(i<n/2)
            {
                st+=1;
            }
            else
            {
                st-=1;
            }
            System.out.println();
        }
    }
}
