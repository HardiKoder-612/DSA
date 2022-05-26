package ArraysIntro;// Java program to rotate an array by
// d elements

import java.util.Scanner;

class RotateArray {
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        RotateArray rotate = new RotateArray();
        int size=sc.nextInt();
        int d=sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        rotate.leftRotate(arr,d,size);
        rotate.printArray(arr,size);
    }
}

// This code has been contributed by Mayank Jaiswal
