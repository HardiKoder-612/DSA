package MaximumCrossingSubArray;

import java.util.*;
import java.lang.*;

public class MaximumCrossingSubarray {
    public static int findMaximumSum(int arr[],int low,int high)
    {
        if(low==high)
        {
            return arr[0];
        }
        int mid =(low+high)/2;
        int leftMax=Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=low;i--)
        {
            sum+=arr[i];
            if(sum>leftMax)
                leftMax=sum;
        }
        int rightMax=Integer.MIN_VALUE;
        sum=0;
        for(int i=mid+1;i<=high;i++)
        {
            sum+=arr[i];
            if(sum>rightMax)
                rightMax=sum;
        }
        int maxLeftRight=Integer.max(findMaximumSum(arr,low,mid),findMaximumSum(arr,mid+1,high));
        return Integer.max(maxLeftRight,rightMax+leftMax);
    }
    public static int findMaximumSum(int arr[])
    {
        if(arr.length==0)
        {
            return 0;
        }
        return findMaximumSum(arr,0, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your ARRAY: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=findMaximumSum(arr);
        System.out.println("Sum of the maximum sub-array is: "+max);
    }
}
