package BinarySearch;

public class BiotonicOrMountainArray {
    public static void main(String[] args) {
        int []arr = {0,3,2,5,3,1};
        System.out.println(biotonic(arr));
    }
    public static boolean biotonic(int arr[])
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //This means we are in descending part of the array
                end=mid;
            }
            else
            {
                //This means we are in asceneding part of the array
                start=mid+1;    //because we know that mid +1 element is greater than mid element
            }
        }
        // in the end, start==end and pointing the largest element of the mountain array
        //At every point of time for start and end, they have the best possible answer til that time,
        // and if we are saying only one item is remaining because of  above line, that is the best answer.
        return start==end;
    }
}
