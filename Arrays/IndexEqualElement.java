package Arrays;

public class IndexEqualElement {
    public static void main(String[] args) {
        int arr[]={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        for (int i = 0; i < arr.length; i++) {
                int temp;
                int flag=0;
                if(arr[i]==i)
                {
                    flag=1;
                }
                else
                {
                    temp=arr[i];
                    for (int j = 0; j < arr.length; j++) {
                        if(i==arr[j])
                        {
                            flag=1;
                            int t1=arr[i];
                            arr[i]=arr[j];
                            arr[j]=t1;
                        }
                    }
                }
                if(flag==0)
                    arr[i]=-1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
