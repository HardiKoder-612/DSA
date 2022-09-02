package SortingTechniques;

import java.io.*;
import java.util.*;

public class CountSort {

    public static void countSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] ans = new int[arr.length];
        //make frequency arr
        int[] farr = new int[range];
        for (int j : arr) {
            farr[j - min]++;
        }
        //convert it into prefix sum array
        for(int i = 1 ; i < farr.length; i++){
            farr[i] += farr[i - 1];
        }
        //stable sorting(filling ans array)
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = farr[arr[i] - min] - 1;
            ans[pos] = arr[i];
            farr[arr[i] - min]--;
        }
        //filling original array with the help of ans array
        System.arraycopy(ans, 0, arr, 0, arr.length);
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
        print(arr);
    }

}


