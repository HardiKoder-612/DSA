/*
        1
       232
      34543
       232
        1

 */




package Pattern;

import java.util.*;
import java.lang.*;

public class NumberDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sn=1,sp=n/2,val=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <sp; j++) {
                System.out.print("\t");
            }
            int cval=val;
            for(int j=0;j<sn;j++)
            {
                System.out.print(cval+"\t");
                if(j<sn/2)
                    cval++;
                else
                    cval--;
            }
            if(i<n/2)
            {
                sn+=2;
                sp--;
                val++;
            }
            else
            {
                sp++;
                sn-=2;
                val--;
            }

            System.out.println();

        }
    }
}
