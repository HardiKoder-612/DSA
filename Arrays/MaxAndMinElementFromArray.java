package Arrays;
import java.util.*;

public class MaxAndMinElementFromArray {
    public static void main(String[] args) {
        int []arr={11,21,1,32,24,53,46,66,44,76,88};
        Arrays.sort(arr);
        System.out.println("Minimum element: "+arr[0]);
        System.out.println("Maximum element: "+arr[arr.length-1]);
    }
}
