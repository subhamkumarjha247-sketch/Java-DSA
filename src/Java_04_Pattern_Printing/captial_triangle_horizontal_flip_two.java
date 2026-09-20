package Java_04_Pattern_Printing;

import java.util.Scanner;

public class captial_triangle_horizontal_flip_two {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n +1 - i; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
