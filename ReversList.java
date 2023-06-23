package java8features;

import java.util.ArrayList;
import java.util.List;

public class ReversList {
    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        list.add('A');  list.add('B');  list.add('C');  list.add('D');  list.add('E');
        System.out.println("Before Revers"+list);
        int j=list.size()-1;
        for(int i=0;i<j;i++){
            char temp=list.get(j);
            list.set(j,list.get(i));
            list.set(i,temp);
            j--;
        }
        System.out.println("After Revers"+list);
    }
}
