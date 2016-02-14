package codinginterview.stackqueues;

/**
 * Queue Implementation using Linked List
 */
public class Queue {
    private Node front;
    private Node back;

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (back == null) {
            front = newNode;
            back = newNode;
            return;
        }
        back.next = newNode;
        back =  newNode;
    }

    public Node dequeue(){
        if(front == null)
            throw new RuntimeException("Queue is empty");
        Node toReturn = front;
        front = front.next;
        return toReturn;
    }
}

