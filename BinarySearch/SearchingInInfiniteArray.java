package BinarySearch;
//We will double the size after every iteration
public class SearchingInInfiniteArray {
    public static void main(String[] args) {
    int []arr= {3,5,7,9,10,90,100,130,140,160,170};
    int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int arr[], int target)
    {
        //First find the range
        //first start with a box of size 2
        int start=0,end=1;

        //condition for the target to lie in the range
        while(target>arr[end])
        {
            int newstart=end+1;
            //double the box value
            end=end+(end-start+1)*2;        //1 will be adding because we are dealing with the index of the array
            start=newstart;
        }
        return search(arr,target,start,end);
    }
    public static int search(int arr[],int target,int s, int e)
    {
        if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target)
            return m;
        if(target<arr[m])
            return search(arr,target,s,m-1);
        return search(arr,target,m+1,e);
    }
}
