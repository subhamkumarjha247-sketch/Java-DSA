package Java_06_Array;

import java.util.Scanner;

public class Search_in_array {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of X :");
        int x=sc.nextInt();
        boolean found=false;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.print("target exist at index : "+" "+i);
                found=true;
                break;
            }
        }
        if (found == true) {
            System.out.print("\tYes target exist");
        }
        else{
            System.out.println("Not target missing");
        }

    }
}
