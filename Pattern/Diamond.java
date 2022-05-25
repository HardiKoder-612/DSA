//        *
//       ***
//      *****
//       ***
//        *


package Pattern;
import java.util.*;
import java.lang.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int st=1,sp=n/2;
        for (int i = 1; i <= n; i++) {
            for(int j=0;j<sp;j++)
                System.out.print(' ');
            for(int j=0;j<st;j++)
                System.out.print('*');
            if(i<=n/2)
            {
                sp--;
                st+=2;
            }
            else
            {
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
}
