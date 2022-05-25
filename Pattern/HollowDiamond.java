package Pattern;

import java.util.*;
import java.lang.*;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int st=n/2+1,sp=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }
            for(int k=0;k<sp;k++)
            {
                System.out.print(' ');
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }
            if(i<=n/2)
            {
                st--;
                sp+=2;
            }
            else
            {
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}
