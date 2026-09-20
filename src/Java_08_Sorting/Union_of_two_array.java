package Java_08_Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Union_of_two_array {
    static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void sort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void main(String[] args) {
        int[] arr_one={2,3,1,20,15,9,4,10};
        sort(arr_one);
        print(arr_one);
        int[] arr_two={4,1,17,31,9,2,0,8,6};
        sort(arr_two);
        print(arr_two);

        int a=arr_one.length;
        int b= arr_two.length;
        ArrayList<Integer> arr=new ArrayList<>();
        if (b>a) {
            for (int i = 0; i < a; i++) {
                for (int j=0;j<a;j++) {
                    if (arr_one[i] != arr_two[j]) {
                        arr.add(arr_one[i]);
                        arr.add(arr_two[j]);
                        break;
                    } else {
                        arr.add(arr_one[i]);
                        break;
                    }
                }
            }
            for (int i=a;i<b;i++){
                arr.add(arr_two[i]);
            }
        }
        else {
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b; j++) {
                    if (arr_one[i] != arr_two[j]) {
                        arr.add(arr_one[i]);
                        arr.add(arr_two[j]);
                        break;
                    } else {
                        arr.add(arr_one[i]);
                        break;
                    }
                }
            }
            for (int i = b; i < a; i++) {
                arr.add(arr_two[i]);
            }
        }
        Collections.sort(arr);
        System.out.print(arr);
    }
}
