package Stack;
//Dynamic array is expandable as well as shrinkable
public class Dynamic_Stack {
    int capacity=2;         //we will increase it two times as we add elements
    int stack[]=new int[capacity];             //Size of array is 5
    int top=-1;                         //!!!!!!! MUST MUST REMEMBER IT
    public void push(int data)
    {
        if((size()+1)==capacity)            //if size is full then call the expand function to increase the size
            expand();
        top++;
        stack[top]=data;
    }
    private void expand()
    {
        int length=size()+1;
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);      // !!!!!!!!!!!! In-built Function (from where,where index,to where, at index,how much)
        stack=newStack;                 //Change the reference
        capacity=capacity*2;
    }
    public void show()
    {
        System.out.println("\n");
        if(isEmpty())
            System.out.println("Stack is empty");
        for (int i:stack)               //advanced for loop
        {
            System.out.print(i+ " ");
        }
    }
    public int pop()                   // to delete the topmost element
    {
        int data=0;
//        top--;                          //to shift the top to the last element(only done in static method)
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            data=stack[top];            //data is like a temporary element representing topmost element
            stack[top]=0;
            top--;              //changing the top to the second-last element
            shrink();
        }
        return data;
    }
    public void shrink()
    {
        int length = size();
        if (length<=((capacity/2)/2))
        {
            capacity=capacity/2;
        }
        int newStack[]=new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);      // !!!!!!!!!!!! In-built Function (from where,where index,to where, at index,how much)
        stack=newStack;                 //Change the reference
    }
    public int peek()                   // to delete the topmost element
    {
        if(isEmpty())
            System.out.println("Stack is empty");
        int data=stack[top];
        return data;
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Dynamic_Stack obj=new Dynamic_Stack();
        obj.push(15);
        obj.show();
        obj.push(8);
        obj.show();
        obj.push(9);
        obj.show();
        obj.push(12);
        obj.show();
        obj.push(10);
        obj.show();
        obj.pop();
        obj.show();
        obj.pop();
        obj.show();
        obj.pop();
        obj.show();
    }
}
