package BinarySearch;
//It is the biggest number greater than or equal to target
public class FloorNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        int ans=floor(arr,target);
        System.out.println(arr[ans]);
    }
    public static int floor(int arr[],int target)
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
        return e;
    }
}

