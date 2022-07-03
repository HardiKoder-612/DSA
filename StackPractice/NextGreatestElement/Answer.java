package StackPractice.NextGreatestElement;

import java.util.*;
import java.lang.*;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int nextgreaterelement[]=new int[arr.length];
        nextgreaterelement[arr.length-1]=-1;
        st.push(nextgreaterelement[arr[arr.length-1]]);
        for (int i = arr.length-2; i >=0 ; i--) {
            while(st.size()>0 && arr[i]>=st.peek())
            {
                st.pop();
            }
            if(st.size()==0)
            {
                nextgreaterelement[i]=st.peek();
            }
            else
                nextgreaterelement[i]=-1;
            st.push(arr[i]);
        }
    }
}
