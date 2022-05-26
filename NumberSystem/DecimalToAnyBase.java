package NumberSystem;

import java.util.*;
import java.lang.*;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int b=sc.nextInt();
        int temp=num;
        int ans=0;
        int i=0;
        while(temp>0)
        {
            int rem=temp%b;
            ans=ans+rem*(int)Math.pow(10,i);
            temp/=b;
            i++;
        }
        System.out.println(ans);
    }
}
