package InverseOfANumber;
import java.util.*;
import java.lang.Math;
public class Inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans = 0;
        int op=1;
        while(num>0)
        {
            int rem=num%10;
            int id=op;
            int ip= rem;

            ans+=id*(int)Math.pow(10,ip-1);
            num/=10;
            op++;
        }
        System.out.println(ans);
    }
}
