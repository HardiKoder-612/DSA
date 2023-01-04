package Basics;
// We find gcd in it.
import java.util.*;
import java.lang.*;

public class BasicEuclid {
    public static int basiceuclid(int n1,int n2)
    {
        if (n1 < 0 || n2 < 0)
            return -1;
        if (n2 != 0) {
            return basiceuclid(n2, n1 % n2);
        }
        else
            return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=basiceuclid(a,b);
        System.out.println("gcd of both numbers is: "+ gcd);
    }
}
