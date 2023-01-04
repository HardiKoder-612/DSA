package Basics;

import java.util.*;
import java.lang.*;

public class ExtendedEuclid {
    public static int extendeuclid(int n1,int n2,int x,int y)
    {
    return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=1,y=1;
        int g = extendeuclid(n1, n2, x, y);
        System.out.print("gcd(" + n1 + " , " + n2 + ") = " + g);
    }
}
