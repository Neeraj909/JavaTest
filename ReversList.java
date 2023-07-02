package java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

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
        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("b",2);
        map.put("c",1);
        map.put("a",3);
        System.out.println(map);
    }
}
