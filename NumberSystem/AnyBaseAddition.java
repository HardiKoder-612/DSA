package NumberSystem;

import java.util.*;
import java.lang.*;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2 =sc.nextInt();
        int b=sc.nextInt();
        int ans=0;
        int carry=0;
        int p=1;
        int temp1=num1,temp2=num2;
        while(temp1>0||temp2>0||carry>0)
        {
            int d1=temp1%10;
            int d2=temp2%10;
            temp1/=10;
            temp2/=10;

            int d=d1+d2+carry;
            carry=d / b;
            d=d % b;
            ans+=d*p;
            p*=10;
        }
        System.out.println(ans);
    }
}
