//        1								1
//        1	2						2	1
//        1	2	3				3	2	1
//        1	2	3	4		4	3	2	1
//        1	2	3	4	5	4	3	2	1


        package Pattern;

import java.util.*;
import java.lang.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=2*n-3;
        int st=1;

        for (int i=0;i<n;i++)
        {
            int val=1;
            for (int j = 0; j < st; j++)
            {
                System.out.print(val+"\t");
                val++;
            }
            for (int j=0;j<sp;j++)
            {
                System.out.print("\t");
            }
            if(i==n-1)
            {
                st--;
                val--;
            }
            for (int j = 0; j < st; j++)
            {
                val--;
                System.out.print(val+"\t");
            }

            st++;
            sp-=2;
            System.out.println();
        }
    }
}
