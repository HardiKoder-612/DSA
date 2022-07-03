package StackPractice.SlidingWindowMaximum;
//You are given an array arr of n numbers. You are also given a number k, representing the size of the window.
//        You are required to find and print the maximum element in every window of size k.
//        First Sliding window is a subarray of size k, starting from 0th index ending at index k-1, i.e. subarray [0, k-1].
//        First Sliding window is a subarray of size k, starting from 0th index ending at index k-1, i.e. subarray [0, k-1].
//        On each "slide", this window moves right by one position, i.e. the new window is now a subarray of size k having indices [1, k], and so on.
//        Example:
//        Consider an array = {7, 5, 2, 6, 4, 3, 8, 1, 5} and window size k = 4. Then the maximum of each window will be:
//        Ans = [7, 6, 6, 8, 8, 8].
import java.util.*;
import java.lang.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for (int i = a.length-1; i>=3; i--) {
            int max=0;
            for (int j = i; j >= i-3; j--) {
                if(a[j]>max)
                max=a[j];
            }
            st.push(max);
        }
        while(st.size()>0)
        {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
