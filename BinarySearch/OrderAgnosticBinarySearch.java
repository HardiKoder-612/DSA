package BinarySearch;

//Take first and last elements of array and compare
//If first element is greater than the second than it is in ascending order
//If first element is lesser than the second than it is in descending order
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={78,65,61,56,45,34,23,12,11,9,5,3};
        int target =12;
        System.out.println(orderagnosticbinarydearch(arr,target));
    }
    public static int orderagnosticbinarydearch(int arr[],int target)
    {
        int s=0;
        int e=arr.length-1;
        boolean isAsc;
        if(arr[s]<arr[e])
            isAsc=true;
        else
            isAsc=false;
        if(isAsc)
        {
            while(s<=e)
            {
                int m=s+(e-s)/2;
                if(arr[m]==target)
                    return m;
                if(target<arr[m])
                {
                    e=m-1;
                }
                else if(target>arr[m])
                {
                    s=m+1;
                }
                else
                    return m;
            }
        }
        else
        {
            while(s<=e)
            {
                int m=s+(e-s)/2;
                if(arr[m]==target)
                    return m;
                if(target>arr[m])
                {
                    e=m-1;
                }
                else if(target<arr[m])
                {
                    s=m+1;
                }
                else
                    return m;
            }
        }
        return -1;
    }
}
