package Java_06_Array;

import java.util.Scanner;

public class reverse_of_array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length/2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length -1 -i];
                    arr[arr.length-1-i] = temp;
        }
        System.out.println("\nReverse Array : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
