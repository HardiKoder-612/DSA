package NumberSystem;

import java.util.*;
import java.lang.*;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int b=sc.nextInt();
        int temp=num;
        int ans=0;
        int i=0;
        while(temp>0)
        {
            int rem=temp%10;
            ans=ans+(int) Math.pow(b,i)*rem;
            temp/=10;
            i++;
        }
        System.out.println(ans);
    }
}
