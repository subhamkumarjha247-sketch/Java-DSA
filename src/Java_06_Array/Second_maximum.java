package Java_06_Array;

import java.util.Scanner;

public class Second_maximum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secmax=Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>secmax && arr[j]<max){
                secmax=arr[j];
            }
        }
        System.out.print(secmax);
    }
}
