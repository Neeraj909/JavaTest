package java8features;

import java.util.Arrays;
import java.util.List;

public class Sort {


    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println("Bubble Sort Array "+Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mainIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mainIndex]){
                   mainIndex=j;
                }
            }
            if(i!=mainIndex){
                int temp=arr[i];
                arr[i]=arr[mainIndex];
                arr[mainIndex]=temp;
            }
        }
        System.out.println("Selection Sort Array "+Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
          int temp=arr[i];
          int j=i-1;
          while(arr[j]>temp && j>0){
              arr[j+1]=arr[j];
              arr[j]=temp;
              j--;
          }
        }
        System.out.println("Insertion Sort Array "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr ={2,1,4,9,0,5,6,3};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }
}
