package Java_06_Array;

import java.util.Scanner;

public class product_of_array {
    static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int a=1;
        System.out.print("Array element is :");
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
            a*=arr[i];
        }
        System.out.println("Multiple is : "+" "+a);
    }
}
