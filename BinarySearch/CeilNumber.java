package BinarySearch;
//If we see array is sorted then directly apply binary search
//Ceil is the smallest value greater than that number in that respective array
public class CeilNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        int ans=ceil(arr,target);
        System.out.println(arr[ans]);
    }
    public static int ceil(int arr[],int target)
    {
        int s=0,e=arr.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m])
                return target;
            else if(target>arr[m])
            {
                s=m+1;
            }
            else
                e=m-1;
        }
        return s;
    }
}
