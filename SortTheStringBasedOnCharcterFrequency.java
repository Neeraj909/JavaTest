package java8features;

import java.util.*;

public class SortTheStringBasedOnCharcterFrequency {
    public static void main(String[] args) {
        String str = "jfksnlpsjflsjj";
        //jjjjsssffllpkn
        sortString(str);
    }
    public static void sortString(String str){
        int n=str.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        List<Map.Entry<Character,Integer>> sortChar =new ArrayList<>(map.entrySet());
        Collections.sort(sortChar, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o1.getValue() == o1.getValue()? o2.getValue()- o1.getValue():o2.getKey()-o1.getKey());
            }
        });
        for(Map.Entry<Character,Integer> entry:sortChar){
            for(int j=0;j<entry.getValue();j++){
                System.out.print(entry.getKey());
            }
        }

    }
}
