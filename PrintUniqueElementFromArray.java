package java8features;

import java.util.Arrays;

public class PrintUniqueElementFromArray {
    public static void main(String[] args) {
        int inputArray[]={1,1,2,3,2,4,2,5,1};
        int size= inputArray.length-1;

        for(int i=0;i<size;i++){
            int count=0;
            for(int j=i+1;j<size;j++){
                if(inputArray[i]==inputArray[j]){
                    inputArray[j]=inputArray[size];
                    size--;
                    count++;
                    j--;
                }
            }
            if(count==0){
               System.out.println(inputArray[i]);
            }
        }
    }
}
