package LinearSearch;
import java.util.Scanner;
public class SearchInString {
    public static boolean search(String str,char ch)
    {
        int flag=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="This is a JAVA Program";
        System.out.println("Enter character to be searched");
        char ch='T';
        boolean ans=search(str,ch);
        if (ans)
            System.out.println("Element found");
        else
            System.out.println("Element not found");



    }
}
