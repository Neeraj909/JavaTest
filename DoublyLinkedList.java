package java8features;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node{
        Node next;
        Node pre;

        int value;
        Node(int value){
            this.value=value;
        }

    }
    public DoublyLinkedList(int value){
             Node newNode=new Node(value);
             head=newNode;
             tail=newNode;
             length=1;

    }
    public void printList(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
    }
public void appendList(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
        }
}
public Node removeFirstNode(){
        Node temp=tail;
        if(length==0){
            return null;
        }
    if (length==1){
        head=null;
        tail=null;
    }
    else {
        temp = tail.pre;
        tail = tail.pre;
        tail.next = null;
        temp.pre = null;
    }
        length--;

        return temp;


}

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList(1);
        doublyLinkedList.printList();
        doublyLinkedList.appendList(2);
        doublyLinkedList.printList();


    }
}
