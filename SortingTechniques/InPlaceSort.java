package SortingTechniques;

class InPlaceSort
{
    /* Function to reverse arr[]
    from start to end*/
    public static void reverseArray(int []arr, int n)
    {
        // Create a copy array
        // and store reversed
        // elements
        int []rev = new int[n];
        for (int i = 0; i < n; i++)
            rev[n - i - 1] = arr[i];

        // Now copy reversed
        // elements back to arr[]
        System.arraycopy(rev, 0, arr, 0, n);
    }

    /* Utility function to
    print an array */
    public static void printArray(int []arr,
                                  int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        printArray(arr, n);
        reverseArray(arr, n);
        System.out.println("Reversed array is");
        printArray(arr, n);
    }
}

