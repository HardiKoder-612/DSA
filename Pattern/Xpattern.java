/*


 *                  *
     *          *
           *
     *          *
 *                  *



 */
package Pattern;

import java.util.*;
import java.lang.*;

public class Xpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1)                  /// MVP MVP MVP MVP
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
