package LinkedList;

public class LinkedList {
    static Node head;                  //it can be taken from Node.java file of same package, you can also make nested classes like below
    public class Node {
        int data;
        Node next;          //reference for next node

    }
    void insert(int data) {                     //Will insert at the last od the list
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }

    public void search(int key)
    {
        Node n=head;
        int count=1,flag=0;
        while (n.next!=null)
        {
            if(n.data==key)
            {
                flag=1;
                System.out.println("Element found at "+(count)+" node.");
                break;
            }
            else
            {
                n=n.next;
                count++;
            }
        }
        if (flag==0)
            System.out.println("Element not found. ");
    }

    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println(node.data+" ");
    }
    void InsertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }

    void InsertAtAnyLocation(int index,int data)
    {
        if (index==0)
        {
            InsertAtStart(data);
        }
        else{
            Node node=new Node();
            node.data=data;
            node.next=null;
            Node n=head;   //for already written node
            for (int i = 0; i < index-1; i++) {
                n=n.next;
            }
            node.next=n.next;       //connects new node to the next node
            n.next=node;
        }
    }
    void deleteAt(int index){
        if(index==0)            //If element is the first
        {
            head= head.next;
        }
        else{
            Node n=new Node();
            for (int i = 0; i < index; i++) {
                n=n.next;
            }
            Node n1=new Node();
            n1=n.next;              //To temporary save the element to be deleted
            n.next=n1.next;         //Will link the address od previous node to the address of the node next to deleted node.
//            System.out.println();
            n1=null;                //to make it eligible for garbage collection
        }
    }
    public Node reverseList()
    {
        if(head==null)
            return head;

        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head = prev;
        return head;
    }
    public Node middleNode()
    {
        if (head==null)
        {
            return null;
        }
        Node slowptr=head;
        Node fastptr=head;
        while(fastptr!=null && fastptr.next!=null)
        {
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr;
    }
    public Node nodefromlast(int index)
    {
        Node ref=head;
        Node main=head;
        int count=0;
        while(count<index) {
            ref = ref.next;
            count++;
        }
        while (ref!=null)
        {
            ref=ref.next;
            main=main.next;
        }
        return main;
    }
    public int size(){
        int size=0;
        if(head==null)
            return 0;
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                size++;
                n=n.next;
            }
            return size;
        }
    }
    public void RemoveDuplicateFromList()
    {
        Node n= head;
        while(n!=null&&n.next!=null)
        {
            Node temp=n.next;
            if(n.data==temp.data)
            {
                n.next=n.next.next;
            }
            n=n.next;
        }
    }
    public void InsertInSortedList(int num)
    {
        Node n=head;
        Node newnode=new Node();
        newnode.data=num;
        newnode.next=null;
        Node temp=null;
        while(newnode.data>n.data && n!=null)
        {
            temp=n;
            n=n.next;
        }
       newnode.next=n;
        temp.next=newnode;
    }
     public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.insert(12);
        obj.insert(13);
        obj.insert(23);
        obj.insert(34);
        obj.insert(45);
        obj.insert(56);
        obj.insert(67);
        obj.insert(76);
        obj.insert(89);
//        obj.show();
//        obj.InsertAtStart(25);
//        obj.show();
//        obj.InsertAtAnyLocation(2,55);
//        obj.show();
//        obj.search(18);
//        System.out.println("Size of the node is: "+obj.size());
//        System.out.println("Middle node is: "+(obj.middleNode()).data);
//        System.out.println("2nd node from the last is: "+(obj.nodefromlast(2)).data);
//        obj.RemoveDuplicateFromList();
//        obj.show();
        obj.InsertInSortedList(25);
        obj.show();

    }
}
