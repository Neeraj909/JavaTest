package java8features;

public class Stack {
    private Node top;
    private int length;

    static class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }

    }

    public Stack(int value) {
        top = new Node(value);
        length = 1;
    }
    public void printStack(){
        Node temp=top;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void push(int value){
        Node newNode=new Node(value);
        if(length==0){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
            length++;
        }
    }
    public Node pop(){
        Node temp=top;
        if(length==0){
            return null;
        }
        if(length==1){
            temp=null;
        }
        else{
            top=temp.next;
            temp.next=null;

        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        Stack stack=new Stack(1);
        stack.printStack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        System.out.println(stack.pop().value);
        stack.printStack();
        System.out.println(stack.pop().value);
        stack.printStack();



    }
}
