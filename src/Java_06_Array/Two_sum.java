package Java_06_Array;

import java.util.Scanner;

public class Two_sum {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int x=sc.nextInt();

        boolean present = false;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==x){
                    System.out.print("Sum is present at index : "+" "+i +" "+ i+1);
                    present = true;
                    break;
                }
            }
            System.out.println();
        }
        if(present){
            System.out.print("two sum is exist");
        }
        else{
            System.out.print("two sum doesn't exist");
        }
    }
}
