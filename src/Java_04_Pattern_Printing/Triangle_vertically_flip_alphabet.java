package Java_04_Pattern_Printing;

import java.util.Scanner;

public class Triangle_vertically_flip_alphabet {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<n+1-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
