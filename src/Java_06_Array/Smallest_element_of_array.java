package Java_06_Array;

import java.util.Scanner;

public class Smallest_element_of_array {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int a = Integer.MAX_VALUE;
        for (int i=1;i<arr.length;i++){
            if(a>arr[i]){
                a=arr[i];
            }
        }
        System.out.print(a+" ");
    }
}
