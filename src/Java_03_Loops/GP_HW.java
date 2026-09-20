package Java_03_Loops;

import java.util.Scanner;

public class GP_HW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for(int j=n; j>=1; j--){
                System.out.print(i+" ");
                System.out.print(j+" ");
                i++;
            }
        }
    }
}
