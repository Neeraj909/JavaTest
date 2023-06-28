package java8features;

public class CircularList {
   static class Node{
       int data;
       Node next;
   }
   static Node newNode(int data){
       Node temp=new Node();
       temp.data=data;
       temp.next=null;
       return temp;

   }

    public static void main(String[] args) {
        Node head=newNode(1);
        head.next=newNode(2);
        head.next.next=newNode(3);
        head.next.next.next=newNode(4);
        head.next.next.next=head;
        System.out.println(isCircular(head));
    }
    public static boolean isCircular(Node head){
       boolean flag=false;
       Node first=head;
       Node second=head;
       if(head==null){
           flag= false;
       }
       while(first!=null && first.next!=null && second.next!=null && second.next.next!=null){
           first=first.next;
           second=second.next.next;
           if(first.hashCode() == second.hashCode()){
               flag= true;
               break;
           }
       }
       return flag;
    }
}
