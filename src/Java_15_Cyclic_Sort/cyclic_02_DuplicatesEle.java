package Java_15_Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class cyclic_02_DuplicatesEle {
    static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        print(arr);
        System.out.println();
        duplicateEle(arr);
        print(arr);

    }

    static void duplicateEle(int[] arr) {
        List<Integer> brr=new ArrayList<>();
        int n=arr.length;
        int i=0;
        while(i<arr.length){
            int idx=arr[i]-1;
            if (arr[i]==i+1 || arr[i]==arr[idx]){
                i++;
            }
            else{
                swap(arr,i,idx);
            }
        }
        for (int j=0;j< arr.length;j++){
            if (arr[j]!=j+1){
                brr.add(arr[j]);
            }
        }
        System.out.println(brr);
    }

    static void swap(int[] arr,int i,int idx) {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }

    static void print(int[] arr) {
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
