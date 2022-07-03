package ArraysPractice.BenjaminBulbs;

import java.util.*;
import java.lang.*;

public class Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=1;i<=n;i++)
        {
            for(int j=0;i*j<n;j++)
            {
                if(arr[i*j]==0)
                    arr[i*j]=1;
                else
                    arr[i*j]=0;
            }
        }
        for (int i=0;i<n;i++)
            if (arr[i]==1)
                System.out.print(i+" ");
    }
}
