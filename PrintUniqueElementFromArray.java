package java8features;

import java.util.Arrays;

public class PrintUniqueElementFromArray {
    public static void main(String[] args) {
        int inputArray[]={1,1,2,3,2,4,2,5,1,1,2,3,4,4,4,5,5,5,6,6,6,9};
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
        int inputArray1[]={1,1,2,3,2,4,2,5,1,1,2,3,4,4,4,5,5,5,6,6,6,9};
        size=inputArray1.length-1;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(inputArray1[i]==inputArray1[j]){
                    inputArray1[j]=inputArray1[size];
                    size--;
                    j--;
                }
            }
        }
        System.out.println("remove duplicate");
        for(int i=0;i<size;i++){
            System.out.println(inputArray1[i]);
        }
    }
}
