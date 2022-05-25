package Queue;
//rear =addition
//front=delete
//enqueue=represent insertion
//dequeue=represent deletion
//Following code is a concept of circular queue
/*
At first, front and rear both will be at first index,
but after adding an element we increment rear and when we delete an element we decrement the front
 */
public class Queue {
    int queue[]=new int[5];
    int size=0;
    int front;
    int rear;

    public void enqueue(int data)
    {
        if(!isFull())
        {
            queue[rear]=data;
            rear=(rear+1)%5;
            size+=1;
        }
        else
            System.out.println("Queue if full");
    }

    public int dequeue()
    {
        int data=queue[front];
        if(!isEmpty())
        {
            front=(front+1)%5;          //5 is queue size
            size--;
        }
        else
            System.out.println("Queue is empty");
        return data;
    }

    public void show()
    {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println("\n");
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return getSize()==0;
    }

    public boolean isFull()
    {
        return getSize()==5;
    }
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enqueue(2);
        obj.enqueue(43);
        obj.enqueue(12);
        obj.enqueue(1);
        obj.enqueue(5);
        obj.show();
        obj.dequeue();
        obj.show();
        obj.dequeue();
        obj.show();
        obj.enqueue(11);
        obj.enqueue(55);
        obj.show();
        System.out.println(obj.getSize());
        System.out.println(obj.isEmpty());
    }
}
