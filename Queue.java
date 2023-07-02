package java8features;

public class Queue {
    private Node top;
    private Node end;
    private int length;
    public Queue(int value){
        Node newNode=new Node(value);
        top=newNode;
        end=newNode;
        length=1;

    }
    static class Node{
        Node next;
        int value;
        Node(int value){
            this.value=value;

        }

    }
    public void printQueue(){
        Node temp=top;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void enqueue(int value){
        Node newNode=new Node(value);
        if(length==0){
            top=newNode;
            end=newNode;
        }
        else{
           end.next=newNode;
           end=newNode;
           length++;
        }
    }
    public Node deQueue(){
        Node temp=top;
        if(length==0){
            top=null;
            end=null;
        }
        else{

           top=top.next;
           temp.next=null;
        }
        length--;
        return temp;
    }
    public static void main(String[] args) {
        Queue queue=new Queue(1);
        queue.printQueue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.printQueue();
        System.out.println(queue.deQueue().value);
        queue.printQueue();

    }
}
