package Java_04_Pattern_Printing;

import java.util.Scanner;

public class floyds_triangle_two {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n=sc.nextInt();
        int k=1;
        for (int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(k+" ");
                k=k+2;
            }
            System.out.println();
        }
    }
}
