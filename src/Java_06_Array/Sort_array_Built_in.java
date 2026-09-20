package Java_06_Array;

import java.util.Arrays;

public class Sort_array_Built_in {
    static void main(String[] args) {
        int[] arr={20,16,30,10,18,12};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] x){
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
}
