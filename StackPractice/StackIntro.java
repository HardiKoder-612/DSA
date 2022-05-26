package StackPractice;
//Array Implementation
 class StackIntro {
    int stack[]=new int[5];             //Size of array is 5
    int top=-1;                         //!!!!!!! MUST MUST REMEMBER IT
    protected void push(int data)
    {
        if(size()>=5)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            stack[top]=data;
        }
    }
    protected void show()
    {
        if(isEmpty())
            System.out.println("Stack is empty");
        for (int i:stack)               //advanced for loop
        {
            System.out.println(i+ " ");
        }
    }
    protected int pop()                   // to delete the topmost element
    {
//        top--;                          //to shift the top to the last element(only done in static method)
        if(isEmpty())
            System.out.println("Stack is empty");
        int data=stack[top];            //data is like a temporary element representing topmost element
        stack[top]=0;
        top--;                          //changing the top to the second-last element
        return data;
    }
    protected int peek()                   // to delete the topmost element
    {
        if(isEmpty())
            System.out.println("Stack is empty");
        int data=stack[top];
        return data;
    }
    protected int size()
    {
        return top;
    }
    protected boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }

    protected static void main(String[] args) {
        StackIntro obj=new StackIntro();
        obj.push(15);
        obj.push(8);
        obj.push(9);
        obj.push(12);
        obj.push(10);
        obj.show();
        System.out.println("Pop= "+obj.pop());
        System.out.println("Peek= "+obj.peek());
        System.out.println("Size= "+obj.size()+1);
        System.out.println("Stack is empty? = "+obj.isEmpty());
    }
}
