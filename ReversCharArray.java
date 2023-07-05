package java8features;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversCharArray {
    public static void main(String[] args) {

    String str="ababab";
    char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
    int left=0;
    int right=ch.length-1;

    while(left<=right){

   char temp=ch[right];
   ch[right]=ch[left];
   ch[left]=temp;
        left++;
        right--;
    }
    System.out.println(Arrays.toString(ch));

    }


}
