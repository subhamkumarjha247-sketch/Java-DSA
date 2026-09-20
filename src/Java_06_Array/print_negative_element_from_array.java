package Java_06_Array;

import java.util.Scanner;

public class print_negative_element_from_array {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for (int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i]<0)
                 System.out.print(arr[i]+" ");
            else
                System.out.print("");
        }
    }
}
