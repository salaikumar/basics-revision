package codinginterview.stackqueues;

/**
 * Stack Implementation in java
 */

/*
 * Node Class
 */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

/*
 * Stack using Linked List
 */
public class Stack {

    private Node top;

    public void push(int value){
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public Node pop(){
        if (top == null)
            throw  new RuntimeException("Stack is empty");
        Node toReturn = top;
        top = top.next;
        return toReturn;
    }

    public Node  peek(){
        if (top == null)
            throw  new RuntimeException("Stack is empty");
        return top;
    }
}
