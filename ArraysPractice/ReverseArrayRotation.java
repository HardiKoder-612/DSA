package ArraysPractice;

public class ReverseArrayRotation {
    void reverse(int arr[], int d, int size)
    {
        for (int i = 0; i < d-1; i++) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        ReverseArrayRotation obj=new ReverseArrayRotation();
        int arr[]={1,2,3,4,5,6,7};
        int size=7;
        int d=2;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
        obj.reverse(arr,0,d);
        obj.reverse(arr,d,size);
        obj.reverse(arr,0,size);
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
    }
}
