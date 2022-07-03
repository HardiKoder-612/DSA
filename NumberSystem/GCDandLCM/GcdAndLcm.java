package NumberSystem.GCDandLCM;

import java.util.Scanner;
public class GcdAndLcm {
    public static int findGCD(int num1,int num2)
    {
        while(num1%num2!=0)
        {
            int rem=num1 % num2;
            num1=num2;
            num2=rem;
        }
        return num2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd = findGCD(num1,num2);
        System.out.println("GCD of the both the number is: "+gcd);
        System.out.println(num1);
        int lcm=num1*num2/gcd;          //gcd x lcm =num1 x num2
        System.out.println("LCM of the both the number is: "+lcm);
    }
}
