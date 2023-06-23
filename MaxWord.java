package java8features;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWord
{
    public static void main(String[] args) {
        maxWordString("hey");
    }
    public static String maxWordString(String sentence){
        String maxWord="";
        if(sentence.split("\\s+").length>=2){
            Map<String,Integer> wordMap=new HashMap<>();
            for(int i=0;i<sentence.split(" ").length;i++){
                wordMap.put(sentence.split(" ")[i],sentence.split(" ")[i].length());
            }
            int maxWord1 =
                    Collections.max(wordMap.entrySet(), Map.Entry.comparingByValue()).getValue();
        }
        else{
            maxWord=sentence ;
        }
        return maxWord;
    }
}
