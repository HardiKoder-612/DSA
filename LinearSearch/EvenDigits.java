package LinearSearch;

public class EvenDigits {
    public static int findNumbers(int num[]) {
        int ans=0;
        for (int i = 0; i < num.length; i++) {
            int count=0;
            while(num[i]!=0)
            {
                count++;
                num[i]/=10;
            }
            if(count%2==0)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
    int nums[]={12,345,2,6,7689};
    int ans=findNumbers(nums);
        System.out.println(ans);
    }
}

