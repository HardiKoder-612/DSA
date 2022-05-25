package Arrays;
import java.util.*;
import java.lang.*;
//We can use this for string also
public class ReverseArray {
    public static void main(String[] args) {
        int []arr={1, 2, 3};
        for (int i = 0,end=arr.length-1; i <end; i++,end--) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
