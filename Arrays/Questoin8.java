package Arrays;

import java.util.*;

class Question8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={11,21,1,32,24,53,46,66,44,76,88};
        Arrays.sort(arr);
        int k=sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(k+"th smallest element of the array is: "+arr[k-1]);
        System.out.println(k+"th largest element of the array is: "+arr[(arr.length-k)]);
    }
}