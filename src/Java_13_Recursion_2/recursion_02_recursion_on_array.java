package Java_13_Recursion_2;

import java.util.Scanner;

public class recursion_02_recursion_on_array {
    static int subh(int[] arr, int idx) {
        if (idx==arr.length)
            return 0;
        System.out.print(arr[idx]+" ");

        subh(arr,idx+1);

        System.out.print(arr[idx]+" ");
        return 0;

    }

    static void main(String[] args) {
        int[] arr = {3, 2, 6, 4, 10, 23, 8, 5, 23, 1, 2};
        subh(arr, 0);
    }
}
