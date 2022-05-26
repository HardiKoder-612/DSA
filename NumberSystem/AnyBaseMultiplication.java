package NumberSystem;

import java.util.*;
import java.lang.*;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int b = sc.nextInt();
        int ans=getProduct(b,num1,num2);
        System.out.println(ans);
    }
    public static int getSum(int b,int temp1,int temp2)
    {
        int ans=0;
        int carry = 0;
        int p = 1;
        while (temp1 > 0 || temp2 > 0 || carry > 0) {
            int d1 = temp1 % 10;
            int d2 = temp2 % 10;
            temp1 /= 10;
            temp2 /= 10;

            int d = d1 + d2 + carry;
            carry = d / b;
            d = d % b;
            ans += d * p;
            p *= 10;
        }
        return ans;
    }
    public static int getProduct(int b,int n1,int n2)
    {
        int rv=0;
        int p=1;
        while(n2>0)
        {
            int d2=n2%10;
            n2/=10;
            int sprod=getProductWithASingleDigit(b,n1,d2);
            rv=getSum(b,rv,sprod*p);
            p=p*10;

        }
        return rv;
    }

    public static int getProductWithASingleDigit(int b, int n1,int d2)
    {
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || c<0)
        {
            int d1=n1%10;
            n1/=10;
            int d=d1*d2;

            c=d/b;
            d=d%b;

            rv+=d*p;
            p*=10;
        }
        return rv;
    }
}
