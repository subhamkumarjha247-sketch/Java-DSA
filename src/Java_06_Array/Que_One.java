package Java_06_Array;

import java.util.Scanner;

public class Que_One {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter the array element : ");
        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(10+arr[i]+" ");
            }
            else{
                System.out.print(2*arr[i]+" ");
            }
        }

    }
}
