package Java_04_Pattern_Printing;

import java.util.Scanner;

public class captial_small_square {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1; j<=n;j++) {
                if (i%2 == 1) {
                    System.out.print((char)(i+96) + " ");
                } else {
                    System.out.print((char) (i+64) + " ");
                }
            }
            System.out.println();
        }
    }
}
