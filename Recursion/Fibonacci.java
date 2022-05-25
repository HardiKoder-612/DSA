package Recursion;

public class Fibonacci {
    public int result(int n)
    {
        if(n<2)
            return n;
        else
        {
            return result(n-1)+result(n-2);
        }

    }
    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        System.out.println(obj.result(3));
    }
}
