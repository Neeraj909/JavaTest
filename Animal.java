package java8features;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Animal {
    public static void main(String[] args) {
     int number=-1234324420;
     //321
        int revres=0;
        while(number!=0){
            int digit=number%10;
            if(revres==0 && digit==0){
                number =number/10;
                continue;
            }
                revres=revres*10+digit;
                number =number/10;
        }
        if(Integer.MAX_VALUE>=revres && Integer.MIN_VALUE<=revres)
        System.out.println(revres);
    }
}
