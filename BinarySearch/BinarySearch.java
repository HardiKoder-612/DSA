package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr= {12,21,23,32,34,54,56,76};
        int target=23;
        System.out.println("Target is found at index: "+binarysearch(arr,target));
    }
    public static int binarysearch(int arr[],int target)
    {
        int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return ans;
    }
}
