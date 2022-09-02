# DSA in JAVA
## Practice questions
    Q1. What is meant by static and dynamic data structure?
        Ans. In the stataic data structue the size of the data structure we are using is fixef. The contents of this data structure can be modified but without changing the size/memory alloted to it during the compile-time only, not in run-time.
        
        In dynamic data structure, the size is not fixed. We can change the contents of data structure during run-time and size will also change.
***********************************************************
    Q2. Difference between AVL Tree and B-Tree
    Ans. 
    An AVL tree is a self-balancing binary search tree, balanced to maintain O(log n) height.

    A B-tree is a balanced tree, but it is not a binary tree. Nodes have more children, which increases per-node search time but decreases the number of nodes the search needs to visit. This makes them good for disk-based trees. 

***
    Q3. WHat are the objecrives of studying data structures?
    Ans. Data structures and algorithms (DSA) goes through solutions to standard problems in detail and gives you an insight into how efficient it is to use each one of them. It also teaches you the science of evaluating the efficiency of an algorithm. This enables you to choose the best of various choices.
***
    Q4. What is recursion and its advantages and disadvantages?
    Ans. Method of solving a computational problem where the problem depends upon its smaller sub-problems.
    
    *Advantages*    
    1. RecursionPractice adds clarity and (sometimes) reduces the time needed to write and debug code (but doesn't necessarily reduce space requirements or speed of execution).
    2. Reduces time complexity.
    3. Performs better in solving problems based on tree structures.

    *Disadvantages*
    1. It is usually slower due to the overhead of maintaining the stack.
    2. It usually uses more memory for the stack.
***
    Q5. What is circular linked list and its uses?
    Ans. Linked which never ends i.e. whose last node pointer pointes to the first node's address.
    Uses
    1. Useful for implementation of queue.
    2. Circular lists are useful in applications to repeatedly go around the list.
    3. Circular Doubly Linked Lists are used for implementation of advanced data structures like Fibonacci Heap.
***
    Q6. Condition to check whether a tree is empty or full
    Ans.
        if root==NULL
        if root->left==NULL and root->right==NULL
***
    Q7. What is Heap? How they are stored in memory.
    Ans. Heap is tree based data strutures having two types:-
    1. Max Heap: In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
    2. Min Heap: In a Min-Heap the key present at parent node must be smaller than its child nodes . This property must be recursively true for all sub-trees.
*** 
    Q8. What is Hashing and Rehashing?
    Ans. In hashing there is a hash function that maps keys to some values. But these hashing function may lead to collision that is two or more keys are mapped to same value.
        
    Rehashing is a technique that dynamically expands the size of the Map, Array, and Hashtable to maintain the get and put operation complexity of O(1).

    It can be also defined as rehashing is the process of re-calculating the hash code of already stored entries and moving them to a bigger size hash map when the number of elements in the map reaches the maximum threshold value.
    In simple words, rehashing is the reverse of hashing process. It retains the performance. In rehashing, the load factor plays a vital role.
***
    Q9. What are priority queues?
    Ans. Priority Queue is an abstract data type that is similar to a queue, and every element has some priority value associated with it. 
    The priority of the elements in a priority queue determines the order in which elements are served (i.e., the order in which they are removed). If in any case the elements have same priority, they are served as per their ordering in the queue.
***
    Q10. Define linear and non-linear data structures?
    Ans. 
    *Linear*
    It is an abstract data type that is similar to a queue, and every element has some priority value associated with it. 
    The priority of the elements in a priority queue determines the order in which elements are served (i.e., the order in which they are removed). 
    If in any case the elements have same priority, they are served as per their ordering in the queue.

    *Non Linear*

    Data structures where data elements are not arranged sequentially or linearly are called non-linear data structures. 
    In a non-linear data structure, single level is not involved. Therefore, we can’t traverse all the elements in single run only. Non-linear data structures are not easy to implement in comparison to linear data structure. It utilizes computer memory efficiently in comparison to a linear data structure. Its examples are trees and graphs.  
***
    Q11. Different ways of traversing a tree? Write algorithm to print sorted tree 
    Ans. There 3 ways of traversing a treeinorder,preorder, postorder
    Sorted tree order is inorder:
    
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.key + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
***
    Q12. Difference between array and linked list.
    What is an array?
    An array is a data structure that contains the elements of the same type. A data structure is a way of organizing the data; an array is a data structure because it sequentially organizes the data. An array is a big chunk of memory in which memory is divided into small-small blocks, and each block is capable of storing some value.
    
    What is linked list?
    A linked list is the collection of nodes that are randomly stored. Each node consists of two fields, i.e., data and link. Here, data is the value stored at that particular node, and the link is the pointer that holds the address of the next node.
    We cannot say which data structure is better, i.e., array or linked list. There can be a possibility that one data structure is better for one kind of requirement, while the other data structure is better for another kind of requirement. There are various factors like what are the frequent operations performed on the data structure or the size of the data, and other factors also on which basis the data structure is selected. Now we will see some differences between the array and the linked list based on some parameters.
    Suppose we have created an array that consists of 10 values, then each block will store the value of an integer type. If we try to store the value in an array of different types, then it is not a correct array and will throw a compile-time error.
***
    Q13. Why use stack with linked list over arrays?
    Ans. Because a singly-linked list supports O(1) time prepend and delete-first, the cost to push or pop into a linked-list-backed stack is also O(1) worst-case. However, each new element added requires a new allocation, and allocations can be expensive compared to other operations.
***
    Q14. What is Graphs? Discuss various methods used to represent graph in memory.
    Ans. A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph. 
    More formally a Graph can be defined as,
    "A Graph consists of a finite set of vertices(or nodes) and set of Edges which connect a pair of nodes."
    
    There are two ways to store Graphs into the computer's memory:

    1. Sequential representation (or, Adjacency matrix representation)
    2. Linked list representation (or, Adjacency list representation)
    In sequential representation, an adjacency matrix is used to store the graph. Whereas in linked list representation, there is a use of an adjacency list to store the graph.
***

    