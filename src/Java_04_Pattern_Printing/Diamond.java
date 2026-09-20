package Java_04_Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<n+1-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int p=1; p<=n-1;p++){
            for (int q=1; q<=p; q++){
                System.out.print("  ");
            }
            for (int r=1;r<=(2*n -1)-2*p;r++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
