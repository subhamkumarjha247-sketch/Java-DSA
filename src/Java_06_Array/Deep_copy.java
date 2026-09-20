package Java_06_Array;

import java.util.Arrays;
//import java.util.Scanner;

public class Deep_copy {
    static void main(String[] args) {
        int[] arr = {10,30,40,20,50};
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[1]=100;
        System.out.println(arr[1]);
        System.out.println(deep[1]);
    }
}
