package BinarySearch;

public class DescBinarySearch {
        public static void main(String[] args) {
            int arr[]={78,65,61,56,45,34,23,12,11,9,5,3};
            int target =12;
            System.out.println(search(arr,target,0,arr.length-1));
        }
        public static int search(int arr[],int target,int s, int e)
        {
            if(s>e)
                return -1;
            int m=s+(e-s)/2;
            if(arr[m]==target)
                return m;
            if(target>arr[m])
                return search(arr,target,s,m-1);
            return search(arr,target,m+1,e);
        }
}
