package java8features;

public class LinkedList {
    public void getHead() {
        System.out.println("Head   ->"+head.data);
    }

    public void getTail() {
        System.out.println("Tail   ->"+tail.data);
    }

    public void getLength() {
        System.out.println("length   ->"+length);
    }

    private Node head;
    private Node tail;
    private int length;

    static class Node{
        Node next;
        int data;
        public Node(int data){
           this.data=data;
        }

    }
    public LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;

    }
    public void printList(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
   public void appendDataInList(int data){
        Node node=new Node(data);
        if(length==0){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        length++;
   }
   public Node removeLast(){
        Node temp=head;
        Node pre=head;
        if(temp.next==null){
            return null;
        }
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;

        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
    return temp;

   }
   public void prePendList(int data){
      Node newNode=new Node(data);
        if(length==0){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        length++;
   }
   public Node removeFirst(){
       Node temp=head;
        if(length==0){
            head=null;
            tail=null;
        }
        else{
             temp=head;
            head=head.next;
            temp.next=null;
            length--;
        }
        return temp;

   }
   public Node reversList(){
        Node temp=head;
        Node prev=tail;
        return temp;

   }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList(1);
        linkedList.printList();
        System.out.println();
        linkedList.appendDataInList(2);
        linkedList.printList();
        System.out.println(linkedList.removeLast().data);
        System.out.println(linkedList.removeLast());
        linkedList.prePendList(3);
        linkedList.printList();
        System.out.println(linkedList.removeFirst().data);
        linkedList.appendDataInList(4);
        linkedList.appendDataInList(5);
        linkedList.printList();
        linkedList.appendDataInList(8);
        linkedList.appendDataInList(9);
        linkedList.printList();
    }
}
