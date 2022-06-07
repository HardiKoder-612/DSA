package StackPractice;

import java.util.*;
import java.lang.*;

public class BalancedDuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        String str=sc.next();
        Stack<Character> stk=new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch==')')
                {
                    if(stk.size()==0)
                    {
                        System.out.println(false);
                        return;
                    } else if (stk.peek()!='(') {
                        System.out.println(false);
                        return;
                    }
                    else
                    {
                        stk.pop();
                        System.out.println(true);
                        return;
                    }
                }
            else if(ch=='}')
                {
                    if(stk.size()==0)
                    {
                        System.out.println(false);
                        return;
                    } else if (stk.peek()!='{') {
                        System.out.println(false);
                        return;
                    }
                    else
                    {
                        stk.pop();
                        System.out.println(true);
                        return;
                    }
                }
            else if(ch==']')
                {
                    if(stk.size()==0)
                    {
                        System.out.println(false);
                        return;
                    } else if (stk.peek()!='[') {
                        System.out.println(false);
                        return;
                    }
                    else
                    {
                        stk.pop();
                        System.out.println(true);
                        return;
                    }
                }
            else if(ch=='('||ch=='{'||ch=='[')
            {
                stk.push(ch);
            }
        }
    }
}
//[(a+b)+{(c+d)*(e/f)]}
