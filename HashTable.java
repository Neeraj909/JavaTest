package java8features;

import java.util.ArrayList;

public class HashTable {
    private int size=7;
    private Node[] dataMap;

    public HashTable(){
        dataMap=new Node[size];
    }
    class Node{
        String key;
        int value;
        Node next;
        Node(String key,int value){
            this.key=key;
            this.value=value;
        }

    }
    public void printTable(){
        for(int i=0;i<dataMap.length;i++){
            System.out.println(i+ ":");
            Node temp=dataMap[i];
            while(temp!=null){
                System.out.println(" {"+temp.key+" = "+temp.value+" }");
                temp=temp.next;
            }
        }
    }
    public void set(String key,int value){
        Node newNode=new Node(key,value);
        int index=has(key);
        if(dataMap[index]==null){
            dataMap[index]=newNode;
        }
        else{
            Node temp=dataMap[index];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    private int has(String key) {
        int hash=0;
        char ch[]=key.toCharArray();
        for(int i=0;i<ch.length;i++){
           int asciiValue=ch[i];
           hash=(hash+asciiValue*23)%dataMap.length;
        }
        return hash;
    }
public int get(String key){
        int insdx=has(key);
        Node temp= dataMap[insdx];
        while (temp!=null){
            if(temp.key==key){
                return temp.value;
            }
            temp=temp.next;
        }
        return 0;

}
public ArrayList<String> getKey(int value){
        ArrayList<String> allKeys=new ArrayList<>();
        for(int i=0;i<dataMap.length;i++){
            Node temp=dataMap[i];
            while(temp!=null){
                if(temp.value==value){
                    allKeys.add(temp.key);

                }
                temp=temp.next;
            }
        }
    return allKeys;

}
    public static void main(String[] args) {
        HashTable hashTable=new HashTable();
        hashTable.set("neeraj",1);
        hashTable.set("neeraj",1);
        hashTable.set("neeraj",1);
        hashTable.set("neeraj",1);hashTable.set("neeraj",1);

        hashTable.set("java",2);
        hashTable.printTable();
        System.out.println(hashTable.getKey(1).size());

    }

}
