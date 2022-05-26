package StackPractice;

import java.util.*;
import java.lang.*;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        String str=sc.next();
        Stack<Character> stk=new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch==')')
            {
                if(stk.peek()=='(')
                    flag=1;
                else
                {
                    while(stk.peek()!='(')
                        stk.pop();
                }
            }
            else
            {
                stk.push(ch);
            }
        }
        if(flag==1)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
