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

    public static void mergeTwoSortArray(int[] arr1,int[] arr2){
        int[] mergeArray=new int[arr1.length+arr2.length];
        int index=0;
        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergeArray[index]=arr1[i];
                index++;
                i++;
            }
            else{
                mergeArray[index]=arr2[j];
                index++;
                j++;
            }
        }
        while (i<arr1.length){
            mergeArray[index]=arr1[i];
            index++;
            i++;
        }
        while (j<arr2.length){
            mergeArray[index]=arr2[j];
            index++;
            j++;
        }
        System.out.println("Merge Two Sort Array "+Arrays.toString(mergeArray));

    }
    public int[] mergeSort(int[] arr){
        int midIndex=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,midIndex));
        int[] right=mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));
       return left;
    }

    public static void quickSort(int[] arr){

        int pivot=arr[0];

    }
    public static int pivot(int[] arr,int pivotIndex,int endIndex){
        int swapIndex=pivotIndex;
        for(int i=pivotIndex+1;i<endIndex;i++){
            if(arr[i]<arr[pivotIndex]){
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr,pivotIndex,swapIndex);
        return swapIndex;
    }
    private static void swap(int[] arr,int firstIndex,int secondIndex){
        int temp=arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=temp;
    }
    public static void main(String[] args) {
        int[] arr ={2,1,4,9,0,5,6,3};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        int[] arr1={1,3,5,8};
        int[] arr2={2,4,6,9};
        mergeTwoSortArray(arr1,arr2);
        arr = new int[]{2, 1, 4, 9, 0, 5, 6, 3};
        int returnIndex=pivot(arr,0,arr.length);
        System.out.println(returnIndex);
        System.out.println(Arrays.toString(arr));

    }
}
