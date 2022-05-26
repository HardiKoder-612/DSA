package NumberSystem;

import java.util.*;
import java.lang.*;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int ans1=0,ans=0;
        int i=0;
        int temp1=num;
        while(temp1>0)
        {
            int rem=temp1%10;
            ans1=ans1+(int) Math.pow(b1,i)*rem;
            temp1/=10;
            i++;
        }
        int temp2=ans1;
        while(temp2>0)
        {
            int rem=temp2%b2;
            ans=ans+rem*(int)Math.pow(10,i);
            temp2/=b2;
            i++;
        }
        System.out.println(ans);
    }
}
