package Java_04_Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int nsp=1;
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            for (int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for (int x = 1; x <=n+1-i; x++){
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }
    }

}
