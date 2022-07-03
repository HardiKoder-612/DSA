//Example:
//        number: 273516
//        rotate by: 2
//        ans: 162735


package NumberSystem.RotateANumber;
import java.util.*;
import java.lang.*;
public class RotateANumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int d=sc.nextInt();
    int n=0, temp=num;
    while(temp>0)           //For the number of digits
    {
        n++;
        temp/=10;
    }
    d=d%n;                  // if value of d is very large
    if(d<0)                 // if d in negative
    {
        d=d+n;
    }
    int rem=num%(int)Math.pow(10,d);
    int q=num/(int) Math.pow(10,d);
    int ans=rem*(int)Math.pow(10,n-d)+q;
        System.out.println(ans);
    }
}
